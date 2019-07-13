/**
 * 栈主要保存变量，参数，返回地址，以及函数内部定义的局部变量
 */


public class Sum {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int d = Sum.sum(1, 2);
        System.out.println(d);

        char c = '马';
        System.out.println(Integer.toBinaryString(c));
    }


    public enum Color {
        YELLOW("y", 1),
        BLUE("b", 100);
        private String abbr;
        private int ord;


        private Color(String abbr, int ord){
            this.abbr = abbr;
            this.ord = ord;
        }

    }

    // 自定义枚举值的id

}
