package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol41 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[]{"I", "Love", "Programmers."})));
    }

    public static int[] solution(String[] strList) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < strList.length; i++) {
            list.add(strList[i].length());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
