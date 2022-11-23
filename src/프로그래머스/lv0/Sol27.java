package 프로그래머스.lv0;

public class Sol27 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }

    public static long solution(int balls, int share) {
        share = Math.min(balls - share, share);
        System.out.println("share = " + share);
        if (share == 0)
            return 1L;

        long result = solution(balls - 1, share - 1);
        System.out.println("result = " + result);
        result *= balls;
        result /= share;

        return result;
    }
}
