package lv0;

import java.util.*;

public class Sol65 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }

    public static String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();

        String str = "";
        int count = 0;

        for (int i = 0; i < my_str.length(); i++) {
            str += String.valueOf(my_str.charAt(i));
            count++;
            if (count == n) {
                list.add(str);
                count = 0;
                str = "";
            }
        }

        if(str.length() > 0) {
            list.add(str);
        }

        return list.toArray(new String[list.size()]);
    }
}
