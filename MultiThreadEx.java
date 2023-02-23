package JavaPract;

public class MultiThreadEx extends Thread {
    public static void main(String[] args) throws InterruptedException {
//        MultiThreadEx mt = new MultiThreadEx();
//        mt.setName("Second Priority");
//        mt.setPriority(MIN_PRIORITY);
//        mt.start();
//
//        MultiThreadEx mt2 = new MultiThreadEx();
//        mt2.setName("First Priority");
//        mt2.setPriority(MAX_PRIORITY);
//        mt2.start();
        MultiThreadEx mt = new MultiThreadEx();
        mt.start();
//       mt.join();
        for (int j = 0; j < 10; j++) {
            System.out.println("Numbers" + j);

//            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
//        System.out.println("Execute "+Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {

                System.out.println("print numbers:" + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                }

            }
        }