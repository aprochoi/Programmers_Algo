package 프로그래머스.lv0;

public class Sol61 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        Double a = Math.sqrt(n);

        if (a == a.intValue()) {
            return 1;
        }
        else return 2;
    }
}
