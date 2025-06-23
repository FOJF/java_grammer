package C03Inheritance;

public class C04ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자가 존재
//    public : 프로젝트 전체에서 접근 가능(다른 패키지여도 접근가능)
//    private : 클래스 내에서만 접근 가능
//    default : 생략 가능. 패키지 내에서만 접근 가능
//    protected : 패키지를 벗어나더라도 상속 관계인 경우에는 접근 가능

    public String str1 = "hello java1";
    private String str2 = "hello java2";
    String str3 = "hello java3";
    protected String str4 = "hello java4";

    public static void main(String[] args) {

    }
}
