package cn.wangdpwin.spiTest.limiter;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: wangdongpeng
 * @Date: 2019/6/16 下午9:17
 * @Description
 * @Version 1.0
 */
public class App{

//    RateLimiter rateLimiter = RateLimiter.create(10);
//
//    public void doPay(String name) {
//        if (rateLimiter.tryAcquire()) {
//            System.out.println(name + "支付成功");
//        } else {
//            System.out.println(name + "支付失败请求繁忙，请稍后重试");
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        APP app = new APP();
//        CountDownLatch countDownLatch = new CountDownLatch(1);
//        Random random = new Random(10);
//        for (int i = 0; i < 20; i++) {
//            final int fi = i;
//            Thread t = new Thread(() -> {
//                try {
//                    countDownLatch.await();
//                    Thread.sleep(random.nextInt(1000));
//                    app.doPay("Thread-" + fi + "");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//            t.start();
//        }
//
//        countDownLatch.countDown();
//
//
//    }
}
