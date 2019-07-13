/**
 * 将程序分为保持不变的的主体框架和针对具体情况的可变逻辑，通过回调的方式进行协作
 * 是计算机程序的一种常用的实践。
 * 匿名内部类是实现回调接口的一种简便方式。
 */


public class OuterClass {
    public void test(final int x, final int y) {
        Pointer p = new Pointer() {
            @Override
            public int compareTo(Object other) {
                return super.compareTo(other);
            }
        };
    }

    public enum Size {
        SMALL, // 0
        MEDIUM, // 1
        LARGE   // 2
    }

    public static void main(String[] args) {
        Size size = Size.LARGE;

        Size m = Size.valueOf("MEDIUM");


        System.out.println(size.toString());
        System.out.println(size.name());
        System.out.println(size.ordinal());
        System.out.println(m.name());
    }
}
