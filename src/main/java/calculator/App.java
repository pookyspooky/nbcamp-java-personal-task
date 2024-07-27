package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10]; // 크기가 10인 int 배열 생성
        int count = 0; // 인덱스를 표현하는 언어
//        int lastIndex = 0;

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

                }
            } else {
                System.out.println("오류: 올바른 연산 기호를 입력하세요 (+, -, *, / 중 하나).");

            }


            System.out.println("결과: " + result);

            List<Integer> newArr = Arrays.asList(); // 배열을 컬렌션으로 변경


//            if(lastIndex < intArray.length-1) { // 배열 위치가 9가 되었을때
//                for (int i = 0; i < intArray.length - 1; i++) { // 0~8까지 돌림
//                    intArray[i] = intArray[i + 1]; // 첫번째 배열에 두번째 배열 입력
//                }
//                intArray[intArray.length - 1] = result; // 마지막 배열에 결과값 입력
//
//            }


            count++;
            System.out.println("count: " + count);

            Queue<Integer> intQueue = new LinkedList<>(); // Queue 선언
            intQueue.add(intArray.length); // intArray 길이만큼 저장
//            while (!intQueue.isEmpty())
            intQueue.add(result); // 결과값 Queue로 저장

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")) {
                System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
            }
            intQueue.remove(); // Queue의 첫번째 값 제거

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
