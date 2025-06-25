package C06EtcClass;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C01Math {
    public static void main(String[] args) {
//        Math.random() 임의의 수 반환, 0.0 ~ 1.0 사이의 double 형 반환

//        로또 번호 7개 뽑기. 0~99 까지의 임의의 숫자
        Set<Integer> lotteryNumbers = new TreeSet<>();

        while(lotteryNumbers.size() < 7) {
            lotteryNumbers.add((int)(Math.random() * 100));
        }

        System.out.println(lotteryNumbers);

//        Math.abs() : 절대값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil() : 올림, Math.floor() : 내림, Math.round() : 반올림
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

//        Math.max() : 두 수 중 큰 값, Math.min() : 두 수 중 작은 값
        System.out.println(Math.min(10,20));
        System.out.println(Math.max(10,20));

//        Math.pow(a,b) : a^b를 리턴
        System.out.println(Math.pow(2,3));

//        Math.sqrt(a) : a의 제곱근
        System.out.println(Math.sqrt(25));
    }
}
