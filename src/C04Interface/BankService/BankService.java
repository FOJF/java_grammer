package C04Interface.BankService;

public interface BankService {
    String deposit(long money, BankAccount bankAccount);

    boolean withdraw(long money, BankAccount bankAccount);
}
