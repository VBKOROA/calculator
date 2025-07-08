package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.exception.DivideByZeroException;
import calculator.exception.UnknownOperatorException;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int first, int second, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    // 0으로 나누는 경우 예외 처리
                    throw new DivideByZeroException();   
                }
                result = first / second;
                break;
            default:
                // 잘못된 연산자 입력 처리
                throw new UnknownOperatorException(operator);
        }
        results.add(result);
        return result;
    }
}
