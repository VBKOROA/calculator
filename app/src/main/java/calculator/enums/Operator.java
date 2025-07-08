package calculator.enums;

import calculator.exception.DivideByZeroException;
import calculator.exception.UnknownOperatorException;

public enum Operator {
    ADD("+") {
        @Override
        public double apply(double first, double second) {
            return first + second;
        }
    },

    SUBTRACT("-") {
        @Override
        public double apply(double first, double second) {
            return first - second;
        }
    },

    MULTIPLY("*") {
        @Override
        public double apply(double first, double second) {
            return first * second;
        }
    },

    DIVIDE("/") {
        @Override
        public double apply(double first, double second) {
            if (second == 0) {
                throw new DivideByZeroException();
            }
            return first / second;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    // 추상 메서드로 각 연산자의 계산 로직 구현
    public abstract double apply(double first, double second) throws DivideByZeroException;

    public String getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol(String symbol) throws UnknownOperatorException {
        // 사용 가능한 연산자 심볼을 순회하며 일치하는 연산자를 찾습니다.
        for (Operator operator : values()) {
            if (operator.getSymbol().equals(symbol)) {
                return operator;
            }
        }
        throw new UnknownOperatorException(symbol);
    }
}
