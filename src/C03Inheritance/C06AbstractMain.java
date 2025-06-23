package C03Inheritance;

import java.util.List;

public class C06AbstractMain {
    public static void main(String[] args) {
        AbstractDog ad = new AbstractDog();
        ad.makeSound2();
        ad.makeSound1();

//        추상 클래스는 구현체 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();
//        a1.makeSound2();

//        객체의 실체가 dog클래스를 통해 만들어지므로, 여기서는 abstractDog의 makeSound2를 사용가능
        AbstractAnimal abstractDog = new AbstractDog();
        abstractDog.makeSound1();
        abstractDog.makeSound2();

//        모든 메서드가 abstract인 클래스를 인터페이스라고 한다.
//        인터페이스는 구현체가 없으므로, 기본적으로 별도의 객체 생성 불가
//        List<Integer> myList = new List<>();

    }
}

abstract class AbstractAnimal {
    void makeSound1() {
        System.out.println("동물은 소리를 냅니다.");
    }

    //    메서드를 선언만 하고 구현이 없는 메서드 선언시 abstract 키워드 사용.
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal {

    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

// final이기 때문에 상속이 불가능. final 키워드가 붙은 메서드는 overriding 불가.
final class FinalParents {

}
