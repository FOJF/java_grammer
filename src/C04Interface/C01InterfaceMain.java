package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();
        C01Dog d1 = new C01Dog();
        d1.makeSound();

//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰 수 있음.
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makeSound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makeSound();

//        예시
/*
        인터페이스의 장점 : 개발의 표준을 지정 가능함
        다형성의 장점 : 기존의 구현체를 다른 구현체로 변경시 이점.
 */

//        자유롭게 구현체를 변경할 수 있는 이점이 있음
        List<Integer> myList = new ArrayList<>();
        List<Integer> myList2 = new LinkedList<>();

//        다중 구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한.
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        C01AnimalInterface1 c3 = new C01Cat();
        C01AnimalInterface2 d3 = new C01Dog();
        
        c3.makeSound();
        System.out.println(d3.play("말티푸", "시바견"));
    }
}
