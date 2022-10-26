package lv0;

public class Sol8 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }

    public static int solution(int price) {

        if (price >= 100000 && price < 300000) {
            return (int) (price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            return (int) (price * 0.9);
        } else if (price >= 500000) {
            return (int) (price * 0.8);
        }

        return price;
    }
}
