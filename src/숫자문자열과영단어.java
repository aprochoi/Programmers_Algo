public class 숫자문자열과영단어 {

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        int answer = 0;
        String result = "";
        result = s.replaceAll("one", "1")
        .replaceAll("two", "2")
        .replaceAll("three", "3")
        .replaceAll("four", "4")
        .replaceAll("five", "5")
        .replaceAll("six", "6")
        .replaceAll("seven", "7")
        .replaceAll("eight", "8")
        .replaceAll("nine", "9")
        .replaceAll("zero", "0");

        System.out.println(result);

        return answer = Integer.parseInt(result);
    }
}
