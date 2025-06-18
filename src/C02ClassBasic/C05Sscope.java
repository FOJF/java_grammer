package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C05Sscope {
    public static int v2 = 10;
    public static void main(String[] args) {
//        지역변수의 유효범위
        int v1 = 10;
        scope(v1);
        System.out.println(v1);

//        객체의 유효범위
        C04Person p1 = new C04Person();
        p1.setName("kim");
        p1.setEmail("kim@naver.com");
        p1.setAge(20);
        scope2(p1);
        System.out.println(p1.personInfoToString());

        List<C04Person> myList = new ArrayList<>();
        myList.add(p1);
        myList.get(0).setAge(40);
        System.out.println(p1.personInfoToString());

//        클래스 변수의 유효범위
        System.out.println(v2);
        int total = 0;

    }

    // call by value
    public static void scope(int v1) {
        v1 = 20;
        System.out.println(v1);
    }

    // call by reference
    public static void scope2(C04Person person) {
        person.setAge(30);
        System.out.println(person.personInfoToString());
    }
}
