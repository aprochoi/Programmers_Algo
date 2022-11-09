package lv0;

import java.util.Arrays;

public class Sol69 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
    }

    static int[] solution(String[] keyinput, int[] board) {
        int[] res = new int[2];

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "left":
                    res[0] += -1;
                    if (res[0] < (board[0] / 2) * -1) {
                        res[0] = (board[0] / 2) * -1;
                    }
                    break;
                case "right":
                    res[0] += 1;
                    if (res[0] > board[0] / 2) {
                        res[0] = board[0] / 2;
                    }
                    break;
                case "up":
                    res[1] += 1;
                    if (res[1] > board[1] / 2) {
                        res[1] = board[1] / 2;
                    }
                    break;
                case "down":
                    res[1] += -1;
                    if (res[1] < board[1] / 2 * -1) {
                        res[1] = board[1] / 2 * -1;
                    }
                    break;
            }
        }

        return res;
    }
}
