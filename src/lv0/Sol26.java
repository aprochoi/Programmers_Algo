package lv0;

public class Sol26 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        /*
        * 가위는 2
        * 바위는 0
        * 보는 5
         */

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                res.append("0");
            }
            if (rsp.charAt(i) == '0') {
                res.append("5");
            }
            if (rsp.charAt(i) == '5') {
                res.append("2");
            }
        }

        return res.toString();
    }
}
