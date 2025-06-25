package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
        String[] strArr = {"java", "python", "c++"};
        strArrChange(strArr, 0, 1);
        System.out.println(Arrays.toString(strArr));

        Integer[] intArr = {3, 5, 10};
        intArrChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        allChange(strArr, 1, 2);
        System.out.println(Arrays.toString(strArr));

        allChange(intArr, 1, 2);
        System.out.println(Arrays.toString(intArr));

//        제네릭 사용 예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;

//        일반 객체 생성시
        Person p1 = new Person("hongildong");
        GenericPerson<String> p2 = new GenericPerson<>("hong");
        GenericPerson<Integer> p3 = new GenericPerson<>(1);
    }

    private static <T> void allChange(T[] arr, int idx1, int idx2) {
        T tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    private static void strArrChange(String[] strArr, int idx1, int idx2) {
        String tmp = strArr[idx1];
        strArr[idx1] = strArr[idx2];
        strArr[idx2] = tmp;
    }

    private static void intArrChange(Integer[] intArr, int idx1, int idx2) {
        Integer tmp = intArr[idx1];
        intArr[idx1] = intArr[idx2];
        intArr[idx2] = tmp;
    }

}

class GenericPerson<T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person {
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}