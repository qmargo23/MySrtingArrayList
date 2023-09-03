package exception;

public class NuulItemException extends RuntimeException {
    public NuulItemException() {
    }

    public NuulItemException(String message) {
        super(message);
    }

    public NuulItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NuulItemException(Throwable cause) {
        super(cause);
    }

    public NuulItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
