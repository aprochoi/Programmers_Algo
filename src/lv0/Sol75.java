package lv0;

import java.util.ArrayList;

public class Sol75 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    static int solution(String[] spell, String[] dic) {
//        String s = "";
//        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = 0; i < spell.length; i++) {
//            s += spell[i];
//        }
//        perm("", s, list);
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < dic.length; j++) {
//                if (list.get(i).equals(dic[j])) {
//                    return 1;
//                }
//            }
//        }
//        return 2;
//    }
//
//    static void perm(String prefix, String s, ArrayList<String> list) {
//        int n = s.length();
//        if (n == 0) {
//            list.add(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n), list);
//            }
//        }
        int res = 2;

        for (String value : dic) {
            boolean isRight = true;
            for (String s : spell) {
                if (!value.contains(s)) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                res = 1;
                break;
            }
        }

        return res;
    }
}
