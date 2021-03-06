package exceptionclass.bank2;

public class InvalidBankOperationException extends RuntimeException {

    public InvalidBankOperationException() {
    }

    public InvalidBankOperationException(String message) {
        super(message);
    }

    public InvalidBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
