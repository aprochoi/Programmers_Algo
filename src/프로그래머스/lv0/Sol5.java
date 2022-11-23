package 프로그래머스.lv0;

public class Sol5 {
    public static void main(String[] args) {
        System.out.println(solution(6)); //1
        System.out.println(solution(10)); //5
        System.out.println(solution(4));  //2

    }

    public static int solution(int n) {
        // 피자는 6조각
        int pizza = 6;

        // 피자 조각의 총 개수가 n으로 나눈 나머지가 0이 될때까지 6조각씩 추가
        while (pizza % n != 0) {
            pizza+=6;
        }

        // 피자조각을 6으로 나눠 피자 판으로 return
        return pizza/6;
    }
}
