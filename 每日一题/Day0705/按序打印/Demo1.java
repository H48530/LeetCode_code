package 按序打印;


public class Demo1 {
    private static volatile int lastPrinted = 3;


    static class A extends Thread {
        @Override
        public void run() {
            while (true) {
                while (lastPrinted != 3) {
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
                while (lastPrinted == 1) {
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
                while (lastPrinted == 2) {
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