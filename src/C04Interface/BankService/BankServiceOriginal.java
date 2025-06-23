package C04Interface.BankService;

public class BankServiceOriginal {
    public void deposit(long money, BankAccount bankAccount) {
// 현재 얼마 있는 지 조회
// 그 금액과 money를 합산하여 updateBalance
        bankAccount.updateBalance(bankAccount.getBalance() + money);
    }

    public boolean withdraw(long money, BankAccount bankAccount) {
// 현재 얼마 있는 지 조회
        if (bankAccount.getBalance() < money) return false;
// 잔액을 체크하고, 출금이 가능하면 조회한 금액에서 money를 차감한 금액을 updateBalance
        bankAccount.updateBalance(bankAccount.getBalance() - money);
        return true;
    }
}
