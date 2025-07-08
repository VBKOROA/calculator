package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.enums.Operator;
import calculator.exception.DivideByZeroException;

public class Calculator {
    private List<Double> results = new ArrayList<>();

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    private void removeFirst() {
        results.remove(0);
    }

    public <T extends Number> double calculate(T first, T second, Operator operator) {
        double result = 0;
        double firstValue = first.doubleValue();
        double secondValue = second.doubleValue();
        switch (operator) {
            case ADD:
                result = firstValue + secondValue;
                break;
            case SUBTRACT:
                result = firstValue - secondValue;
                break;
            case MULTIPLY:
                result = firstValue * secondValue;
                break;
            case DIVIDE:
                if (secondValue == 0) {
                    // 0으로 나누는 경우 예외 처리
                    throw new DivideByZeroException();   
                }
                result = firstValue / secondValue;
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
