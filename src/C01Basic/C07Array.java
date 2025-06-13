package C01Basic;

import java.lang.reflect.Field;
import java.util.*;

import sun.misc.Unsafe;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 배열 선언 후 할당 방식
//        배열은 반드시 사전에 길이가 결정되어야 함. int[] arr = new int[]; 이건 배열의 크기가 정해지지 않아서 불가능
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
////        arr1[2] = 30; // 값을 안 넣으면 0으로 초기화
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 10; // Array Index Out of Bounds 예외 발생. 배열의 길이를 동적으로 늘릴 수 없음.
//        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

//        배열표현식2. 리터럴방식
//        int[] arr2 = {10, 20, 30, 40, 50};
//
////        배열표현식3.
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//
////        배열표현식3의 예시
//        ArrayList<int[]> list = new ArrayList<>() {{
//            add(new int[]{1, 2, 3, 4, 5});
//            add(new int[]{1, 2, 3, 4, 5});
//            add(new int[]{1, 2, 3, 4, 5});
//        }};
//


//        Arrays.fill : 배열의 모든 값을 변경
//        String[] arr = new String[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//
//        Arrays.fill(arr, ""); // 위의 반복문과 같은 거

//        85,65,90 으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오.
//        int[] arr = {85,65,90};
//
//        int sum = 0;
//        for(int i : arr) {
//            sum += i;
//        }
//        double avg = (double)sum/arr.length;
//
//        System.out.println("sum = " + sum + ", avg = " + avg);

//        최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i : arr) {
//            max = Math.max(max, i);
//            min = Math.min(min, i);
//        }
//
//        System.out.println("min = " + min + ", max = " + max);


//        배열의 자리바꾸기
//        int[] arr = {20,10,30};
//        int t = arr[0];
//        arr[0] = arr[1];
//        arr[1] = t;
//
////        배열 뒤집기
//        int[] newArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length-(i+1)];
//        }
//
//        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));

//        배열의 정렬
//        int[] arr = {17,12,20,10,15};
//        
//        Arrays.sort(arr);
////        Arrays.sort(arr, Collections.reverseOrder()); // 원시자료형은 사용불가능, Integer는 됨
//
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        
//        String[] strArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(strArr, Collections.reverseOrder());
//
//        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

//        선택정렬 알고리즘 직접 정렬
//        int[] arr = {17, 12, 20, 10, 15, 1, 3, 4, -1, 2, 425, 23, 2, 0, 23231, -24242, 342, 425, 12, 34, 2, 5, 6, 8};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIdx = i;
//
//            for (int j = i + 1; j < arr.length; j++) { // 최소값을 구하는 로직
//                if (arr[minIdx] > arr[j]) minIdx = j;
//            }
//
//            if (i == minIdx) continue; // 없다면 불필요한 연산을 하게 되지만 엄청 유의미하지는 않음
//
//            // 위치 교환 로직
//            int t = arr[i];
//            arr[i] = arr[minIdx];
//            arr[minIdx] = t;
//        }
//        System.out.println("Arrays.toString(arr = " + Arrays.toString(arr));

//        조함 문제 : 모두 각기 다른 숫자의 배열이 있을때. 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
//        ex) (10,20) (10,40) (10,50) (20,30) (20,40) (20,50) .....
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//
//        for (int i = 0; i < intArr.length - 1; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                System.out.print("(" + intArr[i] + ", " + intArr[j] + ")");
//                if (i != intArr.length - 2) System.out.print(", ");
//            }
//        }

//        배열의 중복제거 : linkedHashSet 자료구조를 활용하여 중복제거
//        int[] arr = {10,10,20,30,30,40};
//
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//        Set<Integer> hashSet = new HashSet<>();
//        for(int i : arr) {
//            linkedHashSet.add(i);
//            hashSet.add(i);
//        }
//
//        System.out.println(linkedHashSet);
//        System.out.println(hashSet);
//
//        int[] answer = new int[hashSet.size()];
//        int answerIdx = 0;
//        for(int a : hashSet) {
//            answer[answerIdx++] = a;
//        }
//        Arrays.sort(answer);
//        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

//        프로그래머스 : 두 개 뽑아서 더하기


////        배열의 검색
//        int[] arr = {5, 4, 1, 8, 7, 12, 3, 4, 512, 23, 5, 6, 2, 4, 43, 3};
//        int target = 23;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) System.out.println("target = " + target + " -> arr[" + i + "]에 위치");
//        }
//
////        이분탐색, binarySearch 시간복잡도를 줄일 수 있는 방법(사전에 오름차순 정렬이 되어있는 데이터만 가능); 중복된 값이 있으면 원하는 인덱스를 찾지 못할 수 있음(이분탐색의 한계)
//        Arrays.sort(arr);
//        int idx = Arrays.binarySearch(arr, target);
//        System.out.println(idx + " " + arr[idx]);
//
//
//
////        백준 - 수찾기 (1920)
//
////        배열 값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2); // false
//        System.out.println(Arrays.equals(arr1, arr2)); // true

////        2차원 배열의 선언과 값할당
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
//
////        리터럴 방식
//        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
//
////        가변배열 : 배열의 전체 길이는 반드시 할당해야함.
//        int[][][] arr3 = new int[][][]{{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}},{{1,2},{1,2,3},{1,2,3,4}},{{1,2},{1,2,3},{1,2,3,4}}};
//        int[][] arr4 = {{1,2}, {1,2,3}, {1,2,3,4}};
//
//        int[][] arr5 = new int[3][];
//        arr5[0] = new int[2];
//        arr5[1] = new int[3];
//        arr5[2] = new int[4];
//
//        System.out.println(Arrays.deepToString(arr3)); // 다차원배열 출력, deepToString();

//        [3][4] 사이즈 배열을 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[3][];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[i+2]; // 초기화 안하면 NullPointerException 발생
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = j+1;
            }
        }
    }
}
