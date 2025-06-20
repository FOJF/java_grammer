package C02ClassBasic;

public class C12RecursivePractice {
    public static void main(String[] args) {
//        for문으로 1~10까지 누적합계
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("sum = " + sum);

//        int end = 35000;
//
//        System.out.println("sumAcc(1,10,0) = " + sumAcc1(1, end, 0));
//
//        System.out.println("sumAcc(1,10,0) = " + sumAcc2(1, end));

//        System.out.println("fac(5, 1) = " + fac(5, 1));

        System.out.println("fib(10) = " + fib(10));
        System.out.println("fib(10) = " + fibTail(10, 0,1));
        System.out.println("fib(10) = " + fibDP(10));
    }

    public static int sumAcc1(int start, int end, int sum) {
        if (start == end) return sum + start;

        sum += start;
        return sumAcc1(start + 1, end, sum);
    }

    public static int sumAcc2(int start, int end) {
        if (start == end) return start;

        return start + sumAcc2(start + 1, end);
    }

    public static int fac(int n, int total) {
        if (n == 1) return total;

        total *= n;
        return fac(n - 1, total);
    }

    public static int fib(int n) {
        if (n < 3) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static int fibTail(int n, int before, int next) {
        if (n == 1) return next;

        return fibTail(n-1, next, before + next);
    }

    public static int fibDP(int n) {
        int[] dp = {1, 1};

        if (n < 3) return dp[n-1];

        for (int i = 3; i <= n; i++) {
            int tmp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = tmp;
        }

        return dp[1];
    }
}
