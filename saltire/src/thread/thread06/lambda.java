package thread.thread06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Lambda 表达式的语法非常简洁，完全没有面向对象复杂的束缚，但是使用时有几个问题需要特别注意：
 * 1、使用 lambda 必须具有接口，且要求接口中有且仅有一个抽象方法
 * 无论是 JDK 内置的 Runnable、Comparator 接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用 Lambda
 * 2、使用 Lambda 必须具有上下文推断，也就是方法的参数或局部变量类型必须为 Lambda 对应的接口类型，才能使用 Lambda 作为该接口的实例
 * 备注：有且仅有一个抽象方法的接口，称为函数式接口
 */
public class lambda {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("saltire", 18),
                new Person("saltire1", 20),
                new Person("saltire2", 16)
        };

        // 1、经典排序方式
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 2、使用 lambda 表达式简化后的排序
        Arrays.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());

        Arrays.sort(persons, Comparator.comparingInt(Person::getAge));

        for(Person x : persons) {
            System.out.println(x);
        }
    }
}
