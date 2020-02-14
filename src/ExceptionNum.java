import java.util.concurrent.ExecutionException;

/**
 * Throwable
 * Error
 * VirtaulMachinError
 * OutOfMemoryError
 * StackOverflowError
 * <p>
 * Exception
 * IOException
 * RuntionException
 * SQLExceptiion
 *
 *
 *  try-with-resourse
 *  try() {
 *
 *  }
 *
 *  throws
 */


public class ExceptionNum {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("请输入数字");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("参数" + args[0] + "不是有效数字，请输入数字");
            e.printStackTrace();
        } catch (RuntimeException e) {
//            throw new AppException("hello");
        } finally {
            //
        }
    }
}
