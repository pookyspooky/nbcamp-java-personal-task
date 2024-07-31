package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public Calculator() {
        intQueue = new LinkedList<>(); // 결과 저장 배열 초기화
    }

    private Queue<Integer> intQueue;
    private int num1;
    private int num2;
    private char operator;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int calculate() {
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                // Exception 클래스를 생성하여 throw 해야함
                System.out.println("오류: 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

            }
        } else {
            // Exception 클래스를 생성하여 throw 해야함
            System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, / 중 하나).");

        }
        intQueue.add(result); // 결과값 Queue로 저장
        System.out.println("결과: " + result);
        return result;
    }

    public void removeResult() {
        this.intQueue.remove();
        System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
    }

    public void inquiryResult() {
        for (int str : intQueue) {
            System.out.println("저장값: " + str);
        }
    }
}