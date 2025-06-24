package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
////        전통적인 방식의 데이터 접근 방법 : 메모리 주소 접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
////        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
////        StreamApi : 자바에서 함수형 프로그래밍을 지원하는 라이브러리
////        forEach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

////        스트림의 생성 : .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("javaScript");
//
//        Stream<String> listStringStream = myList.stream();
//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[1] = "CSS";
//        myArr[2] = "javaScript";
//
//        Stream<String> arrStringStream = Arrays.stream(myArr);
//
////        원시자료형을 위한 steam객체가 별도로 존재
//        int[] intArr = {10,20,30,40,50};
//        IntStream arrIntStream = Arrays.stream(intArr);

////        stream의 중개연산(변환) : filter, map, sorted, distinct
//        int[] intArr = {10, 10, 30, 40, 50};
//
////        30보다 작은 값들의 총합을 구하고 싶을때
////        filter : 특정 기준으로 대상을 filtering 하여 새로운 스트림을 반환하는 "중개" 연산 메서드
////        sum : 스트림의 요소를 하나씩 "소모"하여 총합을 구하는 메서드
//        int sum = Arrays.stream(intArr).filter(i -> i <= 30).sum();
//
//        System.out.println(sum);
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10, 10, 30, 40, 50};
//        int sum2 = Arrays.stream(intArr2).map(i -> i * 10).sum();
//        System.out.println(sum2);
//
//        int[] newIntArr2 = Arrays.stream(intArr2).map(i -> i * 10).toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//
////        distinct : 중복제거
//        int[] intArr3 = {10, 10, 30, 30, 40, 40, 50, 50};
//        int sum3 = Arrays.stream(intArr3).distinct().sum();
//        System.out.println(sum3);
//
////        sorted : 정렬
//        int[] intArr4 = {10, 40, 10, 30, 50};
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(newArr4));
//
////        mapToInt : intStream으로 변환
//        String[] strArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        문자열 길이의 총합
//        int totalLength = Arrays.stream(strArr).mapToInt(String::length).sum();
//        System.out.println(totalLength);


//        int[] arr = {3, 2, 1, 6, 5, 4};
////        arr에서 홀수만 담은 배열 생성 후 출력
//        int[] odd = Arrays.stream(arr).filter(i -> i % 2 == 1).toArray();
//        System.out.println(Arrays.toString(odd));
////        arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] oddPow = Arrays.stream(odd).map(i -> i * i).toArray();
//        System.out.println(Arrays.toString(oddPow));
////        arr에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
//        int[] sortedOddPow = Arrays.stream(oddPow).sorted().toArray();
//        System.out.println(Arrays.toString(sortedOddPow));
//
////        스트림의 소모 : forEach(출력), sum(합계), max,min,count, reduce(누적연산), findFirst : 스트림의 첫번째값 리턴
//        int[] intArr = {10, 20, 30, 40, 50};
//        Arrays.stream(intArr).forEach(System.out::println);
//        int total = Arrays.stream(intArr).sum();
////        optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//
//        long count = Arrays.stream(intArr).count();
//
////        reduce : 누적연산 -> reduce(초기값, 연산식)
//        int acc = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
//        System.out.println(acc);
//        int accMulti = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
//        System.out.println(accMulti);
//
//        String[] strArr = {"hello", "java", "world"};
//        String strAcc = Arrays.stream(strArr).reduce("", (a, b) -> a + b);
//        System.out.println(strAcc);
//
////        strArr 중 길이가 5이상인 것중에 첫번째 것 찾아라
//        String answer = Arrays.stream(strArr).filter(s -> s.length() >= 5).findFirst().get();
//        System.out.println(answer);

//        주의사항 : 제네릭의 타입소거
//        자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거가 발생.
//        제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가
        String[] strArr = {"hello", "java", "world"};
        String[] answer = Arrays.stream(strArr).filter(s -> s.length()>=5).toArray(String[]::new);
    }
}
