package lv0;

public class Sol56 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
    }

    public static int solution(int num, int k) {
        String res = String.valueOf(num);

        if (!res.contains(String.valueOf(k))) {
            return -1;
        }

        int index = res.indexOf(String.valueOf(k));

        return index + 1;
    }
}
