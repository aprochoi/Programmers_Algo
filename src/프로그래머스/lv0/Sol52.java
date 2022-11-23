package 프로그래머스.lv0;

public class Sol52 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {

        return message.length() * 2;
    }
}
