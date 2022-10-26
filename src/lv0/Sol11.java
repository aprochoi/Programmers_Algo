package lv0;

import java.util.Arrays;

public class Sol11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] res = new int[num_list.length];
        int j = 0;

        for (int i = res.length-1; i >= 0; i--) {
            res[j] = num_list[i];
            j++;
        }

        return res;
    }
}
