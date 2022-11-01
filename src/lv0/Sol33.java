package lv0;

public class Sol33 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int res = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                res++;
            }
            count = 0;
        }

        return res;
    }
}
