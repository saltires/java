package thread.thread01;

/**
 * 开启多线程方式之一：建立一个类 A 并继承 Thread 类，new A 类并调用其实例对象的 start 方法来开启一个全选的线程
 */
public class SaltireThreadDemo {
    public static void main(String[] args) {
        SaltireThread saltireThread = new SaltireThread();
        saltireThread.start();
        saltireThread.setName("thread_name_saltire");
        for (int i = 0; i < 20; i++) {
            /**
             * 线程常用的方法：
             * 1、getName 方法：获取线程名字
             * 2、setName 方法：设置线程名字
             * 3、sleep 方法： 让线程沉睡指定的时间
             */
            System.out.println(Thread.currentThread().getName() + i);
            // 下面代码通过 sleep 方法实现每隔一秒打印一次
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
