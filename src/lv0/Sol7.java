package lv0;

public class Sol7 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    public static double solution(int[] numbers) {
        // 결과를 return할 res 변수 선언
        double res = 0;

        // 배열 원소의 값을 res에 다 더한다.
        for (int i : numbers) {
            res += i;
        }

        // res를 배열의 길이만큼 나눠 결과 return
        return res / numbers.length;
    }
}
