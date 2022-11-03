package lv0;

import java.util.Arrays;
import java.util.Stack;

public class Sol40 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("1 2 3 Z Z"));
    }

    public static int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        while (!stack.empty()) {
            sum += Integer.parseInt(stack.pop());
        }

        return sum;
    }
}
