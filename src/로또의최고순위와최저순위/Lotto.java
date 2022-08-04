package 로또의최고순위와최저순위;


import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 24},
                new int[]{31, 10, 45, 1, 6, 19})));

        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0},
                new int[]{38, 19, 20, 40, 15, 25})));

        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9},
                new int[]{20, 9, 3, 45, 4, 35})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        //O 결과를 담을 배열 선언
        int[] result = new int[2];

        //O 정렬
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int count = 0;

        //O 1. 0이 win_num이랑 맞을 확률
        for (int lotto : lottos) {
            if (lotto == 0) count++;
            for (int j = 0; j < lottos.length; j++) {
                if (lotto == win_nums[j]) count++;
            }
        }

        result[0] = rank(count);

        count = 0;


        //O 2. 0이 win_num이랑 틀릴때
        for (int lotto : lottos) {
            for (int j = 0; j < lottos.length; j++) {
                if(lotto == win_nums[j]) count++;
            }
        }

        result[1] = rank(count);

        return result;
    }

    public static int rank(int count) {
        switch (count) {
            case 2: return 5;
            case 3: return 4;
            case 4: return 3;
            case 5: return 2;
            case 6: return 1;
            default: return 6;
        }
    }
}
