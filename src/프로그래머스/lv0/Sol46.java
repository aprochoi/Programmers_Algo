package 프로그래머스.lv0;

public class Sol46 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder res = new StringBuilder();

        for (int i = code-1; i < cipher.length(); i += code) {
            res.append(cipher.charAt(i));
        }

        return res.toString();
    }
}
