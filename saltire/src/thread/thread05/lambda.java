package thread.thread05;

/**
 * lambda 表达式创建多线程被认为是简洁的一种函数式编程思想的体现
 * 下面是它与匿名内部类的方式对比
 */
public class lambda {
    public static void main(String[] args) {
        // 1、使用匿名类部类方式创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                }
            }
        }).start();

        // 2、使用 lambda 表达式创建多线程
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
            }
        }).start();
    }
}
