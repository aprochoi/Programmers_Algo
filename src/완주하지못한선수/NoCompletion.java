package 완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class NoCompletion {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        System.out.println(solution(part, comp));

        part = new String[]{"mislav", "stanko", "mislav", "ana"};
        comp = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution(part,comp));

    }

    public static String solution(String[] participant, String[] completion) {
        String result = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
//            map.put(participant[i],i);
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        System.out.println(map);

        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }

        System.out.println(map);

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                return s;
            }
        }
        return result;
    }
}
