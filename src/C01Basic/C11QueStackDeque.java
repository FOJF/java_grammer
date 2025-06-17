package C01Basic;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll : queue에서 데이터를 삭제하면서, return 해줌
//        int temp = myQue.poll();
//        System.out.println(temp);
//        System.out.println(myQue);
//
//        int temp2 = myQue.peek();
//        System.out.println(myQue);
//
////        LinkedList와 ArrayList 성능차이 비교
//        long startTime = System.currentTimeMillis();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);
//
//        startTime = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i = 0; i < 1000000; i++) {
//            arrayList.add(0,i);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);

//        Queue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.offer(3);
//        blockingQueue.offer(3);
//        blockingQueue.offer(3);
//        blockingQueue.offer(3); // add는 에러 발생, offer는 발생 안
//
////        우선순위 큐 : 데이터 poll할 때(!!), 정렬된 데이터 결과 값 보장
////        데이터가 계속해서 변경(삽입, 삭제)가 될 때 지속적으로 최소값을 추출해야할때 사용
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(50);
//        pq.add(10);
//        pq.add(30);
//        pq.add(20);
//        pq.add(40);
//        System.out.println(pq); // add할 때 까지는 전체 정렬이 되어있지 않음
//        while(!pq.isEmpty()) {
//            System.out.println(pq.poll()); // 뽑을때 마다 log(n)의 복잡도
//        }
//        백준 : 최소힙
//        프로그래머스 : 더 맵게

//        stack : 후입선출
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());


//        deque : addFirst, addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);
        System.out.println(d1.pollLast());
        System.out.println(d1.pollFirst());
        System.out.println(d1.peekLast());
    }
}
