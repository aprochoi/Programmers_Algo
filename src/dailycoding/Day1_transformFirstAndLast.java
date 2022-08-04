package dailycoding;

import java.util.HashMap;

//배열을 입력받아 차례대로 배열의 첫 요소와 마지막 요소를 키와 값으로 하는 HashMap을 리턴해야 합니다.
public class Day1_transformFirstAndLast {
    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : "Beyonce" }

        arr = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
        output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Kevin : 'Spacey' }
    }

    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        //빈 배열일 경우 null 리턴
        if(arr.length== 0) return null;

        //hashmap 선언
        HashMap<String, String> result = new HashMap<>();

        //배열의 첫 요소와 마지막 요소를 키와 값으로 map에 put
        result.put(arr[0], arr[arr.length - 1]);

        return result;

    }
}
