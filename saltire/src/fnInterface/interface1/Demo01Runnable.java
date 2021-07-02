package fnInterface.interface1;

public class Demo01Runnable {
    public static void main(String[] args) {
        // 1、使用匿名内部类
        // startThread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println(Thread.currentThread().getName() + "线程启动了-匿名类部类");
        //     }
        // });

        // 2、使用 lamuda 表达式
        // startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了-Lamuda表达式"));
    }

    // 函数式接口作为参数使用 - 静态方法
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    // 函数式接口作为参数使用 - 实例方法
    public void startThread1(Runnable run) {
        new Thread(run).start();
    }
}

