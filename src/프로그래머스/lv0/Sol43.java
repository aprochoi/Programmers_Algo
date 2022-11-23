package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol43 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        int max = sides[sides.length - 1];

//        if(sides[0] + sides[1] <= max) return 2;
//        else return 1;
        return max >= sides[0] + sides[1] ? 2 : 1;
    }
}
