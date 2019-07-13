/**
 * implements
 * 必须实现接口声明的方法
 *
 * 针对接口而非具体类型进行编程，是计算机程序的一种重要的思维方式。
 *      代码复用
 *      降低了耦合提高灵活性
 *
 *
 *
 *   抽象类不能创建对象
 *   抽象类可以定义实例变量， 接口不行
 *   接口声明能力，抽象类提供默认实现
 *
 *
 *   抽象类配合接口， 加上 模板方法
 */

public class Pointer implements MyComarable {


    @Override
    public int compareTo(Object other) {
        return 0;
    }


    public static void main(String[] args) {
        MyComarable p1 = new Pointer();

    }
}