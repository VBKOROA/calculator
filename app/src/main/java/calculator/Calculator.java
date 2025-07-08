package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.enums.Operator;
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

    public int calculate(int first, int second, Operator operator) {
        int result = 0;
        switch (operator) {
            case ADD:
                result = first + second;
                break;
            case SUBTRACT:
                result = first - second;
                break;
            case MULTIPLY:
                result = first * second;
                break;
            case DIVIDE:
                if (second == 0) {
                    // 0으로 나누는 경우 예외 처리
                    throw new DivideByZeroException();   
                }
                result = first / second;
                break;
        }
        results.add(result);

        // removeFirst 사용 예시
        if(results.size() > 5) {
            // 결과가 5개를 초과하면 가장 오래된 결과를 삭제
            removeFirst(); 
        }

        return result;
    }
}
