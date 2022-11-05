package lv0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Sol50 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }

    public static String solution(String s) {
        String res = "";
        int count;

        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                res += s.charAt(i);
            }
        }

        char[] chars = res.toCharArray();
        Arrays.sort(chars);
        res = new String(chars);

        return res;
    }
}
