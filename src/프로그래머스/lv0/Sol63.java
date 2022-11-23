package 프로그래머스.lv0;

public class Sol63 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string) {

        return my_string.toLowerCase().chars().sorted().collect(StringBuilder::new,
                                                                StringBuilder::appendCodePoint,
                                                                StringBuilder::append).toString();
    }
}
