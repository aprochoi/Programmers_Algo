package 프로그래머스.lv0;

public class Sol25 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }

    public static String solution(String letter) {
        String[] str = letter.split(" ");
        StringBuilder res = new StringBuilder();

        for (String s : str) {
            switch (s) {
                case ".-":
                    res.append("a");
                    break;
                case "-...":
                    res.append("b");
                    break;
                case "-.-.":
                    res.append("c");
                    break;
                case "-..":
                    res.append("d");
                    break;
                case ".":
                    res.append("e");
                    break;
                case "..-.":
                    res.append("f");
                    break;
                case "--.":
                    res.append("g");
                    break;
                case "....":
                    res.append("h");
                    break;
                case "..":
                    res.append("i");
                    break;
                case ".---":
                    res.append("j");
                    break;
                case "-.-":
                    res.append("k");
                    break;
                case ".-..":
                    res.append("l");
                    break;
                case "--":
                    res.append("m");
                    break;
                case "-.":
                    res.append("n");
                    break;
                case "---":
                    res.append("o");
                    break;
                case ".--.":
                    res.append("p");
                    break;
                case "--.-":
                    res.append("q");
                    break;
                case ".-.":
                    res.append("r");
                    break;
                case "...":
                    res.append("s");
                    break;
                case "-":
                    res.append("t");
                    break;
                case "..-":
                    res.append("u");
                    break;
                case "...-":
                    res.append("v");
                    break;
                case ".--":
                    res.append("w");
                    break;
                case "-..-":
                    res.append("x");
                    break;
                case "-.--":
                    res.append("y");
                    break;
                case "--..":
                    res.append("z");
                    break;
            }
        }

        return res.toString();
    }
}
