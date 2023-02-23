package JavaPract;

public class RunnableEx implements Runnable{

    public static void main(String[] args) {
        RunnableEx mt = new RunnableEx();
        Thread t =new Thread(mt);
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Numbers" + j);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("print numbers:" + i);
        }
    }
}
