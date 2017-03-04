package baidu.temp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by langshiquan on 17/2/28.
 */
public class Temp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        StringBuilder stringBuilder = new StringBuilder();

        ExecutorService pool = Executors.newCachedThreadPool();


        Future future = pool.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        while (future.isDone()){
            System.out.println("done");
        }
        System.out.println(future.isDone());
    }
}
