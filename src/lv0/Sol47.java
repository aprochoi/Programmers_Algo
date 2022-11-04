package lv0;

public class Sol47 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                res.append(Character.toLowerCase(my_string.charAt(i)));
            } else res.append(Character.toUpperCase(my_string.charAt(i)));
        }

        return res.toString();
    }
}
