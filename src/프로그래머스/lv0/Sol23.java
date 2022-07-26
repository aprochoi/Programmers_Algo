package 프로그래머스.lv0;

import java.util.stream.IntStream;

public class Sol23 {
    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    public static int solution(int n) {
//        int res = 0;
//
//
//        double sqrt = Math.sqrt(n);
//
//        for (int i = 1; i < sqrt; i++) {
//            if(n % i == 0) res += 2;
//        }
//
//        if(n % sqrt == 0) res++;
//
//
//        return res;

        //stream 형식으로 풀이.
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
