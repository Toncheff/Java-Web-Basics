package bythecake;

public class Menu {
    public static void main(String[] args) {
        String type = "Content-Type: text/html"
                + System.lineSeparator();

        String output =
                ""      //Initial information
                        + "<html>"
                        +  HtmlElements.HEADER_ELEMENT
                        + "<body>"
                        + "<h1>By the Cake</h1>"
                        + "<h2>Enjoy our awesome cakes</h2>"
                        + "<hr />"
                        //The Menu
                        + "<ul>"
                                    + "<li> <a href=\"/cgi-bin/home.cgi\">Home</a> </li>"
                                    + "<ol>"
                                    + "<li><a href=\"/cgi-bin/home.cgi#cakes\">Our cakes</a></li>"
                                    + "<li><a href=\"/cgi-bin/home.cgi#stores\">Our stores</a></li>"
                                    + "</ol>"
                                    + "<li><a href=\"/cgi-bin/add_cake.cgi\">Add cake</a></li>"
                                    + "<li><a href=\"/cgi-bin/browse_cakes.cgi\">Browse cakes</a></li>"
                                    + "<li><a href=\"/cgi-bin/home.cgi#aboutus\">About us</a></li>"
                        + "</ul>"
                        + "</body>"
                        + "</html>";

        System.out.println(type);
        System.out.println(output);
    }
}
