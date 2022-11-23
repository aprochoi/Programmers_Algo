package 프로그래머스.lv0;

public class Sol71 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("x + 2 + 4"));
        System.out.println(solution("1 + 1"));
    }

    static String solution(String polynomial) {
        // 공백을 기준으로 문자열 배열 선언
        String[] arr = polynomial.split(" ");

        int x = 0;
        int a = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            //식에 x만 존재할 경우
            if (arr[i].equals("x")) {
                x += 1;
            }

            //식에 5x, 3x, 8x 등 숫자와 함께할 경우
            if (arr[i].endsWith("x") && !arr[i].startsWith("x")) {
                int index = arr[i].indexOf("x");
                a += Integer.parseInt(arr[i].substring(0, index));
            }

            //식에 숫자만 존재할 경우
            if (!arr[i].startsWith("x") && !arr[i].endsWith("x") && !arr[i].equals("+")) {
                num += Integer.parseInt(arr[i]);
            }
        }
        x += a;

        //x가 1이면 1 생략
        if (x == 1) {
            return num > 0 ?  "x + " + num : "x";
        }

        // x가 0이면 num만 return
        if (x == 0) {
            return String.valueOf(num);
        }

        return num > 0 ? x + "x + " + num : x + "x";
    }
}
