package 按序打印;


import timer.Demo;

public class Demo3 {
    private static volatile int lastPrinted = 3;


    static class A extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    while (lastPrinted != 3) {
                        synchronized (Demo3.class) {
                            if (lastPrinted != 3) {
                                Demo3.class.wait();
                            }
                        }
                    }
                    System.out.println(1);
                    lastPrinted = 1;
                    synchronized (Demo.class) {
                        Demo3.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    while (lastPrinted != 1) {
                        synchronized (Demo3.class) {
                            if (lastPrinted != 1) {
                                Demo3.class.wait();
                            }
                        }
                    }
                    System.out.println(2);
                    lastPrinted = 2;
                    synchronized (Demo.class) {
                        Demo3.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class C extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    while (lastPrinted != 2) {
                        synchronized (Demo3.class) {
                            if (lastPrinted != 2) {
                                Demo3.class.wait();
                            }
                        }
                    }
                    System.out.println(3);
                    lastPrinted = 3;
                    synchronized (Demo.class) {
                        Demo3.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
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