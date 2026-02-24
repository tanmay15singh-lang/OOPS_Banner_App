public class OOPSBannerUC4 {

    public static void main(String[] args) {

        String gap = "   ";

        // Create array to store banner lines
        String[] banner = new String[5];

        banner[0] = String.join(gap,
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        banner[1] = String.join(gap,
                "*     *",
                "*     *",
                "*     *",
                "*      ");

        banner[2] = String.join(gap,
                "*     *",
                "*     *",
                " ***** ",
                " ***** ");

        banner[3] = String.join(gap,
                "*     *",
                "*     *",
                "*      ",
                "      *");

        banner[4] = String.join(gap,
                " ***** ",
                " ***** ",
                "*      ",
                " ***** ");

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}