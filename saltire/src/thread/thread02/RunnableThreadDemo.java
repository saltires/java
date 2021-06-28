package thread.thread02;

/**
 * 实现多线程的方式之二：新建一个类 A 实现 Runnable 接口，在主线程中通过 new Thread(A).start() 方式创建一个新线程
 */
public class RunnableThreadDemo {
    public static void main(String[] args) {
        new Thread(new RunnableThread()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
