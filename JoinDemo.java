package JavaPract;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n,sum=0;
    public static void main(String[] args) throws InterruptedException {
//        long start = System.currentTimeMillis();
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        JoinDemo.n =sc.nextInt();
        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();
        System.out.println("Sum of "+jd.n+ " numbers are "+jd.sum);
//        long end = System.currentTimeMillis();
//        System.out.println("Time taken to process is "+(end-start)/1000+" Seconds.");

    }

    @Override
    public void run() {
        for (int i = 1; i <=n; i++) {
            sum+= i;
        }
    }
}
