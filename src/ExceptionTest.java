/**
 * throw对比return
 *      throw表示正异常退出，return表示异常退出
 */

public class ExceptionTest {
    public static void main(String[] args) {
        String s = null;
        s.indexOf("a");
        System.out.println("end");
    }
}
