package baidu.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2017/2/19.
 */
public class PerfClient {
    public static void main(String[] args) throws InterruptedException {

        // 时间戳
        long start = System.currentTimeMillis();

        // 同步辅助类,类似计算器的效果
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0;i< 100000 ;i++){
                        Object object = Singleton2.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        // 阻塞当前线程，直到计数器为0
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
