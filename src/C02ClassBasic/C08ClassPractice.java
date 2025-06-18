package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
        List<Account> myList = new ArrayList<>();
        Account account1 = new Account("hong1", "1234-4231-1234", 120003420);
        Account account2 = new Account("hong2", "3123-4231-1234", 1303420);

        myList.add(account1);
        myList.add(account2);

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
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

    @Override
    public String toString() {
        return "예금주 : " + name + ", 계좌 번호 : " + accountNumber + ", 잔고 : " + balance;
    }
}