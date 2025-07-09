package calculator.exception;

public class UnknownOperatorException extends RuntimeException {
    public UnknownOperatorException(String operator) {
        super("알 수 없는 연산자입니다: " + operator);
    }
    
}
