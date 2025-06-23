package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();

        BankAccount ba = new BankAccount(accountNumber);
        BankService bs = null;
        while (true) {
            System.out.println("입금 하시려면 1번, 출금하시려면 2번, 잔액확인은 3번, 종료를 원하시면 exit을 입력");
            String serviceNumber = sc.nextLine();

            if (serviceNumber.equals("1")) {
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String number = sc.nextLine();
                if (number.equals("1")) bs = new BankKakaoService();
                else if (number.equals("2")) bs = new BankTossService();

                System.out.println("입금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());
//                서비스 계층이 있다면,
                System.out.println(bs.deposit(money, ba));
            } else if (serviceNumber.equals("2")) {
                System.out.println("출금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String number = sc.nextLine();
                if (number.equals("1")) bs = new BankKakaoService();
                else if (number.equals("2")) bs = new BankTossService();

                System.out.println("출금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());

                if (bs.withdraw(money, ba))
                    System.out.println("출금이 정상 처리 되었습니다.");
                else
                    System.out.println("잔액 부족으로 출금이 불가합니다.");
            } else if (serviceNumber.equals("3")) {
                System.out.println("잔액 : " + ba.getBalance() + "원");
            } else
                break;
        }
    }
}
