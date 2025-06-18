package C02ClassBasic;

public class C04Person {
//    public String name;
//    public String email;
//    public int age;

//    변수의 안정성을 높이기 위해 private 사용, 다른 클래스에서 접근 불가능
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void printPerson() {
//        System.out.println("이름은 : " + this.name + ", 이메일은 : " + this.email + ", 나이는 : " + this.age);
//    }

    public String personInfoToString() {
        return "이름은 : " + this.name + ", 이메일은 : " + this.email + ", 나이는 : " + this.age;
    }

    /*
    객체 메서드들끼리의 호출은 객체가 만들어져있다는 게 가정되기 때문에 호출가능.

    클래스 메서드 : 객체 생성 없이 호출 가능
    객체 메서드 : 메서드 호출시 객체 생성이 반드시 필요

    1번 클래스 메서드에서 2번 객체 메서드를 객체 생성없이 호출 가능 ? XXX 1번 클래스 메서드 사용시 객체가 생성되어있지 않아서 객체가 생성되어 없이 호출이 불가능한 객체 메서드를 호출할 수 없음
    1번객체 메서드에서 2번객체 메서드를 객체 생성없이 호출 가능 ? OOO 1번객체 메서드가 호출되었다는건 이미 객체가 생성되어있다는 뜻 -> 또 생성할 필요는 없음
     */

    public String personInfoToString2() {
        return personInfoToString();
    }

    public static String personInfoToString3() {
//        String tmp = this.personInfoToString(); // 불가능
        return null;
    }

//    메서드는 public 하게 별도 만들어서 의도를 명확히 하여, 변수의 안정성을 향상
}
