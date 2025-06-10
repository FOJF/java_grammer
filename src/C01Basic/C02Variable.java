package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//
//        오버 플로우 : 자료형이 표현할 수 있는 범위를 넘어선 경우
//        a++;
//        언더 플로우 : 자료형이 표현할 수 있는 범위보다 작은 값
//        b--;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        int i1 = 10;
//        long l1 = 10;

//        long은 명시적으로 L을 붙여 Long 타입임을 명시하기도 함
//        long l2 = 20L;

//        실수 : float, double
//        float f1 = 1.123f;
//        double d1 = 1.123;

//        부동 소수점 오차 테스트 : 정수로 변환 후 연산하여 추후 나눗셈으로 해결
//        double d2 = 0.1;
//        System.out.println("d2 = " + d2);
//
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total += 0.1 *10;
//        }
//        System.out.println("total = " + total/10);

//        소숫점 오차 해결 : BigDecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//
//        BigDecimal b1 = new BigDecimal("1.03"); // 값을 입력받을때부터 소숫점으로 받게 되면 이미 오차가 발생하므로 문자로 입력.
//        BigDecimal b2 = new BigDecimal("0.42");
//
//        System.out.println(b1.subtract(b2));
//
//        문자형 : char
//        char c1 = '가';
//        String str1 = "가나";
//
//        System.out.println("c1 = " + c1);

//        boolean : true or false

//        boolean b1 = false;
//        System.out.println("b1 = " + b1);
//        if (b1) {
//            System.out.println("참입니다.");
//        } else {
//            System.out.println("거짓입니다.");
//        }

//        null도 하나의 타입
//        참조형 자료에 값을 할당하지 않으면 null이 할당된다.
//        String str1 = "";
//        String str2 = null;
//
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//
//        System.out.println(str1.isEmpty());
//        System.out.println(str2.isEmpty()); // Null을 대상으로 String의 메서드 사용이 불가해서 런타임 에러 발생


//        아래의 코드도 마찬가지로 NullPointerException 에러 발생
//        String[] arr = new String[5];
//        arr[1] = "hello1";
//        arr[3] = "hello3";
//
//        for(String s : arr) {
//            System.out.println(s.length());
//        }

//        타입변환
//        묵시적 타입 변환, 명시적 타입 변환
//        char c1 = 'a';
//        int i1 = c1;
//        System.out.println("i1 = " + i1);
////        문자 비교를 위한 묵시적 타입변환
//        System.out.println('a' > 'b');
//
////        알파벳 소문자 제거문제
//        String str1 = "01abcd123한글123";
//        String answer = "";
//        for(char c : str1.toCharArray()) {
//            if(c < 'a' || c > 'z')
//                answer += c;
//        }
//        System.out.println("answer = " + answer);

//        int -> double
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println("d1 = " + d1);
//
//        double -> int
//
//        double d2 = 10.5;
//        int i2 = (int) d2;
//        System.out.println("i2 = " + i2);

//        정수끼리의 나눗셈 연산은 소숫점 절사 문제가 발생
//        두 수가 모두 정수이면 결과값이 정수일것이다라고 java가 판단
        int a = 1;
        int b = 4;
        System.out.println("(a/b) = " + (a/b));
        double d2 = (double)a/b;
        System.out.println("d2 = " + d2);

//        변수와 상수
        int a1 = 10;
//        재할당은 가능
        a1 = 20;
//        재 선언은 불가능하다
//        int a1 = 30;

//        상수
//        상수는 초기값을 할당한 이후에 재할당하는 것이 불가능
//        상수는 final 키워드를 사용
        final int F = 20;
//        상수는 재할당도 불가능
//        F = 30;
    }
}
