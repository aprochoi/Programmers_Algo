package lv0;

import java.util.Arrays;

public class Sol74 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{11, 7}));
    }

    static int solution(int[] sides) {
        int count = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int sideSum = sides[0] + sides[1];

        for (int i = 1; i < sideSum; i++) {
            int longLeg = sides[0] + i;
            // 가장 긴변이 max 일 때
            if ((max < longLeg && longLeg <= sideSum)
                    // i가 가장 긴변 일 때
                    || (i > max)) {
                count++;
            }
        }

        return count;
    }
}
