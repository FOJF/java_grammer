package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic {
    public static void main(String[] args) {
//        recur0(0, 3);
//        recur1(0, 3);
//        recur2(new ArrayList<>(),0, 3);
    }

    public static void recur0(int count, int depth) {
        if (count == depth) return;
        System.out.println("재귀 호출 전 count " + count);
        recur0(count + 1, depth);
        System.out.println("재귀 호출 후 count " + count);
    }


//    출력 순서 : 전0, 전1, 전2, 후3, 후2, 후1
    public static void recur1(int count, int depth) {
        if (count == depth) return;
        System.out.println("재귀 호출 전 count " + count);
        count++;
        recur1(count, depth);
        System.out.println("재귀 호출 후 count " + count);
    }

//    객체를 매개변수를 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체가 변경될 수 있으므로, 재귀함수간에 값이 일치될 가능성이 있음
    public static void recur2(List<Integer> myList, int num, int target) {
        if (myList.size() == target) return;

        myList.add(num);
        recur2(myList, num+1, target);
        System.out.println(myList);
    }
}
