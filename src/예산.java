import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4},9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }

    public static int solution(int[] d, int budget) {
        int result = 0;
        int money = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            money += d[i];
            if (money > budget) {
                result = i;
                break;
            }
        }
        if (money <= budget) {
            result = d.length;
        }

        return result;
    }
}
