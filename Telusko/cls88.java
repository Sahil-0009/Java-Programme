
// class A /* extends Thread */ implements Runnable {
//     public void run() {
//         for (int i = 1; i < 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B /* extends Thread */ implements Runnable {
//     public void run() {
//         for (int i = 1; i < 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class cls88 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i < 500; i++) {
                c.increment();
                // System.out.println("Hi");
                // try {
                // Thread.sleep(10);
                // } catch (Exception e) {
                // e.printStackTrace();
                // }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i < 500; i++) {
                c.increment();
                // System.out.println("Hello");
                // try {
                // Thread.sleep(10);
                // } catch (Exception e) {
                // e.printStackTrace();
                // }
            }
        };

        // A obj1 = new A();
        // B obj2 = new B();
        // try {
        // Thread.sleep(5);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // obj1.start();
        // obj2.start();
        System.out.println(c.count);

    }
}
