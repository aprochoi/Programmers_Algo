import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1},
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board,moves)); //4
    }


    public static int solution(int[][] board, int[] moves) {
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int move : moves) {
            int pick = move - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][pick] != 0) {
                    list.add(board[j][pick]);
                    board[j][pick] = 0;
                    break;
                }
            }
            if (list.size() > 1) {
                if (Objects.equals(list.get(list.size() - 1), list.get(list.size() - 2))) {
                    result += 2;
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                }
            }
        }
        System.out.println(list.toString());


        return result;
    }
}
