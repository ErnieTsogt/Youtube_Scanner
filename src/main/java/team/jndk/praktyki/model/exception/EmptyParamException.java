package team.jndk.praktyki.model.exception;

public class EmptyParamException extends RuntimeException {
    public EmptyParamException(String message) {
        super(message);
    }
}