import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
        System.out.println(Arrays.toString(solution(3, new int[]{1, 1, 1})));
    }

    public static int[] solution(int N, int[] stages) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int stage : stages) {
            list.add(stage);
        }

        int count = 0;
        int user = 0;
        List<Object> result = new ArrayList<>();
//        2, 1, 2, 6, 2, 4, 3, 3
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    user++; //8
                }
                if (stages[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                result.add(0.0);
            } else result.add((double) count / user);
            user = 0;
            count = 0;
        }

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < result.size(); i++) {
            map.put(i+1, (double) result.get(i));
        }

        System.out.println(map.toString());

        int[] answer = new int[N];

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(((o1, o2) -> map.get(o2).compareTo(map.get(o1)))); //value 기준으로 내림차순

        System.out.println(keySet.toString());

        for (int i = 0; i < answer.length; i++) {
            answer[i] = keySet.get(i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
// 2, 1, 2, 6, 2, 4, 3, 3 i=2
// count = 3, user =
