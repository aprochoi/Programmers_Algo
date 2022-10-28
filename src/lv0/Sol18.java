package lv0;

public class Sol18 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int res = 0;

        res = 12000 * n + 2000 * k - n/10 * 2000;

        if (n >= 10) {
            while (n >= 10) {
                res -= 2000;
                n -= 10;
            }
        }

        return res;

//         return (12000 * n) + (2000 * k) - (n/10 * 2000);
    }
}
