import java.util.Arrays;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));  // [[4,6],[7,9]]

        arr1 = new int[][]{{1}, {2}};
        arr2 = new int[][]{{3}, {4}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));  // [[4],[6]]
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}
