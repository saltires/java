package thread.thread03;

/**
 * 匿名类部类方式实现线程的创建
 * 匿名： 没有名字
 * 内部类： 写在其他类内部的类
 * 匿名类部类作用：简化代码
 * 格式： new 父类/接口() {
 *     重写父类/接口中的方法
 * }
 */
public class UnnameThread {
    public static void main(String[] args) {
        // 1、匿名类部类 - 继承 Thread 类方式创建多线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();

        // 2、匿名类部类 - 实现 Runnable 接口方式创建多线程
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };

        new Thread(runnable).start();
    }
}
