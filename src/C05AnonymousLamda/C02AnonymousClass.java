package C05AnonymousLamda;

// 익명 내부 클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal 을 상속한 클래스가 별도로 존재하지 않고,
//        익면클래스가 만들어짐과 동시에 익명객체가 생성되고 있음
        AbstractAnimal abstractAnimal = new AbstractAnimal() {
            @Override
            void makeSound1() {
            }
        };

        abstractAnimal.makeSound1();
        abstractAnimal.makeSound2();

//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성 가능

        Animal1 animal1 = new Animal1() {
            @Override
            public void makeSound1() {
            }

            @Override
            public void makeSound2() {
            }
        };

//        인터페이스의 익명 객체에 구현해야할 메서드가 1개 밖에 없을 때는 람다표현식 사용가능
        Animal2 animal2 = () -> {
            System.out.println("hello world 1");
            System.out.println("hello world 2");
        };

        animal2.makeSound1();

//        실행문이 한 줄 일 때는 중괄호 제거 가능
        Animal2 animal22 = () -> System.out.println("hello world 1");

//        한 줄이니까 중괄호를 없앨 수 있고, 중괄호를 없애면서 return도 없앨 수 있음
        Animal3 animal3 = (a, b, c) -> {
            return a + ", " + b + ", " + c;
        };
        Animal3 animal32 = (a, b, c) -> a + ", " + b + ", " + c;

        System.out.println(animal32.makeSound1("JAVA", "PYTHON", "C++"));

//        실습
//        Animal4 인터페이스 정의. makeSound메서드 선언 (매개변수는 String, String, int)(리턴 타입은 String)
//        익명 객체 생성 : 메서드의 기능 - int숫자값이 10이상이면 a+b를 리턴, int 숫자값이 10미만이면 a만 리턴
        Animal4 animal4 = (a, b, c) -> c < 10 ? a : a + b;

        System.out.println(animal4.makeSound("Hello", "World", 10));
        System.out.println(animal4.makeSound("Hello", "World", 9));
    }
}

abstract class AbstractAnimal {
    abstract void makeSound1();

    void makeSound2() {

    }
}

interface Animal1 {
    void makeSound1();

    void makeSound2();
}

interface Animal2 {
    void makeSound1();
}

interface Animal3 {
    String makeSound1(String a, String b, String c);
}

interface Animal4 {
    String makeSound(String a, String b, int c);
}
