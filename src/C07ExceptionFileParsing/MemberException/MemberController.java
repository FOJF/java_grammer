package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    private final static int PW_MIN_LENGTH = 5;

    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.회원가입, 2.회원 상세 조회, 3.회원 목록 조회");
            String input = sc.nextLine();

            if (input.equals("1")) { // 이름, 이메일, 비밀번호를 입력받아서 service에게 전달, 예외 발생시 적절한 문구를 사용자에게 출력
                System.out.println("--------------------------------");
                System.out.println("아래의 정보들을 입력해주세요.");

                System.out.print("이름 : ");
                String name = sc.nextLine();

                System.out.print("이메일 : ");
                String email = sc.nextLine();

                System.out.print("비밀번호 : ");
                String password = sc.nextLine();

                try {
                    // 비밀번호가 너무 짧을 경우 예외가 넘어옴
                    isValidPassword(password);
                    // 이메일이 중복인 경우 예외가 넘어옴
                    memberService.register(name, email, password);
                } catch (IllegalArgumentException | EmailAlreadyExistsException e) {
                    System.out.println(e.getMessage());
                }

            } else if (input.equals("2")) { // 회원 정보 출력, 예외 발생시 적절한 문구 사용자에게 출력
                System.out.print("찾고 싶은 회원의 ID : ");
                String id = sc.nextLine();
                try {
                    System.out.println(memberService.findMember(Long.parseLong(id)));
                } catch (NumberFormatException e) {
                    System.out.println("숫자가 아닌 입력.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("존재하지 않는 ID (" + e.getMessage() + ")");
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("3")) { // 회원 목록 출력
                memberService.findAll().forEach(System.out::println);
            } else if (input.equals("4")) {
                String email = sc.nextLine();
                String password = sc.nextLine();
                try {
                    memberService.login(email, password);
                } catch (NoSuchElementException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private static void isValidPassword(String pw) throws IllegalArgumentException {
        if (pw.length() < PW_MIN_LENGTH)
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다. (" + PW_MIN_LENGTH + "자리 이하의 비밀번호를 입력)");
    }
}
