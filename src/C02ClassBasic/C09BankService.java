package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C09BankService {
    /*
        계좌개설 및 입출금 서비스 : id(auto_increment), accountNumber(String), balance(int).
        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 출력.
        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)
     */
    private static Map<String, BankAccount> bankAccountMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        startPoint:
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.print("서비스번호를 입력하세요.(취소는 exit을 입력) : ");
            String serviceNum = br.readLine();
            if (serviceNum.equals("exit")) break;

            switch (serviceNum) {
                case "1" -> {
                    System.out.print("원하는 계좌번호를 숫자로만 입력해주세요.(취소는 exit을 입력) : ");
                    String accNum = br.readLine();
                    if (accNum.equals("exit")) continue;
                    while (!isPossibleAccNum(accNum)) {
                        System.out.print("이미 존재하거나 잘못된 계좌번호 입니다. 다시 입력해주세요. (취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }
                    System.out.print("성함을 입력해주세요.(취소는 exit을 입력) : ");
                    String name = br.readLine();
                    if (name.equals("exit")) continue;

                    System.out.print("현재 소지한 금액을 입력해주세요.(취소는 exit을 입력) : ");
                    String amount = br.readLine();
                    if (amount.equals("exit")) continue;

                    while (!isUnsignedInt(amount)) { // 있으면 만들 수 없어서 다시 받아야 함
                        System.out.print("올바른 금액을 입력해주세요. (취소는 exit을 입력) : ");
                        amount = br.readLine();
                        if (amount.equals("exit")) continue startPoint;
                    }

                    makeAccount(name, accNum, Long.parseLong(amount));
                }

                case "2" -> {
                    System.out.print("계좌조회서비스입니다. 계좌번호를 숫자로만 입력해주세요.(취소는 exit을 입력) : ");
                    String accNum = br.readLine();
                    if (accNum.equals("exit")) continue;

                    while (!hasAccNum(accNum)) { // 없으면 다시 받아야 함
                        System.out.print("존재하지 않는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.(취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }
                    System.out.println("현재 잔액 : " + bankAccountMap.get(accNum).getBalance() + "원");
                }

                case "3" -> {
                    System.out.print("입금을 원하는 계좌번호를 숫자로만 입력해주세요.(취소는 exit을 입력) : ");
                    String accNum = br.readLine();
                    if (accNum.equals("exit")) continue;

                    while (!hasAccNum(accNum)) { // 없으면 다시 받아야 함
                        System.out.print("존재하지 않는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.(취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }

                    BankAccount ba = bankAccountMap.get(accNum);

                    System.out.print("입금하실 금액을 입력해주세요.(취소는 exit을 입력) : ");
                    String amount = br.readLine();

                    if (amount.equals("exit")) continue;

                    while(!isUnsignedInt(amount) ) {
                        System.out.print("제대로 금액을 입력해주세요.(취소는 exit을 입력) : ");
                        amount = br.readLine();
                        if (amount.equals("exit")) continue startPoint;
                    }

                    ba.deposit(Long.parseLong(amount));
                    System.out.println("입금 후 잔액 : " + ba.getBalance() + "원");
                }

                case "4" -> {
                    System.out.print("출금을 원하는 계좌번호를 숫자로만 입력해주세요.(취소는 exit을 입력) : ");
                    String accNum = br.readLine();
                    if (accNum.equals("exit")) continue;

                    while (!hasAccNum(accNum)) { // 없으면 다시 받아야 함
                        System.out.print("존재하지 않는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.(취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }

                    BankAccount ba = bankAccountMap.get(accNum);

                    System.out.print("출금하실 금액을 입력해주세요.(취소는 exit을 입력) : ");
                    String amount = br.readLine();

                    if (amount.equals("exit")) continue;

                    while(!isValidAmount(amount)) {
                        System.out.print("제대로 금액을 입력해주세요.(취소는 exit을 입력) : ");
                        amount = br.readLine();
                        if (amount.equals("exit")) continue startPoint;
                    }

                    if (ba.withdraw(Long.parseLong(amount))) System.out.println("출금 후 잔액 : " + ba.getBalance() + "원");
                    else System.out.println("잔고가 부족합니다. 현재 잔액 : " + ba.getBalance() + "원");
                }

                case "5" -> {
                    System.out.print("송금서비스입니다. 본인의 계좌번호를 입력해주세요.(취소는 exit을 입력) : ");
                    String accNum = br.readLine();
                    if (accNum.equals("exit")) continue;

                    while (!hasAccNum(accNum)) { // 없으면 다시 받아야 함
                        System.out.print("존재하지 않는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.(취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }
                    BankAccount from = bankAccountMap.get(accNum);

                    System.out.print("상대방의 계좌번호를 입력해주세요.(취소는 exit을 입력) : ");
                    accNum = br.readLine();
                    if (accNum.equals("exit")) continue;

                    while (!hasAccNum(accNum)) { // 없으면 다시 받아야 함
                        System.out.print("존재하지 않는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.(취소는 exit을 입력) : ");
                        accNum = br.readLine();
                        if (accNum.equals("exit")) continue startPoint;
                    }

                    BankAccount to = bankAccountMap.get(accNum);
                    System.out.print("출금하실 금액을 입력해주세요.(취소는 exit을 입력) : ");
                    String amount = br.readLine();

                    if (amount.equals("exit")) continue;

                    while(!isValidAmount(amount)) {
                        System.out.print("제대로 금액을 입력해주세요.(취소는 exit을 입력) : ");
                        amount = br.readLine();
                        if (amount.equals("exit")) continue startPoint;
                    }

                    if (from.transfer(Long.parseLong(amount), to)) System.out.println("송금 후 잔액 : " + from.getBalance() + "원");
                    else System.out.println("잔고가 부족합니다. 현재 잔액 : " + from.getBalance() + "원");
                }
            }
        }
    }

    private static boolean hasAccNum(String accNum) {
        return accNum.matches("^[0-9]*$") && bankAccountMap.containsKey(accNum);
    }

    private static boolean isPossibleAccNum(String accNum) {
        return accNum.matches("^[0-9]*$") && !bankAccountMap.containsKey(accNum);
    }

    private static boolean isValidAmount(String amount) {
        return amount.matches("^[0-9]*$") || amount.matches("^0*$");
    }

    private static boolean isUnsignedInt(String amount) {
        return amount.matches("^[0-9]*$");
    }

    private static void makeAccount(String name, String accNum, long amount) {
        bankAccountMap.put(accNum, new BankAccount(name, accNum, amount));
    }
}

class BankAccount {
    static int lastId = 0;

    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    public BankAccount() {
    }

    public BankAccount(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.id = lastId++;
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

    public void deposit(long amount) {
        this.balance += amount;
    }

    public boolean withdraw(long amount) {
        if (this.balance < amount) return false;

        this.balance -= amount;
        return true;
    }

    public boolean transfer(long amount, BankAccount toAccount) {
        if (!withdraw(amount)) return false;

        toAccount.deposit(amount);
        return true;
    }

    @Override
    public String toString() {
        return "예금주 : " + name + ", 계좌 번호 : " + accountNumber + ", 잔고 : " + balance + "원";
    }
}