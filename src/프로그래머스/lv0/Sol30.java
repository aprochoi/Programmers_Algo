package 프로그래머스.lv0;

public class Sol30 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4,}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 7));
    }

    public static int solution(int[] numbers, int k) {
        int index = 1;
        int count = 1;

        while (count != k) {
            index += 2;
            count++;

            if (index >= numbers.length) {
                index -= numbers.length;
            }
        }

        return index;
//        int answer = 2 * k - 1;
//        System.out.println("answer = " + answer);
//        answer = answer % numbers.length;
//
//
//        return answer;
    }
}
