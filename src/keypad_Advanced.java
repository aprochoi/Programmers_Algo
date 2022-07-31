import java.util.Arrays;

public class keypad_Advanced {
    public static void main(String[] args) {
        System.out.println(solution(new int[]
                {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[]
                {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(solution(new int[]
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));

    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
//        String result = "";
        Integer[] L = new Integer[]{1, 4, 7};
        Integer[] R = new Integer[]{3, 6, 9};
        Integer[] M = new Integer[]{2, 5, 8, 0};

        int LS = 0; // 거리 계산을 위한 idx
        int RS = 0;
        int MS = 0;

        System.out.println(Arrays.asList(L).contains(1));

        for (int i = 0; i < numbers.length; i++) {

            //왼쪽 번호 일때
            if (Arrays.asList(L).contains(numbers[i])) {
                result.append("L");
                LS = Arrays.asList(L).indexOf(numbers[i]);
            }
            //오른쪽 일때
            else if (Arrays.asList(R).contains(numbers[i])) {
                result.append("R");
                RS = Arrays.asList(R).indexOf(numbers[i]);
            }

            // 가운데 번호일때
            else {
                //2가 들어오면 왼손 vs 오른손 중에 거리가 짧은걸로 누르기, 같으면 hand 로 누르기
                MS = Arrays.asList(M).indexOf(numbers[i]);
                result.append(getDistance(LS, RS, MS, hand));
                }
            }
        return result.toString();
    }
    private static String getDistance(int LS, int RS, int MS, String hand) {

        if (Math.abs(LS - MS) > Math.abs(RS - MS)) {
            return "R";
        }
        else if (Math.abs(LS - MS) < Math.abs(RS - MS)) {
            return "L";
        }
        else {
            if(hand.equals("right")) return "R";
            else return "L";
        }
    }
}
