package C03Inheritance.ProtectedPackage;

// 패키지 바로 하위의 모든 class는 *로 import가능하지만
// 패키지 안의 패키지 안에 있는 클래스는 *로 import 안 됨
import C03Inheritance.*; // 같은 패키지내의 클래스가 아닌 경우에는 import를 해야함

public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest p1 = new ProtectedTest();
//        public 접근 제어자는 프로젝트 전역에서 접근 가능
        p1.str1 = "hello python";
//        p1.str2 = "hello python"; //private 이라 다른 클래스에서는 안 됨
//        p1.str3 = "hello python"; //default 이라 패키지가 달라져서 접근 안 됨
        p1.str4 = "hello python"; // 상속관계가 있을 경우, 패키지가 달라도 protected변수에 접근 가능.

        C04ProtectedClass c1 = new C04ProtectedClass();
//        c1은 부모클래스의 객체이므로, 상속관계가 있는 객체가 아니므로, protected변수에 접근 불가
//        c1.str4 = "hello python";
    }
}
