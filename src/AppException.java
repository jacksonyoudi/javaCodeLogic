public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}
