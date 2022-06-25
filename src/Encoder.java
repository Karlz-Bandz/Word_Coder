import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Encoder {
    private final static Map<String, String> mapper = new HashMap<>(){{
        put("a", "1"); put("b", "2"); put("c", "3"); put("d", "4"); put("e", "5");
        put("f", "$"); put("g", "b"); put("h", "6"); put("i", "Q"); put("j", "%");
        put("k", "&"); put("l", "7"); put("m", "£"); put("n", "T"); put("o", "(");
        put("p", "^"); put("r", "Z"); put("s", "8"); put("t", "9"); put("u", "<");
        put("w", ":"); put("x", "C"); put("y", "V"); put("z", "B"); put(" ", "P");

    }};

    private String lettering(String letter){
        return mapper.getOrDefault(letter, "");
    }
    public String codeIt(String word){
        String solution = "";

        if(Objects.nonNull(word)){
            for (int i = 0; i<word.length(); i++){
                String letter = String.valueOf(word.charAt(i));
                solution += lettering(letter);
            }
        }
        return solution;
    }


}
