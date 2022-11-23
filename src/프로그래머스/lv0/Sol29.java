package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol29 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(solution(new int[]{100,95,2,4,5,6,18,33,948}, 3)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] res = new int[num_list.length/n][n];

        int index = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = num_list[index];
                index++;
            }
        }


        return res;
    }
}
