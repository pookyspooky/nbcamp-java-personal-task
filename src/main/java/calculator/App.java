package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
        String operator = sc.next();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        int result = 0; // 결과 값을 저장할 변수

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("오류: 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        } else {
            System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, / 중 하나).");
        }

        System.out.println("결과: " + result);


    }
}
