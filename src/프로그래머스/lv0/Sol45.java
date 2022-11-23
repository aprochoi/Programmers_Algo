package 프로그래머스.lv0;

public class Sol45 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }

    public static int solution(int order) {
        int res = 0;
        String str = String.valueOf(order);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                res++;
            }
        }

        return res;
    }
}
