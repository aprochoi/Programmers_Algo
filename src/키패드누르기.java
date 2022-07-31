import java.util.Arrays;

public class 키패드누르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]
                {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[]
                {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(solution(new int[]
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder(); //결과
        int[] L = {3, 0};
        int[] R = {3, 2};
        int[] A = {0, 1}; // 2
        int[] B = {1, 1}; // 5
        int[] C = {2, 1}; // 8
        int[] D = {3, 1}; // 0

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                result.append("L");
                L = new int[]{0, 0};
            }
            else if (numbers[i] == 4) {
                result.append("L");
                L = new int[]{1, 0};
            }
            else if (numbers[i] == 7) {
                result.append("L");
                L = new int[]{2, 0};
            }
            else if (numbers[i] == 3) {
                result.append("R");
                R = new int[]{0,2};
            }
            else if (numbers[i] == 6) {
                result.append("R");
                R = new int[]{1,2};
            }
            else if (numbers[i] == 9) {
                result.append("R");
                R = new int[]{2,2};
            }
            else if (numbers[i] == 2) {
                int L_distance = Math.abs(L[0] - A[0]) + Math.abs(L[1] - A[1]);
                int R_distance = Math.abs(R[0] - A[0]) + Math.abs(R[1] - A[1]);
                if (L_distance < R_distance) {
                    result.append("L");
                    L = A;
                }
                else if(L_distance > R_distance) {
                    result.append("R");
                    R = A;
                }
                else {
                    if (hand.equals("right")) {
                        result.append("R");
                        R = A;
                    }
                    else if(hand.equals("left")) {
                        result.append("L");
                        L = A;
                    }
                }
            }
            else if (numbers[i] == 5) {
                int L_distance = Math.abs(L[0] - B[0]) + Math.abs(L[1] - B[1]);
                int R_distance = Math.abs(R[0] - B[0]) + Math.abs(R[1] - B[1]);
                if (L_distance < R_distance) {
                    result.append("L");
                    L = B;
                }
                else if(L_distance > R_distance) {
                    result.append("R");
                    R = B;
                }
                else {
                    if (hand.equals("right")) {
                        result.append("R");
                        R = B;
                    }
                    else if(hand.equals("left")) {
                        result.append("L");
                        L = B;
                    }
                }
            }
            else if (numbers[i] == 8) {
                int L_distance = Math.abs(L[0] - C[0]) + Math.abs(L[1] - C[1]);
                int R_distance = Math.abs(R[0] - C[0]) + Math.abs(R[1] - C[1]);
                if (L_distance < R_distance) {
                    result.append("L");
                    L = C;
                }
                else if(L_distance > R_distance) {
                    result.append("R");
                    R = C;
                }
                else {
                    if (hand.equals("right")) {
                        result.append("R");
                        R = C;
                    }
                    else if(hand.equals("left")) {
                        result.append("L");
                        L = C;
                    }
                }
            }
            else if (numbers[i] == 0) {
                int L_distance = Math.abs(L[0] - D[0]) + Math.abs(L[1] - D[1]);
                int R_distance = Math.abs(R[0] - D[0]) + Math.abs(R[1] - D[1]);
                if (L_distance < R_distance) {
                    result.append("L");
                    L = D;
                }
                else if(L_distance > R_distance) {
                    result.append("R");
                    R = D;
                }
                else {
                    if (hand.equals("right")) {
                        result.append("R");
                        R = D;
                    }
                    else if(hand.equals("left")) {
                        result.append("L");
                        L = D;
                    }
                }
            }
        }


        return result.toString();
    }

}
