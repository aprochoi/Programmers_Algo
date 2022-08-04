package 없는숫자더하기;

import java.util.Arrays;

public class NoNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }

    public static int solution(int[] numbers) {
        int result = 0;

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            if(Arrays.stream(numbers).noneMatch(num -> num == finalI)) result += i;
        }

        return result;
    }
}
