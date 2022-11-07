package lv0;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;

public class Sol59 {
    public static void main(String[] args) throws ScriptException {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }

    public static String[] solution(String[] quiz) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split("=");
                if ((int)engine.eval(s[0]) == Integer.parseInt(s[1].trim())) {
                    res.add("O");
                } else res.add("X");
        }


        return res.stream().toArray(String[]::new);
    }
}
