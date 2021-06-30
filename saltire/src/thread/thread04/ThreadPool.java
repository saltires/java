package thread.thread04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池：JDK1.5 之后提供了一个工厂类（java.util.concurrent.Executors）用来生成线程池
 * 其中，Executors 类的静态方法 public static ExecutorService newFixedThreadPool(int nThreads) 用于创建线程池
 * 创建一个线程池，该池重用在共享的无界队列中运行的固定数量的线程。 在任何时候，最多nThreads线程都将处于活动状态。
 * 如果在所有线程都处于活动状态时提交了其他任务，则它们将在队列中等待，直到线程可用。
 * 如果任何线程由于在关闭之前执行期间的故障而终止，则如果需要执行后续任务，则新线程将取代它。 池中的线程将一直存在，直到它明确为shutdown 。
 * 参数： int nThreads 用于指定线程池中线程的数量
 * 返回值：ExecutorService 接口的实现类对象
 * 线程池的使用步骤：
 * 1、使用线程池的工厂类 Executors 提供的静态方法 newFixedThreadPool 来生成一个指定线程数量的线程池
 * 2、创建一个类，实现 Runnable 接口，重写 run 方法，设置线程任务
 * 3、调用 ExecutorService 实现类中的 submit 方法来传递线程任务，开启线程并执行 run 方法
 * 4、当不需要线程池时，可以使用 ExecutorService 实现类中的方法 shutdown 来销毁线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 1、使用线程池的工厂类 Executors 提供的静态方法 newFixedThreadPool 来生成一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 3、调用 ExecutorService 实现类中的 submit 方法来传递线程任务，开启线程并执行 run 方法
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());

        executorService.shutdown();
    }
}
