package calculator.enums;

import calculator.exception.UnknownOperatorException;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol(String symbol) {
        // 사용 가능한 연산자 심볼을 순회하며 일치하는 연산자를 찾습니다.
        for (Operator operator : values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new UnknownOperatorException(symbol);
    }
}
