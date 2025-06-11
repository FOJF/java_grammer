package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
//        int n1 = 8;
//        int n2 = 3;
//
//        *:곱셈, /:나눗셈 몫, %:나머지
//        System.out.println("(n1*n2) = " + (n1*n2));
//        System.out.println("(n1/n2) = " + (n1/n2));
//        System.out.println("(n1%n2) = " + (n1%n2));

//        대입연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//
//        n1 = n1 - 3;
//        n2 -= 3;
//        n3 = -3;
//
//        System.out.println("n1 = " + n1);
//        System.out.println("n2 = " + n2);
//        System.out.println("n3 = " + n3);
//
//        int n4 = 10;
//        int n5 = 10;
//
//        n4 /= 3;
//        n5 %= 3;
//
//        System.out.println("n4 = " + n4);
//        System.out.println("n5 = " + n5);

//        증감연산자
//        int a = 10;
//        a = a+1;
//        System.out.println("a = " + a);
//        a += 1;
//        System.out.println("a = " + a);
//        a++; //후위증감연산자
//        System.out.println("a = " + a);
//        ++a; //전위증감연산자
//        System.out.println("a = " + a);

////        a++ : 현재 라인의 명령문이 실행되고 나서 증가
////        ++a : 현재 라인의 명령문이 실행되기 전에 증가
//        int b = 5;
//        int c = b++;
//        int d = ++b;
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//
//        int a = 10;
//        System.out.println(a++);
//
////        비교연산자 : ==, !=, >, >= 등
//        char ch1 = 'a';
//        char ch2 = 'b';
//
//        System.out.println(ch1 == ch2);
//        System.out.println(ch1 != ch2);

//        논리연산자 : &&, ||, !
        int num1 = 10;
        int num2 = 20;
        boolean b1 = num1 > 5 && num1 < 20;

        System.out.println("b1 = " + b1);

//        num2가 10과 30사이에 있는지 여부를 b2값에 세팅
        boolean b2 = num2 >= 10 && num2 <= 30;
        boolean b3 = !(num2 < 10 || num2 > 30);

        System.out.println("b2 = " + b2);

//        비트연산자 : 컴퓨터의 연산방식 &, |, ^, <<, >>
        
        int n1 = 5;
        int n2 = 4;

//        두 수를 비트 연산하면 2진법의 같은 자릿수에 모두 1이 있어야 그 자릿수가 1
        System.out.println("(n1&n2) = " + (n1&n2));

//        왼쪽으로 n칸 옮긴다는 의미는 해당 숫자값에 2의 n승만큼 곱하는 의미
//        오른쪽으로 n칸 옮긴다는 의미는 해당 숫자값에 2의 n승만큼 나누는 의미
    }
}
