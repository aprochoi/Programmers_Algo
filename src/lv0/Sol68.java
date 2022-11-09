package lv0;

public class Sol68 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

    static int solution(int[][] dots) {
        // 가장 큰 x의 값 - 가장 작은 x의 값 = 가로
        // 가장 큰 y의 값 - 가장 작은 y의 값 = 세로
        int res = 0;
        int x_max = Integer.MIN_VALUE;
        int x_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;

        for (int i = 0; i < dots.length; i++) {
            x_max = Math.max(x_max, dots[i][0]);
            x_min = Math.min(x_min, dots[i][0]);
            y_max = Math.max(y_max, dots[i][1]);
            y_min = Math.min(y_min, dots[i][1]);
        }
        int width = x_max - x_min;
        int height = y_max - y_min;

        return width * height;
    }
}
