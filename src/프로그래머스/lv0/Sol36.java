package 프로그래머스.lv0;

public class Sol36 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
//        String[] arr = my_string.split("");
//        StringBuilder res = new StringBuilder();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
//
//            }else res.append(arr[i]);
//        }
//
//
//        return res.toString();

        String res = "";

        res = my_string.replaceAll("[aeiou]", "");

        return res;
    }
}
