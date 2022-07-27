import java.util.Arrays;

public class x만큼간격있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    public static long[] solution(int x, int n) {
        long[] result = new long[n];

        result[0] = x;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] + x;
        }

        return result;
    }
}
