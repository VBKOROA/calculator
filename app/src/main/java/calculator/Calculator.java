package calculator;

import java.util.ArrayList;
import java.util.List;

import calculator.enums.Operator;
import calculator.exception.DivideByZeroException;

public class Calculator {
    private List<Number> results = new ArrayList<>();
    private static final int MAX_RESULTS_SIZE = 5;

    public List<Number> getResults() {
        return List.copyOf(results);
    }

    public void setResults(List<Number> results) {
        this.results = results;
    }

    private void removeFirst() {
        results.remove(0);
    }

    /**
     * 계산 메서드
     * @param <T> - Number 타입의 제네릭
     * @param first - 첫 번째 피연산자
     * @param second - 두 번째 피연산자
     * @param operator - 연산자
     * @return - 계산 결과
     * @throws DivideByZeroException - 0으로 나누기 예외
     */
    public <T extends Number> Number calculate(T first, T second, Operator operator) throws DivideByZeroException {
        double doubleResult = operator.apply(first.doubleValue(), second.doubleValue());

        Number result;
        if (doubleResult % 1 == 0) {
            // 만약 결과가 정수라면, int로 변환
            result = (int) doubleResult;
        } else {
            // 결과가 실수라면, double로 유지
            result = doubleResult;
        }
        
        results.add(result);

        // removeFirst 사용 예시
        if(results.size() > MAX_RESULTS_SIZE) {
            // 결과가 MAX_RESULTS_SIZE를 초과하면 가장 오래된 결과를 삭제
            removeFirst(); 
        }

        return result;
    }

    /**
     * value 보다 큰 값들을 검색하는 메서드
     * @param value - 기준 값
     * @return - 검색된 결과 리스트
     */
    public List<Number> searchBiggerThan(double value) {
        // value 보다 큰 값들 반환
        return results.stream()
                .filter(result -> result.doubleValue() > value)
                .toList();
    }
}
