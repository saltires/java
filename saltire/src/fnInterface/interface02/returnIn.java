package fnInterface.interface02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 如果一个方法的返回值类型为函数式接口，那么就可以直接返回一个 lambda 表达式
 * 当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时，就尅调该方法获取
 */
public class returnIn {
    // 定义一个方法，方法的返回值类型使用函数式接口 Comparator
    public static Comparator<String> getComparator() {
        // 当方法的返回值类型是一个函数式接口，我们可以返回这个接口的匿名类部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照降序排序
                return o2.length() - o1.length();
            }
        };

        // 更优的方式：当方法的返回值类型是一个函数式接口，我们可以返回一个 lambda 表达式
        // return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aa", "vvvvv", "ccccc", "d"};

        Arrays.sort(arr, getComparator());

        System.out.println(Arrays.toString(arr));
    }
}
