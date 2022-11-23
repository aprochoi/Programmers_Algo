package 프로그래머스.lv0;

public class Sol17 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
        System.out.println(solution(181));
    }

    public static int solution(int angle) {

        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        }
        else return 4;
    }
}
