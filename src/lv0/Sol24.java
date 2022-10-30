package lv0;

public class Sol24 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
         /*
         장군개미 공격력 : 5
         병정개미 공격력 : 3
         일반개미 공격력 : 1
         체력 23의 여치를 잡으려면 장군4, 병정1 총 5마리
         */
        int res = 0;

        if (hp >= 5) {
            res += hp / 5;
            hp %= 5;
        }

        if (hp >= 3) {
            res += hp / 3;
            hp %= 3;
        }

        if (hp >= 1) {
            res += hp / 1;
            hp %= 1;
        }

        return res;

    }
}
