package com.wufuqiang.concurrency;

import com.wufuqiang.concurrency.annotations.UnThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ author wufuqiang
 **/
@Slf4j
@UnThreadSafe
public class ConcurrencyTest {

    //请求总数
    public static int clientTotal = 5000;
    //同时并发执行线程数
    public static int threadTotal =  200;
    public static int count = 0;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Semaphore semaphore = new Semaphore(threadTotal);
        CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for ( int i = 0 ; i < clientTotal;i++){
            service.execute(()->{
                try {
                    semaphore.acquire();
                    add();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        log.info("count:{}",count);

    }

    private static void add(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count ++;
    }
}
