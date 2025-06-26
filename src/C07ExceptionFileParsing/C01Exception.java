package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식
////        예외처리 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("나눗셈 프로그램입니다.");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("분자를 입력해주세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
////            double result = (double) head / tail;
////            System.out.println("두 수를 나눈 결과값은 " + result);
//            int result1 = head / tail;
//            System.out.println("두 수를 나눈 결과값은 " + result1);
//        } catch (ArithmeticException e) { // 예외처리를 분기 처리
//            System.out.println("\nXXXXXXXXXX 0으로 나눗셈이 가능해? 정신 차려 XXXXXXXXXX\n");
////            아래와 같은 방식으로 시스템 로그를 기록.
//            e.printStackTrace();
//            System.out.println(e.getMessage()); // 메세지만 간단히 출력
//        } catch (NumberFormatException e) {
//            System.out.println("\nXXXXXXXXXX 문자를 입력하고 있네. 정신 차려 XXXXXXXXXX\n");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("\nXXXXXXXXXX 아니 뭘 했길래 이걸 출력하게 만드냐. 정신 차려 XXXXXXXXXX\n");
//            e.printStackTrace();
//        } finally {
////            예외가 발생하던 아니던 무조건 실행시키고 싶을때 사용
//            System.out.println("무조건 실행되는 문구입니다.");
//        }
//
////        System.out.println("hello World");
//        System.out.println("로그인을 위한 비밀번호 입력");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        login(input);
////        login(null);
//
////        checked exception 은 예외처리를 위임받게 되면, 반드시 예외처리를 하거나, 다시 throws 해야함.
////        넘겨 받아서 처리하는 경우
////        try {
////            login2(input);
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        }
//        System.out.println("환영합니다.");

//        checked exception의 경우
//        1) 호출 받는 쪽에서 예외처리를 하거나
//        String result = fileRead("src/C07ExceptionFileParsing/d.txt");

//        2) throws를 통해서 checked예외처리를 위임받게되면, throws가 의미 있으며
//        String result = null;
//        try {
//            result = fileRead("C07ExceptionFileParsing/test.txt");
//        } catch (IOException e) {
//            throw new RuntimeException("파일 입출력과정에서 예외가 발생했습니다.");
//        }

//        3) checked exception을 메서드에서 처리해서 호출하는 쪽은 Unchecked로 전달 받은 것을 다시 처리하여 사용자에게 메세지 전달
        String result = null;
        try {
            result = fileRead("src/C07ExceptionFileParsing/d.txt");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(result);
    }

    //    throws 키워드를 통해 예외를 위임
//    다만, unchecked 예외에서는 예외처리가 강제가 이니므로, throws가 큰 의미는 없음.
//    그러나, checked 예외에서는 예외처리가 강제되기 때문에, throws가 의미가 있음.
    static boolean login(String password) throws IllegalArgumentException, NoSuchElementException {
        if (password == null) {
//            예외를 강제 발생시킴으로서 이시점에 해당 메서드 강제 종료
//            예외는 기본적으로 해당메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 입력하지 않으셨습니다.");
        } else if (password.equals("1234")) {
            return true;
        } else {
            throw new NoSuchElementException("그러한 비밀번호가 없습니다.");
        }
    }

//    static boolean login2(String password) throws SQLException {
//        if (password.equals("1234")) {
//            return true;
//        } else {
////            checked exception은 예외 처리가 강제
////            해당 메서드내에서 예외처리를 하든, 아니면 명시적으로 throws를 통해 호출 메서드 쪽에 위임.
//

    /// ///            직접 하는 경우
    /// /            try {
    /// /                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /// /                br.readLine();
    /// /            } catch (Exception e) {
    /// /
    /// /            }
//
//
//            throw new SQLException("비밀번호를 잘 못 입력1");
//        }
//    }
    static String fileRead(String path) throws RuntimeException {
//        static String fileRead(String path) throws IOException {
        Path filePath = Paths.get(path);

//        checked exception의 경우 예외처리가 강제
//        방법 1. checked를 try catch한 후에 다시 unchecked 예외를 다시 throw
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
//            코드 중지 목적으로 보통은 unchecked exception으로 다시 throw
            throw new RuntimeException("입출력 에러 발생");
        }

//        방법2. 메서드를 호출하는 쪽으로 예외를 위임
//        String text = Files.readString(filePath);

        return text;
    }

}
