package lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sol22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        //1. indexOf 메서드를 사용하기 위해서는 int[] 타입이 아니라 Integer 타입이어야 하므로 타입 변환
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);


        //2. 내림차순은 Integer로 바꿔줘야 가능하므로 Integer 타입으로 변환 후 내림차순 정렬
        Integer[] revers = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(revers, Comparator.reverseOrder());

        //3. 결과를 return 할 res 배열 선언.
        int[] res = new int[emergency.length];

        //4. 진료 순위를 정할 count 선언.
        int count = 1;

        for (int i = 0; i < emergency.length; i++) {
            //5. 내림차순된 배열은 우선순위가 높은 사람이 맨 앞에 있으므로 원본 배열에서 그 사람의 인덱스를 검색
            //ex) revers[0] = 76, 이고 arr 배열에서 76은 arr[1]에 있으므로 index = 1
            int index = Arrays.asList(arr).indexOf(revers[i]);

            //6. 결과를 리턴할 배열에 진료 순위를 기록
            //ex) index = 1, res[1]에 count 추가.
            res[index] = count;

            //진료 순위를 증가.
            count++;
        }

        return res;
    }
}
