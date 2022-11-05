package lv0;

import java.util.LinkedList;

public class Sol49 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
        LinkedList<String> res = new LinkedList<>();

        for (int i = 0; i < my_string.length(); i++) {
            res.add(String.valueOf(my_string.charAt(i)));
        }

        String index1 = String.valueOf(my_string.charAt(num1));
        String index2 = String.valueOf(my_string.charAt(num2));

        res.set(num1, index2);
        res.set(num2, index1);


        return String.join("", res);
    }
}
