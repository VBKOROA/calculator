package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.enums.Operator;
import calculator.exception.DivideByZeroException;

public class Calculator {
    private List<Double> results = new ArrayList<>();
    private static final int MAX_RESULTS_SIZE = 5;

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    private void removeFirst() {
        results.remove(0);
    }

    public <T extends Number> double calculate(T first, T second, Operator operator) throws DivideByZeroException {
        double firstValue = first.doubleValue();
        double secondValue = second.doubleValue();
        double result = operator.apply(firstValue, secondValue);
        results.add(result);

        // removeFirst 사용 예시
        if(results.size() > MAX_RESULTS_SIZE) {
            // 결과가 MAX_RESULTS_SIZE를 초과하면 가장 오래된 결과를 삭제
            removeFirst(); 
        }

        return result;
    }

    public List<Double> searchBiggerThan(double value) {
        // value 보다 큰 값들 반환
        return results.stream()
                .filter(result -> result > value)
                .toList();
    }
}
