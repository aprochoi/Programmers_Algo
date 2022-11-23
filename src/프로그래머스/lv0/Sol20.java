package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol20 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5}, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> res = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            res.add(numbers[i]);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
