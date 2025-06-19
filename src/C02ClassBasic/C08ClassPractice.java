package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {
//        List<Account> myList = new ArrayList<>();
//        Account a1 = new Account("hong1", "1234-4231-1234", 100000);
//        Account a2 = new Account("hong2", "3123-4231-1234", 200000);
//
//        myList.add(a1);
//        myList.add(a2);
//
////        계좌 번호 목록 출력
//        for (Account a : myList) {
//            System.out.println(a.getAccountNumber());
//        }
//
////        사용자1이 사용자2에게 송금
//        boolean isSuccess = true;
//        int amount = 500000;
//        for (Account a : myList) {
//            if (a.getAccountNumber().equals("1234-4231-1234")) {
//                isSuccess = a.updateBalance(-amount);
//                System.out.println("잔액 부족");
//                break;
//            }
//        }
//
//        for (Account a : myList) {
//            if (isSuccess && a.getAccountNumber().equals("3123-4231-1234")) {
//                a.updateBalance(amount);
//                break;
//            }
//        }

////        계좌 상세 조회 : 계좌 번호와 잔고 조회
//        for (Account a : myList) {
//            System.out.println(a);
//        }

//        Map으로 저장
        Map<String, Account> accountMap = new HashMap<>();

        accountMap.put("12345", new Account("hong1", "12345", 300000));
        accountMap.put("54321", new Account("hong2", "54321", 100000));

//      송금 로직
        Account from = accountMap.get("12345");
        Account to = accountMap.get("54321");

        int amount = 500000;
        if (from.updateBalance(-amount)) to.updateBalance(amount);
        else System.out.println("잔고 부족!");

//        계좌 상세 조회
        for (Account acc : accountMap.values()) {
            System.out.println(acc);
        }
    }
}

// Account 클래스. 계좌주명(name), 계좌번호(accountNumber), 잔고(balance)
class Account {
    String name;
    String accountNumber;
    long balance;

    public Account() {
    }

    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public boolean updateBalance(long amount) {
        if (amount < 0 && this.balance < -amount) return false;
        this.balance += amount;
        return true;
    }

    @Override
    public String toString() {
        return "예금주 : " + name + ", 계좌 번호 : " + accountNumber + ", 잔고 : " + balance + "원";
    }


}