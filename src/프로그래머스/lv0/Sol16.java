package 프로그래머스.lv0;

public class Sol16 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        String res = "";

        res = my_string.replaceAll(letter, "");

        return res;
    }
}
