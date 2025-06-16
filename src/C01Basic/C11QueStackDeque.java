package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C11QueStackDeque {
    public static void main(String[] args) {
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(10);
        myQue.add(20);
        myQue.add(30);

//        poll : queue에서 데이터를 삭제하면서, return 해줌
        int temp = myQue.poll();
        System.out.println(temp);
        System.out.println(myQue);

        int temp2 = myQue.peek();
        System.out.println(myQue);

//        LinkedList와 ArrayList 성능차이 비교
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            arrayList.add(0,i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
