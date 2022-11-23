package 프로그래머스.lv0;

public class Sol54 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
        System.out.println(solution("3 + 4 - 8 + 2"));
    }

    public static int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int sum = Integer.parseInt(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                sum += Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("-")) {
                sum -= Integer.parseInt(arr[i + 1]);
            }
        }

        return sum;
    }
}
