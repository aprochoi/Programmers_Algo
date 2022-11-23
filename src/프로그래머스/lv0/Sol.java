package 프로그래머스.lv0;

import java.util.Arrays;

// 중앙값 구하기
public class Sol {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{9, -1, 0}));
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
    }

    public static int solution(int[] arr) {

        Arrays.sort(arr);

        int mid = arr.length / 2;

        return arr[mid];
    }
}
