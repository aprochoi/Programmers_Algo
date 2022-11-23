package 프로그래머스.lv0;

import java.util.Arrays;

public class Sol44 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
        System.out.println(solution(new int[]{1,2,4,5,6}, 4));
    }

    public static int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = Math.abs(n - array[i]);
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        int index = Arrays.asList(arr2).indexOf(min);


        return array[index];
    }
}
