package exception;

public class ScalarException extends Exception {

    public ScalarException() {
        super();
    }

    public ScalarException(String message) {
        super(message);
    }

    public ScalarException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScalarException(Throwable cause) {
        super(cause);
    }

    protected ScalarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
