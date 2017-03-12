package baidu.temp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //
        //        StringBuilder stringBuilder = new StringBuilder();
        //
        //        ExecutorService pool = Executors.newCachedThreadPool();
        //
        //        Future future = pool.submit(new Runnable() {
        //            @Override
        //            public void run() {
        //                try {
        //                    Thread.sleep(3000);
        //                } catch (InterruptedException e) {
        //                    e.printStackTrace();
        //                }
        //            }
        //        });
        //        while (future.isDone()) {
        //            System.out.println("done");
        //        }
        //        System.out.println(future.isDone());
        //
//        int[] nums = new int[] {2, 3, 4};
//        int target = 6;
//        int[] res = twoSum(nums, target);
//        for(int i :res){
//            System.out.println(i);
//        }
//        System.out.println(res);
//        long result = 10000000000l;
//        int i = (int)(result%10);
//        System.out.println(i);
//
//        BigInteger bigInteger = new BigInteger("12312312312312312");
//        BigInteger ten  = new BigInteger("10");
//        ten.add(ten);
//        BigInteger bigInteger1 = bigInteger.divide(ten);
//        bigInteger.mod(ten);
//        System.out.println(bigInteger);

        int ii = 1;
        System.out.println(ii+++ii);        // 2   ii = 2
//        System.out.println(ii);
        ii = 1;
        System.out.println((ii++)+ ++ii);  // 5  ii = 4
//        System.out.println(ii);
        ii = 1;
        System.out.println(ii+++(++ii));   // 11
        String str = "werqw";
        str.toCharArray();
        ArrayList l = new ArrayList();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }

            }
        }
        return null;
    }
}
