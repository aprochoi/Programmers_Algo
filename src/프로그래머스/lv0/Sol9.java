package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }

    public static int[] solution(int money) {
        int[] res = new int[2];

        while (money >= 5500) {
            money -= 5500;
            res[0]++;
        }
        res[1] = money;

        return res;
    }
}
