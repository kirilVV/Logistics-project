package exceptions;

public class InvalidInputInfo extends RuntimeException {
    public InvalidInputInfo(String message) {
        super(message);
    }
}
