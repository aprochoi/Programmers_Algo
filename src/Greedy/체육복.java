package Greedy;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        int[] lost = {1, 4};
        int[] reserve = {2, 3, 5};
        int result = solution(5, lost, reserve);

        System.out.println(result);
    }


    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];

        Arrays.fill(arr,1); // [1,1,1,1,1]

        for (int j : lost) {
            arr[j - 1]--;
        }
        // -> [1,0,1,0,1]

        for (int j : reserve) {
            arr[j - 1]++;
        }
        // -> [2,0,2,0,2]
//        int max = arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i-1>=0 && arr[i-1] == 2) {
                    arr[i]++; // arr[1] = 1
                    arr[i-1]--; // arr[0] = 1
                }
                else if (i+1 < arr.length && arr[i+1] == 2) {
                    arr[i] += 1;
                    arr[i+1] -= 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
}
