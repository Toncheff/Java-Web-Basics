package bythecake;

public class Home {
    public static void main(String[] args) {
        String type = "Content-Type: text/html"
                + System.lineSeparator();

        String output =
                ""      //Initial information
                        + "<html>"
                        + HtmlElements.HEADER_ELEMENT
                        + "<body>"
                        + "<a href=\"/cgi-bin/menu.cgi\">Back to Menu</a>"
                        + "<h2>Home</h2>"

                        + "<section>"
                        + "<h3 id=\"cakes\">Our cakes</h3>"
                        + "<p><strong><em>Cake</strong></em> is a form of <strong><em>sweet dessert</strong></em> that is typically baked." +
                        " In its oldest forms, <strong><em>cakes</strong></em> were modifications of breads, but <strong><em>cakes</strong></em> now cover a wide range" +
                        " of preparations that can be simple or elaborate, and that share features with other" +
                        " <strong><em>desserts</strong></em> such as pastries, meringues, custards, and pies</p>"
                        + "<img src=\"/cake.jpg\" alt=\"cake-image\" width=\"600\" height=\"600\">"
                        + "</section>"

                        + "<section>"
                        + "<h3 id=\"stores\">Our stores</h3>"
                        + "<p>Our <strong><em>stores</strong></em> are located in 21 cities all over the world. Come and see what we have for you.</p>"
                        + "<img src=\"/store.jpg\" alt=\"store-image\" width=\"600\" height=\"600\">"
                        + "</section>"
                        + HtmlElements.ABOUT_US
                        + HtmlElements.STORES_INFO
                        + HtmlElements.FOOTER_ELEMENT
                        + "</body>"
                        + "</html>";

        System.out.println(type);
        System.out.println(output);

    }
}
