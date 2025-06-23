package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

// 조합(combination), 순열(permutation)
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
//        n중 for문을 활용하여 helloword1 .. 2... 3 n개 출력
//        int total = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("hello world " + total);
//                total++;
//            }
//        }

//        위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재.
//        int num = 0;
//        int target = 4;
//        int forI = 6;
//        recurForLoop(num,target,forI);
//
//        double sum = 0;
//        for (int i = 1; i <= target; i++) {
//            sum += Math.pow(forI, i);
//        }
//
//        System.out.println(sum);
//        System.out.println(Math.pow(forI, target));

//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담아 출력
//        List<List<Integer>> doubleList = new ArrayList<>();
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = i+1; j <= 4; j++) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                list.add(j);
//                doubleList.add(list);
//            }
//        }
//
//        System.out.println(doubleList);


        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        List<List<Integer>> doubleList = new ArrayList<>();

        permu(myList,new ArrayList<>(),doubleList,2, new boolean[myList.size()]);

        System.out.println(doubleList);
    }

    static int total = 1;
    static void recurForLoop(int num, int target, int forI) {
        if (target == num) {
//            System.out.println("hello world " + total++); //
            return;
        }

        for (int i = 0; i < forI; i++) {
            System.out.println("hello world " + total++);
            recurForLoop(num+1, target, forI);
        }
    }

    static void combi(List<Integer> myList, List<Integer> list, List<List<Integer>> doubleList, int target, int start) {
        if (list.size() == target) {
            doubleList.add(new ArrayList<>(list));      // doubleList.add(list); 아님 주의!!
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            list.add(myList.get(i));
            combi(myList, list, doubleList, target, i + 1);
            list.remove(list.size() - 1);
        }
    }

    /**
     * 수들의 집합에서 순열을 만드는 함수(백트래킹)
     * @param myList 순열을 만들 수들의 집합
     * @param temp 임시 저장할 리스트
     * @param target 뽑아야 할 순열의 크기
     * @param visited 이미 뽑았던 수를 뽑지 않게 하기 위해서 확인할 불린 배열
     * @param doubleList 최종 결과물을 담을 리스트
     * */
    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, boolean[] visited) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));      // doubleList.add(list); 아님 주의!!
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if(visited[i]) continue;
            temp.add(myList.get(i));
            visited[i] = true;
            permu(myList, temp, doubleList, target, visited);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}

// 백준 문제 풀어오기
// 15649, n m
// 6603, 로또