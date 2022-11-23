//package 프로그래머스.lv0;
//
//import java.util.Arrays;
//
//public class Sol73 {
//    public static void main(String[] args) {
//        System.out.println(solution(new int[][]{
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0}
//        }));
//
//        System.out.println(solution(new int[][]{
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 1, 0},
//                {0, 0, 0, 0, 0}
//        }));
//
//        System.out.println(solution(new int[][]{
//                {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1}
//        }));
//    }
//
//    static int solution(int[][] board) {
//        int count = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == 1) {
//                    for (int k = -1; k < 2; k++) {
//                        for (int l = -1; l < 2; l++) {
//                            try {
//                                if (board[i + k][j + l] == 0) {
//                                    board[i + k][j + l] = 2;
//                                }
//                            } catch (Exception e) {
//
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == 0) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
//}
package 프로그래머스.lv0;

public class Sol73 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        }));

        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}
        }));

        System.out.println(solution(new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        }));
    }

    static int solution(int[][] board) {
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    mineArea(board, i, j);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    count ++;
                }
            }
        }

        return count;
    }

    static void mineArea(int[][] board, int x, int y) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (board[x + i][y + j] == 0) {
                        board[x + i][y + j] = 2;
                    }
                } catch (Exception e) {

                }

            }
        }
    }

}
