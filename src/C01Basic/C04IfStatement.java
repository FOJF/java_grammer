package C01Basic;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        if(answer == sc.nextInt()) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        교통카드 예제
//        System.out.println("현재 가지고 있는 돈을 얼마인가요?");
//        Scanner sc = new Scanner(System.in);
//        int money = sc.nextInt();
//
//        if (money >= 10000) System.out.println("택시를 타시오");
//        else if (money >= 3000) System.out.println("버스를 타시오");
//        else System.out.println("걸어가");
//
//        if (money < 3000) System.out.println("걸어가");
//        if (10000>money && money >= 3000) System.out.println("버스를 타시오");
//        if (money >= 10000 ) System.out.println("택시를 타시오");


//        삼항연산자 : 결과값 = 조건식 ? true 반환값 : false 반환값;

//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        String result = (answer == sc.nextInt()) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);

//        switch문 : if, else if, else if 등 여러 조건식이 있을때 조건문을 가독성있게 표현한 구문
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 0) System.out.println("상담사가 연결됩니다.");
        else if (input == 1) System.out.println("대출업무입니다.");
        else if (input == 2) System.out.println("예금업무입니다.");
        else if (input == 3) System.out.println("적금업무입니다.");
        else System.out.println("잘못된 입력입니다.");

        String result = switch (input) {
            case 0 -> "상담사가 연결됩니다.";
            case 1 -> "대출업무입니다.";
            case 2 -> "예금업무입니다.";
            case 3 -> "적금업무입니다.";
            default -> "잘못된 입력입니다.";
        };
        System.out.println(result);

        switch (input) {
            case 0:
                System.out.println("상담사가 연결됩니다.");
                break;
            case 1:
                System.out.println("대출업무입니다.");
                break;
            case 2:
                System.out.println("예금업무입니다.");
                break;
            case 3:
                System.out.println("적금업무입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}
