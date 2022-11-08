package lv0;

public class Sol62 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {

        for (int i = 1; i <= t; i++) {
            n *= 2;
        }

        return n;
    }
}
