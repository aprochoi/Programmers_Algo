package lv0;

import java.util.Arrays;

public class Sol37 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
        // "\\D" 정규식은 0~9의 숫자가 아닌 문자열을 의미
        String str = my_string.replaceAll("\\D", "");

        int[] res = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            res[i] = (int) str.charAt(i) - '0';
        }
        Arrays.sort(res);

        return res;
    }
}
