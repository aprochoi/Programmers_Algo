package 프로그래머스.lv0;

import java.util.Arrays;

// 최빈값 구하기
public class Sol2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1,1,2,2}));
        System.out.println(solution(new int[]{1}));
        System.out.println(solution(new int[]{2,2,2}));

    }

    public static int solution(int[] array) {
        int[] index = new int[array.length + 1];
        int answer = 0;
        int max = Integer.MIN_VALUE;

        if (array.length == 1) {
            return array[0];
        }

        for (int j : array) {
            index[j]++;
        }

        System.out.println("Arrays.toString(index) = " + Arrays.toString(index));

        for (int i = 0; i < index.length; i++) {
            if (max < index[i]) {
                max = index[i];
                answer = i;
            }
        }

        Arrays.sort(index);

        System.out.println(Arrays.toString(index));

        if(index[index.length -2] == index[index.length -1]) return -1;

        return answer;
    }
}
