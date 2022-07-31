import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3})));
    }

    public static int[] solution(int[] arr) {
        // -> stack 으로 했을때
//        int[] arr2 = arr;
//        Stack<Integer> stack = new Stack<>();
//
//        stack.add(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr2[i] && !stack.peek().equals(arr[i])) {
//                stack.add(arr[i]);
//            }
//        }

        //배열로 했을때
        ArrayList<Integer> arrayList = new ArrayList<>();
        int preNum = 10;

        for (int j : arr) {
            if (preNum != j) {
                arrayList.add(j);
            }
            preNum = j;
        }

        int[] result = new int[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }

        return result;
    }
}
