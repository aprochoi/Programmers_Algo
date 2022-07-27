public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        String str = "01033334444";
        System.out.println(solution(str));

        str = "027778888";
        System.out.println(solution(str));
    }

    public static String solution(String phone_number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            result.append("*");
        }

        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            result.append(String.valueOf(phone_number.charAt(i)));
        }

        return String.valueOf(result);
    }
}
