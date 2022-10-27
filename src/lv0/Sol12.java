package lv0;

public class Sol12 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
        StringBuilder res = new StringBuilder();

        for (int i = my_string.length()-1; i >= 0; i--) {
            res.append(my_string.charAt(i));
        }

        return res.toString();
    }
}
