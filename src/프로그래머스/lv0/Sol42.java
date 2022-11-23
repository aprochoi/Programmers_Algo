package 프로그래머스.lv0;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sol42 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }

        for (String s : set) {
            res.append(s);
        }

            return res.toString();
    }
}
