package 프로그래머스.lv0;

public class Sol6 {
    public static void main(String[] args) {
        System.out.println(solution(7, 10));    // 2
        System.out.println(solution(4, 12));    // 3
    }

    public static int solution(int slice, int n) {

        // 피자 조각의 개수는 slice와 동일
        int pizza = slice;

        // 피자 조각이 n명보다 작을때 까지 반복
        // 피자 조각의 개수만큼 추가
        while (pizza < n) {
            pizza += slice;
        }

        // 피자조각을 slice로 나눠 판으로 계산 후 return
        return pizza/slice;
    }
}
