package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1,3,5,7})));
    }

    public static int[] solution(int[] num_list) {
        int[] res = new int[2];

        for (int i : num_list) {
            if (i % 2 == 0) {
                res[0]++;
            } else res[1]++;
        }

        return res;
    }
}
