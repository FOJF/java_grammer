package C01Basic;

import java.util.*;

public class C05LoopStatement {
    public static void main(String[] args) {
//        int a = 2;
//        while (a < 11)  {
//            System.out.println("Hello World " + a++);
//        }
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while (true) {
//            int answer = 1234;
//            if (answer == sc.nextInt()) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//
//            if (++count == 5) {
//                System.out.println("5회 이상 초과했습니다.");
//                break;
//            }
////            System.out.println((1234 == sc.nextInt()) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.");
//        }


//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("------------------------------------");
//            System.out.print("출력하고 싶은 구구단 단수를 입력해주세요. : ");
//            int input = sc.nextInt();
//            int i = 1;
//            while (i < 10) {
//                System.out.println(input + " X " + i + " = " + (input * i++));
//            }
//        }

//    do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        } while (a < 10);

//        for문 : 초기식, 조건식, 증감식이 모두 포함되어 있는 반복문
//        1~10 홀수 출력
//        for (int a = 0; a < 10; a++) {
//            if(a%2 == 1) System.out.println("a = " + a);
//        }

//        1~20 짝수 출력
//        for (int i = 1; i <= 20; i++) {
//            if(i%2==0) System.out.println("i = " + i);
//        }

//        int a = 24;
//        int b = 36;
//
//        int answer = 0;
//        for (int i = 1; i <= Math.min(a,b); i++) {
//            if(a % i == 0 && b % i == 0) answer = i;
//        }
//        System.out.println("answer = " + answer);
//        System.out.println("euc(Math.max(a,b), Math.min(a,b)) = " + euc(Math.max(a, b), Math.min(a, b)));

//        소수구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        boolean isAnswer = true;
//        for (int i = 2; i < Math.sqrt(input)+1; i++) {
//            if(input%i == 0) {
//                isAnswer = false;
//                break;
//            }
//        }
//
//        if(isAnswer && input > 1) System.out.println("소수");
//        else System.out.println("소수 아님");


//        continue : 반복문의 조건식으로 이동하는 명령어
//        continue는 코드의 직관성과 가독성을 위해 사용
//        for (int i = 1; i < 11; i++) { // 홀수만 출력
//            if(i%2==0) continue;
//            System.out.println(i);
//        }

//        향상된(Enhanced) for문 - for each 문
//        int[] arr = {1,3,5,7};
//
//        for(int i : arr) {
//            System.out.println("i = " + i);
//        }
//
////        일반 for문을 통한 arr의 저장된 값 변경 -> 가능
//        System.out.println(Arrays.toString(arr));
//        향상된 for문을 통한 arr의 저장된 값 변경 -> 불가능


        // 자바 변수의 유효 범위 : {}
//        int num = 10;
//        if(true) {
//            num = 20; // {}밖에 있는 변수에 접근 가능
//            int num2 = 20;
//        }
//        num2 = 30; {}밖에서는 안에 있는 변수에 접근 불가

//        다중 반복문
//        2~9단까지 한번에 출력;
//        for (int i = 2; i < 10; i++) {
//            System.out.println("------------------ " + i + "단 입니다 ------------------");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//        }


//        라벨문 : 반복문에 이름을 붙이는 것
//        loop1:
//        for (int i = 0; i < 10; i++) {
//            if (true) break loop1;
//        }

//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//
//        find11:
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println("i = " + i + ", j = " + j);
//                    break find11;
//                }
//            }
//        }

        labelC:
        for (int i = 500; i <= 600; i++) {
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (int) Math.sqrt(i)) {
//                    System.out.println("Math.sqrt(i) = " + Math.sqrt(i));
//                    System.out.println("j = " + j);
                    System.out.println("100~200 중 가장 작은 소수는 " + i + "입니다.");
                    break labelC;
                }
            }
        }

//        loop:
//        for (int i = 100; i < 201; i++) {
//            for (int j = 2; j < Math.sqrt(i)+1; j++) {
//                if (i % j == 0) {
//                    continue loop;
//                }
//            }
//            System.out.println(i);
//        }

    }
}
