package lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol51 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
