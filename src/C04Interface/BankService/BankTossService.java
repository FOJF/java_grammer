package C04Interface.BankService;

public class BankTossService implements BankService {
    @Override
    public String deposit(long money, BankAccount bankAccount) {
        bankAccount.updateBalance(bankAccount.getBalance() + money);
        return "토스페이를 이용해주셔서 감사합니다. 잔액 : " + bankAccount.getBalance() + "원";
    }

    @Override
    public boolean withdraw(long money, BankAccount bankAccount) {
        // 현재 얼마 있는 지 조회
        if (bankAccount.getBalance() < money) return false;
        // 잔액을 체크하고, 출금이 가능하면 조회한 금액에서 money를 차감한 금액을 updateBalance
        bankAccount.updateBalance(bankAccount.getBalance() - money);
        return true;
    }
}