package 프로그래머스.lv0;

public class Sol4 {
    public static void main(String[] args) {
        System.out.println(solution(7)); // 1
        System.out.println(solution(1)); // 1
        System.out.println(solution(15)); // 3
        System.out.println(solution(14)); // 2
    }

    public static int solution(int n) {

//        if (n <= 7) {
//            return 1;
//        } else if (n % 7 == 0) {
//            return n / 7;
//        }
//        else return n/7+1;

        return n % 7 == 0 ? n/7 : n/7+1;

    }
}
