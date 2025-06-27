package C08Thread;

public class Library {
    private static int bookCount = 100;

    public static int getBookCount() {
        return bookCount;
    }

//    synchronized : 메서드내에서 1개의 스레드만 실행되도록 강제. (메서드 시작 전에 대기)
//    rdb에 재고관리를 할 경우에는 synchronized 통한다 하더라도, 쿼리와 commit 실행시점의 차이로 인해서 동시성이슈를 완전히 해결할 수 없음.
//    public synchronized static void borrow() {
    public static void borrow() {
        if (bookCount > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount--;
            System.out.println("대출 완료 OOO ");
        } else {
            System.out.println("XXX 대출 불가 ");
        }
    }
}
