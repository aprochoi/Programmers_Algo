package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sol39 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int i = 2;

        while (n >= i) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        int[] res = set.stream().mapToInt(Integer::intValue).toArray();

        //set은 순서를 보장하지 않기 때문에 오름차순 정렬렬
       Arrays.sort(res);

        return res;
    }
}
