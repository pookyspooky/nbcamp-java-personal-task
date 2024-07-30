package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int count = 0;


        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            calculator.setNum1(num1);
            System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0);
            calculator.setOperator(operator);
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            calculator.setNum2(num2);

            calculator.calculate();

            count++;
            System.out.println("count: " + count);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")) {
                calculator.removeResult(); // Queue의 첫번째 값 제거
            }

            System.out.println("저장된 연살결과를 조회하시겠습니끼? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                calculator.inquiryResult();
                }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
