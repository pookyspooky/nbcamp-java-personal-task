package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    Queue<Integer> intQueue = new LinkedList<>();

    public int calculate(int num1, int num2, char operator) {
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
        return result;
    }
}

