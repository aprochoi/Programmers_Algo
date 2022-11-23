package 프로그래머스.lv1;

import java.util.Stack;

public class CraneDoll {
    static int solution(int[][] board, int[] moves) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                int tmp = board[i][pos - 1];
                board[i][pos - 1] = 0;
                if (!stack.isEmpty() && tmp == stack.peek()) {
                    stack.pop();
                    res+=2;
                    break;
                }
                else if (tmp != 0) {
                    stack.push(tmp);
                    break;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        }, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}
