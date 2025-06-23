package C03Inheritance;


// 부모클래스를 상속 받을 때, 부모 클래스에서 기본생성자가 없으면 자식클래스에서 상속시 기본적으로 에러 발생
public class C02SuperKeyword extends Parents2 {

    int a = 10;

    public C02SuperKeyword() {
//        super() : 부모클래스의 생성자을 호출하는 메서드
        super(20);
        this.a = 15;
    }

    public static void main(String[] args) {
        C02SuperKeyword c2 = new C02SuperKeyword();
// 자식이 우선되기 때문
        System.out.println(c2.a);

        c2.display();

    }

    public void display() {
        System.out.println("자식의 변수 : " + a);
        System.out.println("부모의 변수 : " + super.a);
    }
}

class Parents2 {
    int a;

    public Parents2(int a) {
        this.a = a;
    }
}
