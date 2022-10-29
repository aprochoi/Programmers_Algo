package lv0;

public class Sol21 {

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        String res = "";
        String[] alpha = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        while (age > 0) {
            res = alpha[age % 10] + res;
            age /= 10;
        }

        return res;

//        String age962 = String.valueOf(age);
//        StringBuilder res = new StringBuilder();
//
//        for (int i = 0; i < age962.length(); i++) {
//            switch (age962.charAt(i)) {
//                case '0':
//                    res.append("a");
//                    break;
//                case '1':
//                    res.append("b");
//                    break;
//                case '2':
//                    res.append("c");
//                    break;
//                case '3':
//                    res.append("d");
//                    break;
//                case '4':
//                    res.append("e");
//                    break;
//                case '5':
//                    res.append("f");
//                    break;
//                case '6':
//                    res.append("g");
//                    break;
//                case '7':
//                    res.append("h");
//                    break;
//                case '8':
//                    res.append("i");
//                    break;
//                case '9':
//                    res.append("j");
//                    break;
//            }
//        }
//
//        return res.toString();
    }
}
