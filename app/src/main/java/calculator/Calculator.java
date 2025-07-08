package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.exception.DivideByZeroException;
import calculator.exception.UnknownOperatorException;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    private void removeFirst() {
        results.remove(0);
    }

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

        // removeFirst 사용 예시
        if(results.size() > 5) {
            removeFirst(); // 결과가 5개를 초과하면 가장 오래된 결과를 삭제
        }

        return result;
    }
}
