import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4},9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }

    public static int solution(int[] d, int budget) {
        int result = 0; //결과를 리턴할 수
        int money = 0;  // 부서별 가격

        Arrays.sort(d); //일단 오름차순으로 정렬

        for (int i = 0; i < d.length; i++) {    //각 배열 순회하면서
            money += d[i];  // 배열에 요소에있는 돈을 더한다.
            if (money > budget) {   //만약 돈보다 주어진 budget이 더 크면
                result = i; //결과는 i의 값
                break;  // 빠져나온다.
            }
        }
        if (money <= budget) {  //만약 돈보다 주어진 budget이 같거나 작으면
            result = d.length;  // 결과는 배열의 길이만큼
        }

        return result;
    }
}
