package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email(Author 객체 가능)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료
public class C10BoardService {
    public static void main(String[] args) throws IOException {
        Map<Long, Author> authorMap = new HashMap<>();
        Map<Long, Post> postMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("\n-----------------------------------------------------------------------------------------------");
            System.out.println(" 1.회원가입 2.회원 전체 목록 조회 3.회원 상세 조회 4.게시글 작성 5.게시글 목록 조회 6.게시물 상세 조회 7.프로그램 종료");
            System.out.println("-----------------------------------------------------------------------------------------------\n");
            System.out.print("원하는 서비스 번호 입력 : ");
            switch (br.readLine()) {
                case "1" -> {
                    System.out.print("이름 입력 : ");
                    String name = br.readLine();

                    System.out.print("이메일 입력 : ");
                    String email = br.readLine();

                    if (authorMap.containsValue(new Author(email))) {
                        System.out.println("이미 존재하는 이메일");
                        continue;
                    }

                    System.out.print("비밀번호 입력 : ");
                    String password = br.readLine();

                    Author newAuthor = new Author(name, email, password);

                    authorMap.put(newAuthor.getId(), newAuthor);
                }

                case "2" -> {
                    for (long i = 0; i < Author.getLastId(); i++) {
                        if (authorMap.get(i) == null) continue;

                        Author author = authorMap.get(i);
                        System.out.println("ID : " + author.getId() + ", 이메일 : " + author.getEmail());
                    }
                }

                case "3" -> {
                    System.out.print("상세 조회 하고 싶은 유저ID 입력 : ");
                    long id = Long.parseLong(br.readLine());

                    if (authorMap.containsKey(id)) System.out.println(authorMap.get(id));
                    else System.out.println("존재하지 않는 유저 ID");
                }

                case "4" -> {
                    System.out.print("제목 입력 : ");
                    String title = br.readLine();

                    System.out.print("내용 입력 : ");
                    String contents = br.readLine();

                    System.out.print("작성자 ID : ");
                    long id = Long.parseLong(br.readLine());
                    if (authorMap.containsKey(id)) {
                        Author author = authorMap.get(id);
                        Post newPost = new Post(title, contents, author);

                        author.addPost(newPost);
                        postMap.put(newPost.getId(), newPost);
                    } else System.out.println("존재하지 않는 유저 ID");
                }

                case "5" -> {
                    for (long i = 0; i < Post.getLastId(); i++) {
                        if (postMap.get(i) == null) continue;

                        Post post = postMap.get(i);
                        System.out.println("ID : " + post.getId() + ", 제목 : " + post.getTitle());
                    }
                }

                case "6" -> {
                    System.out.print("상세 조회 하고 싶은 게시글 ID 입력 : ");
                    long id = Long.parseLong(br.readLine());

                    if (postMap.containsKey(id)) System.out.println(postMap.get(id));
                    else System.out.println("존재하지 않는 게시글 ID");
                }

                case "7" -> {
                    System.out.println("서비스가 종료되었습니다.");
                    return;
                }

                default -> System.out.println("!!없는 서비스 번호!!");
            }
        }
    }
}

class Author {
    private static Long lastId = 0L;

//    일반적으로 클래스를 정의할 때 원시자료형은 wrapper클래스로 정의
    private Long id;
    private String name;
    private String email;
    private String password;

    private Map<Long, Post> myPosts;

    public Author(String name, String email, String password) {
        this.id = lastId++;
        this.name = name;
        this.email = email;
        this.password = password;
        this.myPosts = new HashMap<>();
    }

    public Author(String email) { // 이메일 비교를 위한 생성자
        this.id = -1L;
        this.email = email;
    }

    public static long getLastId() {
        return lastId;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void addPost(Post post) {
        myPosts.put(post.getId(), post);
    }

    @Override
    public String toString() {
        return "id : " + id + "\n이름 : " + name + "\n이메일 : " + email + "\n비밀번호 : " + password + "\n게시글 수 : " + myPosts.size() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) || Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}

class Post {
    private static Long lastId = 0L;

    private Long id;
    private String title;
    private String contents;
    private Author author;

    public Post(String title, String contents, Author author) {
        this.id = lastId++;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public static long getLastId() {
        return lastId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return id + ". 제목 : " + title + "\n작성자 이메일 : " + author.getEmail() + "\n내용 : " + contents;
    }
}