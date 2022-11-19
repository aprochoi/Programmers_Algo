package lv0;

public class Sol76 {
    static int solution(int n) {
        int res = 1;
        int cnt = 1;
        String numStr = "";

        while (true) {

            if (res % 3 == 0) {
                res++;
                continue;
            }

            numStr = String.valueOf(res);
            if (numStr.contains("3")) {
                res++;
                continue;
            }

            if (cnt == n) break;

            res++;
            cnt++;
        }


        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));

    }
}
