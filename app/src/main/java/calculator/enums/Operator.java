package calculator.enums;

import calculator.exception.DivideByZeroException;
import calculator.exception.UnknownOperatorException;

public enum Operator {
    ADD("+") {
        @Override
        public double apply(double first, double second) {
            return first + second;
        }

        @Override
        public int apply(int first, int second) {
            return first + second;
        }
    },

    SUBTRACT("-") {
        @Override
        public double apply(double first, double second) {
            return first - second;
        }

        @Override
        public int apply(int first, int second) {
            return first - second;
        }
    },

    MULTIPLY("*") {
        @Override
        public double apply(double first, double second) {
            return first * second;
        }

        @Override
        public int apply(int first, int second) {
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

        @Override
        public int apply(int first, int second) {
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
    /**
     * @param first - 첫 번째 피연산자
     * @param second - 두 번째 피연산자
     * @return - 연산 결과
     * @throws DivideByZeroException - 두 번째 피연산자가 0인 경우, 나눗셈 연산에서 발생할 수 있는 예외.
     */
    public abstract double apply(double first, double second) throws DivideByZeroException;

    /**
     * @param first - 첫 번째 피연산자
     * @param second - 두 번째 피연산자
     * @return - 연산 결과
     * @throws DivideByZeroException - 두 번째 피연산자가 0인 경우, 나눗셈 연산에서 발생할 수 있는 예외.
     */
    public abstract int apply(int first, int second) throws DivideByZeroException;

    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol - 연산자 심볼(문자열)
     * @throws UnknownOperatorException - 주어진 심볼에 해당하는 연산자가 없는 경우.
     */
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
