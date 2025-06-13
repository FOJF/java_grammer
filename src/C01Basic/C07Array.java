package C01Basic;

import java.sql.Array;
import java.util.*;

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
        int[] arr = {17,12,20,10,15,1,3,4,-1,2,425,23,2,0,23231,-24242,342,425,12,34,2,5,6,8};

        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) minIdx = j;
            }

            if(i == minIdx) continue;

            int t = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = t;
        }

        System.out.println("Arrays.toString(arr = " + Arrays.toString(arr));
        
    }
}
