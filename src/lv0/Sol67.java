package lv0;

import java.util.Arrays;

public class Sol67 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution(new int[]{180, 120, 140}, 190));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
