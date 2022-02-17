package exceptionalHandling;

public class InSufficientFundException extends RuntimeException {

    private String message;

    public InSufficientFundException(String message) {
        this.message = message;
    }

    public InSufficientFundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}