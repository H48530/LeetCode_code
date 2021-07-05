package 按序打印;

/**
 *
 */
public class Demo2 {
    private static int lastPrinted = 3;


    static class A extends Thread {
        @Override
        public void run() {
            while (true) {
                while (true) {
                    synchronized (Demo2.class) {
                        if (lastPrinted == 3) {
                            break;
                        }
                    }
                }
                System.out.println(1);
                lastPrinted = 1;
            }
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            while (true) {
                while (true) {
                    synchronized (Demo2.class) {
                        if (lastPrinted == 1) {
                            break;
                        }
                    }
                }
                System.out.println(2);
                lastPrinted = 2;
            }
        }
    }

    static class C extends Thread {
        @Override
        public void run() {
            while (true) {
                while (true) {
                    synchronized (Demo2.class) {
                        if (lastPrinted == 2) {
                            break;
                        }
                    }
                }
                System.out.println(3);
                lastPrinted = 3;
            }
        }
    }


    public static void main(String[] args) {
        Thread a = new Demo2.A();
        Thread b = new Demo2.B();
        Thread c = new Demo2.C();
        a.start();
        b.start();
        c.start();
    }
}