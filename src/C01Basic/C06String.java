package C01Basic;

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
        String s1 = "hello";
        s1 += " world";
        s1 += '1'; // String 에 char을 더하면 String 으로 됨;
        System.out.println("s1 = " + s1);
    }
}
