package C01Basic;

import java.util.HashSet;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {
//        중복 X, 순서보장X
        Set<String> mySet = new HashSet<>();
        
        mySet.add("H");
        mySet.add("H");
        mySet.add("E");
        mySet.add("L");
        mySet.add("L");
        mySet.add("O");
        mySet.add("O");
        mySet.add("E");
        mySet.add("H");

        System.out.println("mySet = " + mySet);
    }
}
