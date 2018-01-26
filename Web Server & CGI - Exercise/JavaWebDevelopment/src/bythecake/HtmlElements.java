package bythecake;

public final class HtmlElements {
    public static final String HEADER_ELEMENT =
            "<header>"
                    + "<title>By The Cake</title" +
                    "  <meta charset=\"UTF-8\">" +
                    "  <meta name=\"description\" content=\"Buy the cake in By The Cake\">" +
                    "  <meta name=\"keywords\" content=\"Cakes, Buy\">" +
                    "  <meta name=\"author\" content=\"Toncheff\">"
                    + "</header>";
    public static final String ABOUT_US =
            "<h2 id=\"aboutus\">About us</h2>"+ "<dl>" +
                    "  <dt>ByTheCake EOOD</dt>" +
                    "  <dd>Name of the company</dd>" +
                    "  <dt>Toncheff</dt>" +
                    "  <dd>Owner</dd>" +
                    "</dl>";
    public static final String STORES_INFO =
            "<pre style = \"background-color: #f94f80;\">"
                    + "City: HongKong\t\tCity: Salzburg\n"  +
                    "Address: ChoCoLad 18\tAddress: SchokoLeiden 73\n" +
                    "Phone: +78952804429\tPhone: +49241432990"
                    + "</pre>";
    public static final String FOOTER_ELEMENT =
            "<hr />"
                    + "<footer>"
                    + "<p style = \"text-align: center;\">&copy;All Rights Reserved.</p>"
                    + "</footer>";

    private HtmlElements() {
    }
}
