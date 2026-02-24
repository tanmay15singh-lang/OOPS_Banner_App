import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    static String gap = "   ";

    public static void main(String[] args) {

        // Create pattern map
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c).getPattern()[row]).append(gap);
            }

            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }
}