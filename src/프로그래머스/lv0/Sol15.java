package 프로그래머스.lv0;

public class Sol15 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            res.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }

        return res.toString();
    }
}
