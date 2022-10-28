package lv0;

public class Sol19 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }

        return res;
    }
}
