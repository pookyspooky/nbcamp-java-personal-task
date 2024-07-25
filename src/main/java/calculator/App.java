package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10]; // 크기가 10인 int 배열 생성
        int count = 0; // 인덱스를 표현하는 언어
        intArray[count] = 1; // 인덱스 0번자리에 1 저장

        while (true) {
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
                    continue;
                }
            } else {
                System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, / 중 하나).");
                continue;
            }

            System.out.println("결과: " + result);

            intArray[count] = 1;
            count++;
            System.out.println(count);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
