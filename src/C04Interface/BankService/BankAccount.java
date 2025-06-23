package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private Long balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0L;
    }

    //    최종 금액을 통해 update
    public void updateBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
