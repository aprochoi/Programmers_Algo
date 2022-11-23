package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol31 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    public static int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> res = new ArrayList<>();

        if (direction.equals("right")) {
            res.add(numbers[numbers.length - 1]);
            for (int i = 0; i < numbers.length - 1; i++) {
                res.add(numbers[i]);
            }
        }

        if (direction.equals("left")) {
            for (int i = 1; i < numbers.length; i++) {
                res.add(numbers[i]);
            }
            res.add(numbers[0]);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
