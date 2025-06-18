package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));
//
////        A 부서의 매출 10원
//        System.out.println(MyCalculator.sumAcc(10));
//
////        B 부서 매출 10, 10, 10원
//        System.out.println(MyCalculator.sumAcc(10));
//        System.out.println(MyCalculator.sumAcc(10));
//        System.out.println(MyCalculator.sumAcc(10)); // A회사의 매출에 누적합이 되는 오류 발생

//        객체를 활용한 매출 계산
//        A 부서 매출 10, 20원
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
//        static이 없어서 MyCalculatorInstance.sumAcc같이 호출 불가
        mi1.sumAcc(10);
        System.out.println(mi1.total);
        mi1.sumAcc(20);
        System.out.println(mi1.total);

//        B 부서 매출 10, 20원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        mi2.sumAcc(10);
        System.out.println(mi2.total);
        mi2.sumAcc(20);
        System.out.println(mi2.total);

        System.out.println(MyCalculatorInstance.total_count);

//        자료구조에서 객체 사용 예시
//        배열
        String[] arr1 = {"hello", "java", "python"};
        Arrays.sort(arr1); // 클래스 메서드
        System.out.println(arr1.length);

//        리스트
        List<String> myList = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(myList); //클래스 메서드
        myList.sort(Comparator.naturalOrder()); //객체 메서드
        System.out.println(myList);
    }
}

class MyCalculator { // 재활용이 불가능, 두개 이상의 부서가 판매 실적 계산을 한다고 생각했을 때, 각각 계산되지 않고 하나로 합쳐져서 계산 됨
    //    static이 붙어 있으면 클래스변수, static이 붙어있지 않으면 객체 변수
    static int total = 0;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }
}

class MyCalculatorInstance { // 재사용가능, 예를 들면 부서마다 생성하여 사용가능
    int total = 0;
//    클래스 변수는 모든 인스턴스(객체) 간에 상태 공유 목적으로 주로 사용
    static int total_count = 0;

//    클래스를 만들면, 아래와 같은 클래스명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐.
//    생성자의 주된 목적은 객체 생성시 실행되면서 객체 변수를 초기화하기 위한 목적으로 주로 사용.
    public MyCalculatorInstance() {
        total_count++;
    }

//    클래서 메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에 사용가능
    public static int sum(int a, int b) {
        return a + b;
    }

    public void sumAcc(int a) {
        this.total += a;
//        return total;
    }
}