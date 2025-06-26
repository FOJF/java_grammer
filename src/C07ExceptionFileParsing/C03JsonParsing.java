package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper : json 직렬화 역직렬화를 위한 라이브러리
        ObjectMapper objectMapper = new ObjectMapper();


////        사용법 1. 객체로 바로 생성
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/myJson1.json");
//        String read = Files.readString(filePath);
//        Map<String, String> myMap = objectMapper.readValue(read, Map.class);
//        System.out.println(myMap);
//
//        Student s1 = objectMapper.readValue(read, Student.class);
//        System.out.println(s1);

//        사용법 2. 트리구조의 JsonNode로 변환 : JsonNode 객체명 = o1.readTree(문자열)
//        복잡한 json자료구조일 경우에 트리구조의 jsonNod사용
        Path filePath = Paths.get("src/C07ExceptionFileParsing/myJson2.json");
        String read = Files.readString(filePath);
        JsonNode jsonNodes = objectMapper.readTree(read);

//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("id", jsonNodes.get("id").asText());
//        myMap.put("name", jsonNodes.get("name").asText());
//        myMap.put("classNumber", jsonNodes.get("classNumber").asText());
//        myMap.put("city", jsonNodes.get("city").asText());
//
//        System.out.println(myMap);

//        실습 : myJson2를 가지고 List<Student> 형식으로 변환
        List<Student> myList = new ArrayList<>();
        for (JsonNode jsonNode : jsonNodes) {
            myList.add(objectMapper.readValue(jsonNode.toString(), Student.class));
        }
        System.out.println(myList);

//        json직렬화 : 객체 -> json 변환
        String myjson = objectMapper.writeValueAsString(myList);

        System.out.println(myjson);
    }
}

// 실제 값의 setting은 private이라 할지라도 직접 접근하여 setting. (reflection 기술을 활용하여 접근)
// objectmapper는 getter의 메서드명을 통해 필드값을 유추하므로, 반드시 기본생성자, getter는 있어야 함

class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public Student() {
    }

    public Student(int id, String name, String classNumber, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

