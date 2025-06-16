package C01Basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C09Map {
    public static void main(String[] args) {
//        key, value로 이루어진 자료 구조
//        key 값은 중복이 있으면 덮어쓰기 함
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 3);
//        sports.put("배구", 1);
//
////        맵은 key를 통해 value를 get
////        map에서 key를 통한 검색복잡도는 O(1)
//        System.out.println("sports.get(\"농구\") = " + sports.get("농구"));
//
//
////        맵의 전체 데이터 출력
//        System.out.println(sports);
//
////        맵의 key값 접근시에 index사용 불가능 (순서가 없기 때문)
////        keySet() : map의 key목록을 리턴하는 메서드
////        values() : map의 value들을 리턴하는 메서드
//        int total = 0;
//        for (String s : sports.keySet()) {
//            System.out.println(s + " : " + sports.get(s));
//        }
//
//        for (int v : sports.values()) {
//            total += v;
//        }
//        System.out.println("total = " + total);
//
////        remove : 키를 통해 map 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
////        map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//
////        putIfAbsent : key 값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("tennis", "테니스");
//        System.out.println(sports);
//
////        containsKey : key가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));
//
////        map 출력 방법 두가지 : 1. 강화된 for문 , 2. Iterator
////        Enhanced for
//        for (String s : sports.keySet()) {
//            System.out.println(s + " : " + sports.get(s));
//        }
//
////        Iterator를 통한 데이터 소모 (Iterator 활용)
////        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
////        hasNext메서드는 iterator안에 그 다음 값이 있는 지 없는 지 boolean으로 리턴
//        Iterator<String> it = sports.keySet().iterator();
//        while(it.hasNext()) {
//            String s = it.next();
//            System.out.println(s + " : " + sports.get(s));
//        }
//
////        map은 key의 value수를 count하는 목적으로 많이 사용
//        String[] arr = {"농구", "축구", "농구", "축구", "야구"};
////        농구 : 2, 축구 : 2, 야구 : 1
//
////        arr을 Map에 넣어보기
//        Map<String, Integer> sports = new HashMap<>();
//        for(String s : arr) {
//            if (sports.containsKey(s))
//                sports.put(s, sports.get(s)+1);
//            else sports.put(s, 1);
//        }
//
////        getOrDefault(key, defaultValue) : key 값이 없을 경우 defaultValue 리턴
//        for(String s : arr) {
//            sports.put(s, sports.getOrDefault(s, 0) + 1);
//        }
//
//
//        System.out.println("sports = " + sports);


//        map에서 제거해보기
//        String[] arr = {"농구", "축구", "농구", "축구", "야구"};
//
//        Map<String, Integer> sports = new HashMap<>();
//
//        for(String s : arr) {
//            sports.put(s, sports.getOrDefault(s, 0) + 1);
//        }
//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//
//        for (String s : removeArr) {
//            if (!sports.containsKey(s)) continue;
//
//            sports.put(s, sports.get(s)-1);
//
//            if (sports.get(s) == 0) sports.remove(s);
//        }
//
//        System.out.println(sports);
//

//        가장 value가 큰 key값 찾기
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구",3);
//        myMap.put("농구",2);
//        myMap.put("야구",1);
//
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//        for(String s : myMap.keySet()) {
//            if (max < myMap.get(s)) {
//                max = myMap.get(s);
//                maxKey = s;
//            }
//        }
//
//        System.out.println("maxKey = " + maxKey);
//
////        문자열 비교
//        String s1 = "hello";
//        String s2 = "dello";
//        String s3 = "hello";
//
//        System.out.println(s1.compareTo(s2)); // 양수면 뒤에 있는 String, 음수면 앞에 있는 String이 더 빠름, 같으면 같음
//        System.out.println(s2.compareTo(s1)); // 양수면 뒤에 있는 String, 음수면 앞에 있는 String이 더 빠름, 같으면 같음

//        백준 : 베스트 셀러
//        프로그래머 : 완주하지 못한 선수
//        프로그래머 : 의상

//        LinkedHashMap : 데이터의 삽입순서를 보장(유지)
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5", 1);
        linkedMap.put("hello4", 2);
        linkedMap.put("hello3", 3);
        linkedMap.put("hello2", 4);
        linkedMap.put("hello1", 5);

        System.out.println(linkedMap);

//        TreeMap : Key를 정렬(오름차순)하여 map을 저장

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("hello5", 1);
        treeMap.put("hello4", 2);
        treeMap.put("hello3", 3);
        treeMap.put("hello2", 4);
        treeMap.put("hello1", 5);

        System.out.println(treeMap);
    }
}
