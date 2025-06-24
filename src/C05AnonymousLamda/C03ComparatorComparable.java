package C05AnonymousLamda;

import java.lang.reflect.Array;
import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공
//        Comparable 인터페이스 : compareTo 메서드 선언
//        Comparator 인터페이스 : compare 메서드 선언

//        String 클래스에 compareTo메서드 내장
//        String 클래스 및 자바에 많은 클래스에서 Comparable 을 implement하여 compareTo 메서드를 구현
        String a = "hello";
        String b = "world";

        System.out.println(a.compareTo(b)); // 음수

        List<String> mylist = new ArrayList<>();

        mylist.add("java");
        mylist.add("python");
        mylist.add("javascript");
//        String 안에 compareTo메서드를 사용하여 정렬이 이뤄짐.
        Collections.sort(mylist);

        List<Student> myStudentList = new ArrayList<>();

        myStudentList.add(new Student("김", 24));
        myStudentList.add(new Student("이", 21));
        myStudentList.add(new Student("박", 35));
        myStudentList.add(new Student("최", 15));
        myStudentList.add(new Student("김", 30));

//        정렬방법1. Student객체에서 Comparable을 직접 구현한 방식
//        Collections.sort에서 Comparable을 구현한 객체를 요구.
//        단점 : Student 객체를 직접 수정해야하므로, 유연성이 떨어짐.
//        만약 다른 사람들이랑 같이 개발하는데 그 사람들이 이미 만들어져있는 방식으로 정렬하고 있는데
//        나는 다른 방식을 원해서 객체에서 직접 코드를 변경하게 되면 다른 사람들이 작성한 코드들에 문제가 발생
//        Collections.sort(myStudentList);

//        정렬방법2. Comparator를 구현한 익명객체 사용.
//        Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문
//        2개가 같음
        myStudentList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        myStudentList.sort(Comparator.comparing(Student::getName));

        System.out.println(myStudentList);

//
        String[] strArr = {"java", "hello", "C++", "world"};
        Arrays.sort(strArr);
        Arrays.sort(strArr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(strArr));


//    백준 : 단어 정렬
//    백준 : 절댓값 힙

//    배열안의 배열 정렬
        int[][] arr = {{4,5},{1,2},{5,0},{3,1}};

        Arrays.sort(arr, ((o1, o2) -> o1[0]-o2[0]));
        System.out.println(Arrays.deepToString(arr));

        Arrays.sort(arr, ((o1, o2) -> o1[1]-o2[1]));
        System.out.println(Arrays.deepToString(arr));

        List<int[]> myList = new ArrayList<>();
        myList.add(Arrays.copyOf(arr[0],arr[0].length));
        myList.add(Arrays.copyOf(arr[1],arr[1].length));
        myList.add(Arrays.copyOf(arr[2],arr[2].length));
        myList.add(Arrays.copyOf(arr[3],arr[3].length));
        myList.sort(((o1, o2) -> o1[0]-o2[0]));

        for (int[] arrr : myList) {
            System.out.println(Arrays.toString(arrr));
        }
    }


}

//class Student implements Comparable<Student> {
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.getAge();
//    }

//    정렬은 결국 2개의 값을 비교하는 것이기 때문에, A와 B대상 2개만 있으면 충분.
//    두 값을 비교한 후 음수, 0, 양수를 리턴해서 그 값을 통해 정렬 수행
//    내부적으로 this가 앞에 있을 땐, 오름차순, this가 뒤에 있으면 내림차순으로 동작
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.getName());
//    }
}
