package C10Annotation;

import java.lang.reflect.Field;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        리플렉션 : 자바에서 런타임시점에 클래스의 변수를 수정할 수 있는 기능.
        Person p1 = new Person();
//        아래와 같은 방식을 통해 private변수인 name변수에 직접 접근
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true); // private 이라 할지라도 접근가능하다록 세팅변경.
        nameField.set(p1, "bradkim");
        System.out.println(p1);
    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}