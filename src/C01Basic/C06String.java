package C01Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class C06String {
    public static void main(String[] args) {
//        원시 자료형은 스택메모리에 저장되므로, 비교시 값자체를 비교
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);
//
////        참조자료형의 비교는 기본적으로 메모리주소값끼리의 비교
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
//        Integer ig1 = 10;
////        오토 언박싱 : Wrapper클래스 -> 원시자료형으로 자동 형변환
//        int i2 = ig1;
//
////        배열(참조자료형)에는 원시타입 자료형 세팅가능
//        int[] arr = {10, 20, 30};

//        그외(리스트,set,map) 등에는 참조자료형을 세팅해야함


//        String의 선언방법 2가지
//         객체 선언 방식
//        String s1 = new String("hello World");
//        String s2 = new String("hello World");
////          리터럴 방식 : 자바에서 추천하는 방식
//        String s3 = "hello World";
//        String s4 = "hello World";


//        length : 문자열의 길이 출력
//        String s1 = "Hello1 World2 Java3";
//        System.out.println(s1.length());
//
//        char c1 = s1.charAt(0);
//
////        소문자알파벳의 개수 구하기
//        int lowerCaseCnt = 0;
//        for (char c : s1.toCharArray()) {
//            if (c >= 'a' && c <= 'z')
//                lowerCaseCnt++;
//        }
//        System.out.println("lowerCaseCnt = " + lowerCaseCnt);
//
//        lowerCaseCnt = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
//                lowerCaseCnt++;
//        }
//        System.out.println("lowerCaseCnt = " + lowerCaseCnt);
//
////        a의 개수 출력
//        String s2 = "adsfaasaaasdfsdfs";
//        int aCnt = 0;
//        for (char c : s2.toCharArray()) {
//            if (c == 'a') aCnt++;
//        }
//        System.out.println("aCnt = " + aCnt);

//        indexOf : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치 반환
//        String s1 = "hello java java";
//        System.out.println(s1.indexOf("java"));
//
////        contains : 특정 문자열이 포함되어 있는 지 여부(boolean) 출력
//        System.out.println(s1.contains("hello")); // true
//        System.out.println(s1.contains("world")); // false

//        문자열 더하기 : +=
//        String s1 = "hello";
//        s1 += " world";
//        s1 += '1'; // String 에 char을 더하면 String 으로 됨;
//        System.out.println("s1 = " + s1);

//        프로그래머스 - 나머지 구하기
//        프로그래머스 - 특정 문자 제거하기

//        substring(a,b) : a이상 b미만의 index의 문자를 잘라 String을 반환
//        String s1 = "hello world";
//        System.out.println(s1.substring(0,5));
//        System.out.println(s1.substring(6,s1.length()));

//        trim, strip : 문자열 양쪽 끝에 공백제거
//        String s1 = " hello world  ";
//        String trim1 = s1.trim();
//        String strip1 = s1.strip();
//
//        System.out.println("trim1 = " + trim1);
//        System.out.println("strip1 = " + strip1);

//        toUpperCase : 문자열의 모든 문자를 대문자로 변환, toLowerCase : 문자열의 모든 문자를 소문자로 변환

//        String s1 = "Hello";
//        String upper = s1.toUpperCase();
//        String lower = s1.toLowerCase();
//
//        System.out.println("upper = " + upper);
//        System.out.println("lower = " + lower);

//        replace(a,b) : a문자열을 b문자열로 대체
//        String s1 = "hello world";
//        String target = "world";
//        String replacement = "java";
//
//        String replace = s1.replace(target, replacement);
//        System.out.println("replace = " + replace);

//        replaceAll(a,b) : 정규표현식을 사용할 수 있는 replace()
//        String s1 = "01abcABC123한글123";
//        System.out.println("s1.replaceAll(\"[가-힣a-z]\",\"\") = " + s1.replaceAll("[가-힣a-zA-Z]",""));

////        정규표현식
////        전화번호 검증
//        String number = "010-1243-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        System.out.println("check = " + check);
////        이메일 검증
//        String email = "adsf1234@naver.com";
//        check = email.matches("^[a-z0-9]+@[a-z]+.com$");
//        System.out.println("check = " + check);
//
////        split : 특정 문자를 기준으로 잘라서 문자배열로 만드는 것
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//        System.out.println(Arrays.toString(arr));
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
////        null과 공백의 차이
//        String n = null;
//        String empty = "";
//        String blank = " ";
//
////        System.out.println("n.isEmpty() = " + n.isEmpty()); // 못 함
//        System.out.println("empty.isEmpty() = " + empty.isEmpty()); // true
//        System.out.println("blank.isEmpty() = " + blank.isEmpty()); // false;
//        System.out.println("blank.isBlank() = " + blank.isBlank()); // true;

//        문자열 합치기
//        String[] arr = {"java", "python", "javascript"};
//
//        String answer1 = "";
//        for(String a : arr) {
//            answer1 += a;
//            answer1 += " ";
//        }
//        System.out.println(answer1);
//        String answer2 = String.join("\n", arr);
//        System.out.println(answer2);

//        StringBuffer : 문자열 조립 객체, Thread-safe 함

//        StringBuilder : 문자열 조립 객체(가장빠름), 동시성 이슈 있음(Thread-safe하지 않음)

        
//        문자열 뒤집기
        String s1 = "hello";
        
        StringBuilder reverse = new StringBuilder();

        for (int i = s1.length()-1; i > -1; i--) {
            reverse.append(s1.charAt(i));
        }

        System.out.println("reverse = " + reverse);

    }
}
