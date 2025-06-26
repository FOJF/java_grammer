package C07ExceptionFileParsing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C02File {
    private static final String FILE_PATH_NAME = "src/C07ExceptionFileParsing/test.txt";
    public static void main(String[] args) throws IOException {
//      콘솔창에 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

//        파일에서 읽기 : IO 패키지 - 성능이 더 느림
//        BufferedReader br2 = new BufferedReader(new FileReader(FILE_PATH_NAME));
//        String line = br2.readLine();
//
//        while (line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }

//        파일에서 읽기 : NIO패키지 - 성능이 더 빠름
        Path filePath = Paths.get(FILE_PATH_NAME);
//        readString : 문자열객체를 통채로 read
        String all = Files.readString(filePath);
        System.out.println(all);

//        readAllLines : 문자열을 라인별로 split하여 list형태로 저장
        List<String> lines = Files.readAllLines(filePath);

        lines.forEach(System.out::println);
        System.out.println(lines);

//        파일 쓰기
        Files.write(filePath, "홍길동".getBytes(), StandardOpenOption.CREATE_NEW); // 새로 입력
        Files.write(filePath, "홍길동\n".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
        Files.write(filePath, "\n홍길동".getBytes(), StandardOpenOption.APPEND); // 이어쓰기
    }
}
