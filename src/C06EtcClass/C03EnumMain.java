package C06EtcClass;

public class C03EnumMain {
    public static void main(String[] args) {
//        classGrade를 일반 문자열로 세팅할 경우 아래와 같은 문제가 발생할 수 있음
//        (같은 정보를 각각 다르게 표현한 정보가 들어갈 수 있다. -> 추후 classGrade를 가지고 조작을 할 때 문제가 발생할 가능성이 매우 높아짐)
//        Student s1 = new Student("hong1", "1학년");
//        Student s2 = new Student("hong2", "firstGrade");
//        Student s3 = new Student("hong3", "first_grade");


//        static final을 통해 변수값 관리하는 방법 -> 하지만 타입이 String이므로 얼마든지 자유롭게 세팅이 가능하다.
//        Student s1 = new Student("hong1", ClassGrade.c1);
//        Student s2 = new Student("hong2", ClassGrade.c2);
//        Student s3 = new Student("hong3", "일학년");

//        enum을 사용하여 목적을 명확히 세팅
        Student s1 = new Student("hong1", ClassGrade.FIRST_GRADE);
        Student s2 = new Student("hong2", ClassGrade.FIRST_GRADE);
        Student s3 = new Student("hong3", ClassGrade.SECOND_GRADE);

        System.out.println(s1);

        System.out.println(s1.getClassGrade());
    }
}

//class Student {
//    private String name;
//    private String classGrade;
//
//    public Student(String name, String classGrade) {
//        this.name = name;
//        this.classGrade = classGrade;
//    }
//}

//class ClassGrade {
//    final static String c1 = "FIRST_GRADE";
//    final static String c2 = "SECOND_GRADE";
//    final static String c3 = "THIRD_GRADE";
//}

class Student {
    private String name;
    private ClassGrade classGrade;

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';
    }
}

enum ClassGrade {
    FIRST_GRADE(0),
    SECOND_GRADE(1),
    THIRD_GRADE(3);

    ClassGrade(int i) {
    }
}