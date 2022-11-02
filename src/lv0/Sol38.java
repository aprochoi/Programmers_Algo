package lv0;

public class Sol38 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        String str = my_string.replaceAll("\\D", "");
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i) - '0';
        }

        return res;
    }
}
