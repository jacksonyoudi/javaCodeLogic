/**
 * throw对比return
 * throw表示正异常退出，return表示正常退出
 * return的返回位置是确定的，就是上一级调用者，而throw后执行哪行代码则经常是不确定的
 * 由异常处理机制动态确定的。
 * <p>
 * 异常处理机制会从当前函数开始查看谁捕获这个异常， 当前函数没有就查看上一层，直到
 * 主函数，如果主函数也没有，就使用默认机制，即输出异常栈信息并退出，这是我们在屏幕输出中看到的。
 */

public class ExceptionTest {
    public static void main(String[] args) {
        String s = null;
        s.indexOf("a");
        System.out.println("end");
    }
}
