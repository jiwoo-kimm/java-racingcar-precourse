package exception;

public class InvalidCarNameLengthException extends InvalidInputException {

    private final String MESSAGE = "이름은 5자 이하만 가능하다.";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
