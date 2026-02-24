public class OOPSBannerUC6 {

    static String gap = "   ";

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // O O P S
        for (int i = 0; i < o.length; i++) {
            String line = String.join(gap, o[i], o[i], p[i], s[i]);
            System.out.println(line);
        }
    }

    // Build O pattern
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Build P pattern
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Build S pattern
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}