package 토스;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(solution("122233"));
        System.out.println(solution("111999333"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        int[] arr = {000, 111, 222, 333, 444, 555, 666, 777, 888, 999};

        int a = Integer.parseInt(s);

        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            if (Arrays.stream(arr).anyMatch(num -> num == a)) {
                return arr[i];
            }
        }

        return -1;
    }
}
