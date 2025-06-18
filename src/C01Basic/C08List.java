package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        List선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//        myList3.add("java");
//        myList3.add("C++");
//        myList3.add("python");
//
////        초기값 세팅 방법 2. 배열을 리스트로 변환
//        String[] arr = {"java", "C++", "python"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr) {
//            myList5.add(i);
//        }

////        add메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); // 가능은 한데 마지막에 넣는 것이 아니면 성능에 악영향을 줌
//        System.out.println(myList);

//        remove : 요소 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
////        index를 이용한 삭제, 값을 이용한 삭제
//        myList.remove(0);
//        myList.remove(Integer.valueOf(30));
//
//        myList.clear();
//        System.out.println(myList.isEmpty());
//
////        indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> myList2 = new ArrayList<>();
//
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);
//
//        System.out.println(myList2.indexOf(30));
//
//        System.out.println(myList2.contains(20));

//        정렬

//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        Collections.sort(myList, Comparator.reverseOrder());
//        myList.sort(Comparator.reverseOrder());
//
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());
//
//        System.out.println("myList = " + myList);

//        이중리스트
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());

//        for문으로 값 자동 생성
//        List<List<Integer>> myList = new ArrayList<>();
//
//        for (int i = 0; i < 4; i++) {
//            myList.add(new ArrayList<>());
//            for (int j = 0; j < 3; j++) {
//                myList.get(i).add(i * 3 + j + 1);
//            }
//        }
//
//        System.out.println("myList = " + myList);

//        리스트 안에 배열
        List<int[]> myList = new ArrayList<>();
        LinkedList<Integer> a = new LinkedList<>();
        myList.add(new int[2]);
        myList.add(new int[3]);

        myList.get(0)[0] = 1;
        myList.get(0)[1] = 2;

        myList.get(1)[0] = 1;
        myList.get(1)[1] = 2;
        myList.get(1)[2] = 3;

        myList.add(new int[]{1,2,3,4});
//        myList.get(2)[0] = 1;
//        myList.get(2)[1] = 2;
//        myList.get(2)[2] = 3;
//        myList.get(2)[3] = 4;

        System.out.println("myList = " + myList);

    }
}
