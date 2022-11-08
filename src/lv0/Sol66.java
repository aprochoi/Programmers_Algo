package lv0;

import java.util.Arrays;

public class Sol66 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }

    public static int solution(int[] array, int n) {
//        int count = 0;
//        for (int i : array) {
//            if (i == n) {
//                count++;
//            }
//        }
//
//        return count;
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
