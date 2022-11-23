package 프로그래머스.lv0;

public class Sol72 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    static int solution(String my_string) {
        String[] arr = my_string.replaceAll("\\D", " ").split(" ");
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("^\\d+$")) {
                res += Integer.parseInt(arr[i]);
            }
        }

        return res;
    }
}
