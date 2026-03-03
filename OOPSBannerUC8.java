import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    static String gap = "   ";
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }

    // Initialize character patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Render banner dynamically
    public static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append(gap);
                }
            }

            System.out.println(line);
        }
    }
}