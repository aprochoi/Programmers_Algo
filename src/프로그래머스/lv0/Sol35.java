package 프로그래머스.lv0;

public class Sol35 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int fac = 1;
        int i = 0;

        while (true) {
            if (fac <= n) {
                fac *= i+1;
                i++;
            } else break;
        }

        return i - 1;
    }
}
