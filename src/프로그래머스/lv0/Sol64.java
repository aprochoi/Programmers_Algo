package 프로그래머스.lv0;

public class Sol64 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }

    public static int solution(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '7') count++;
            }
        }

        return count;
    }
}
