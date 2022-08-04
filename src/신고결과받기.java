import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo",
                                "muzi neo", "apeach muzi"}, 2))
        );

        System.out.println(Arrays.toString(
                solution(new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                        3)
        ));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();     // 신교를 기록할 map
        Map<String, Integer> idxMap = new HashMap<>();  // id_list 배열의 순서

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

//        System.out.println("idxMap = " + idxMap);
//        System.out.println("map = " + map);

        // 신고한 id에 대해 누가 신고했는지 map 에 저장
        for (String value : report) {
            String[] strArr = value.split(" ");
            String from = strArr[0];
            String to = strArr[1];
            map.get(to).add(from);
        }

//        System.out.println("map = " + map);


        for (String s : id_list) {
            HashSet<String> send = map.get(s);
            if (send.size() >= k) {
                for (String name : send) {
                    result[idxMap.get(name)]++;
                }
            }
        }


        return result;
    }
}
