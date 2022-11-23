package 프로그래머스.lv0;

public class Sol60 {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));

    }

    public static int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        }

        return 2;
    }
}
