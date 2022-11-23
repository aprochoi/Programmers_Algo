package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol53 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        int max = array[0];
        // indexOf 메서드 사용을 위해 int[] 배열을 Integer[] 배열로 변환
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        int[] res = new int[2];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        res[0] = max;

        int index = Arrays.asList(arr).indexOf(max);
        res[1] = index;

        return res;
    }
}
