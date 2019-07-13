/**
 * 静态内部类
 * 成员内部类
 * 方法内部类
 * 匿名内部类
 * new FatherClass() {类代码}
 * new Fatherinterface() {类代码}
 */


public class Outer {
    private static int shared = 100;

    public static class StaticInner {
        public void innerMethod() {
            System.out.println("inner " + shared);
        }
    }

    public void test() {
        StaticInner si = new StaticInner();
        si.innerMethod();
    }

    public static void main(String[] args) {
        Outer.StaticInner si = new Outer.StaticInner();
        si.innerMethod();

        Outer o = new Outer();
        o.test();
    }
}

