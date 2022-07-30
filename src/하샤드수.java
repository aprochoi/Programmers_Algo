public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(13));
        System.out.println(solution(12));


    }

    public static boolean solution(int x) {
        String s = String.valueOf(x);
        String[] arr = s.split("");
        int sum = 0;

        for (String value : arr) {
            sum += Integer.parseInt(value);
        }

        return x % sum == 0;
    }
}
