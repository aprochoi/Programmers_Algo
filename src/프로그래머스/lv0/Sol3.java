package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }
        System.out.println(arr.toString());

        int[] ints = arr.stream().mapToInt(Integer::intValue).toArray();

        return ints;
    }
}
