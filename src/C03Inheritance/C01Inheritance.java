package C03Inheritance;

// extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는 것.
// java에서는 클래스의 다중상속을 지원하지 않음 -> 오버라이딩을 강제하지 않아서 메서드, 변수가 겹치는 경우 어떤 클래스의 메서드를 호출하는 것인지에 대한 혼선이 존재하기 때문에
public class C01Inheritance extends Parents {
    public int b = 20;

    public static void main(String[] args) {
        C01Inheritance c1 = new C01Inheritance();

//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
//        System.out.println(c1.c);

//        메서드 상속
        c1.m1();

        c1.m2();
    }

//    부모 메서드의 재정의(Overriding) : 부모 클래스의 메서드명과 자식 클래스의 메서드 명이 동일한 상황.    !!!<<자식 클래스의 메서드가 사용됨>>!!!


    @Override  // 오버라이드 된 메서드임을 명시적으로 표현하는 표현식. (자바 컴파일러에게 미리 알려주는 역할을 하기도 함, 실제 코드의 작동에는 영향이 없지만, 성능적 우위가 있다고 알려져 있음)
    public void m1() {
        System.out.println("자식 클래스의 m1 메서드 입니다.");
    }

    public void m2() {
        System.out.println("자식 클래스의 m2 메서드 입니다.");
    }
}

class Parents {
    public int a = 10;

    //    private 접근 제어자는 해당 클래스 내부에서만 접근 가능. 자식 클래스에서도 접근 불가
    private int c = 20;

    public void m1() {
        System.out.println("부모 클래스의 m1 메서드 입니다.");

    }
}
