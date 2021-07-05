package 按序打印;

/**
 *
 */
public class Foo {

    private int step = 3;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {

        while (step != 3) {
            synchronized (this) {
                if (step != 3) {
                    wait();
                }
            }
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        step = 1;
        synchronized (this) {
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (step != 1) {
            synchronized (this) {
                if (step != 1) {
                    wait();
                }
            }
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        step = 2;
        synchronized (this) {
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (step != 2) {
            synchronized (this) {
                if (step != 2) {
                    wait();
                }
            }
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        step = 3;
        synchronized (this) {
            notifyAll();
        }
    }
}