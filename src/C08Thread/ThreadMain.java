package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
////        단일 스레드 실행
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//
//        System.out.println(Library.getBookCount());

//        멀티 스레드 생성
//
//        방법1. 스레드 클래스 상속방식

//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
////        Thread 클래스 안에 start메서드 내장되어 있고, start메서드는 run메서드 호출하면서 스레드 생성.
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");

//        방법2. Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        new Thread(() -> {
//            System.out.println("스레드 실행시작 (MyThread 1)");
//        }).start();
//        new Thread(() -> {
//            System.out.println("스레드 실행시작 (MyThread 2)");
//        }).start();
//        new Thread(() -> {
//            System.out.println("스레드 실행시작 (MyThread 3)");
//        }).start();
//        new Thread(() -> {
//            System.out.println("스레드 실행시작 (MyThread 4)");
//        }).start();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(Library::borrow);
            thread.start();
            thread.join(); // 한 스레드의 작업이 모두 완료될 때, 드른 스레드를 생성하여 작업 수행. -> 사실상 단일 스레드 처럼 실행
        }
        Thread.sleep(1000);
        System.out.println(Library.getBookCount());
    }
}
