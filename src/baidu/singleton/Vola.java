package baidu.singleton;

/**
 * Created by Administrator on 2017/2/19.
 */
public class Vola {

    //该变量声明为volatile（不稳定的）即可，这就指示JVM，这个变量是不稳定的，每次使用它都到主存中进行读取。
    public volatile int count = 0;

    public void add() throws InterruptedException {
        Thread.sleep(1);
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        final Vola vola = new Vola();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        vola.add();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        // 结果并不是1000
        System.out.println(vola.count);
    }

}
