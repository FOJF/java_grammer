package C01Basic;

import java.util.HashMap;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) {
//        key, value로 이루어진 자료 구조
//        key 값은 중복이 있으면 덮어쓰기 함
        Map<String, Integer> sports = new HashMap<>();
        sports.put("농구", 3);
        sports.put("배구", 1);

//        맵은 key를 통해 value를 get
//        map에서 key를 통한 검색복잡도는 O(1)
        System.out.println("sports.get(\"농구\") = " + sports.get("농구"));
    }
}
