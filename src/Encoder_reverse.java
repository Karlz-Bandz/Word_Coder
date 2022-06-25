import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Encoder_reverse {
    private final static Map<String, String> mapper = new HashMap<>(){{
        put("1", "a"); put("2", "b"); put("3", "c"); put("4", "d"); put("5", "e");
        put("$", "f"); put("b", "g"); put("6", "h"); put("Q", "i"); put("%", "j");
        put("&", "k"); put("7", "l"); put("£", "m"); put("T", "n"); put("(", "o");
        put("^", "p"); put("Z", "r"); put("8", "s"); put("9", "t"); put("<", "u");
        put(":", "w"); put("C", "x"); put("V", "y"); put("B", "z"); put("P", " ");

    }};
    private String lettering(String letter){
        return mapper.getOrDefault(letter,"");
    }
    public String encodeIt(String word){

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
