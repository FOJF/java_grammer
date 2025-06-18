package C02ClassBasic;

public class C04PersonMain {
    public static void main(String[] args) {
////        회원 가입예시
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//
//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 35;
//
//        printMember1(name1, email1, age1);
//        printMember2(name2, email2, age2);
////        위와 같은 방식의 문제점
////        요소들이 그룹화가 되어있지 않다 보니, 중복과 코드의 가독성이 저하
////        라는 문제점을 해결하기 위해 클래스에 속성을 정의 하고, 객체를 생성하여 그룹화.


//        C04Person p1 = new C04Person();
//        C04Person p2 = new C04Person();
//
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age = 30;
//
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age = 35;
//
////        p1을 별도의 메서드 없이 그냥 출력할 경우 p1의 힙메모리 주소값을 출력
//        System.out.println(p1);
//        printMember2(p1);
//
//        printMember2(p2);
////        Person의 변수값이 public으로 오픈되어 있을 경우 다른 클래스(패키지)에서 너무 쉽게 변경 가능
//        p2.name = "honggildong2";
//        printMember2(p2);

        C04Person p3 = new C04Person();
        p3.setName("hong3");
        p3.setEmail("hong3@naver.com");
        p3.setAge(30);

//        printMember2(p3);
//        p3.printPerson();

        System.out.println(p3.personInfoToString());
    }

    public static void printMember1(String name, String email, int age) {
        System.out.println("이름은 : " + name + ", 이메일은 : " + email + ", 나이는 : " + age);
    }

    //    public static void printMember2(String name, String email, int age) {
//        System.out.println("이름은 : " + name + ", 이메일은 : " + email + ", 나이는 : " + age);
//    }
//    public static void printMember2(C04Person person) { // person은 객체의 주소값이 매개변수로 전달
//        System.out.println("이름은 : " + person.name + ", 이메일은 : " + person.email + ", 나이는 : " + person.age);
//    }

    public static void printMember2(C04Person person) { // person은 객체의 주소값이 매개변수로 전달
        System.out.println("이름은 : " + person.getName() + ", 이메일은 : " + person.getEmail() + ", 나이는 : " + person.getAge());
    }
}
