package bythecake;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class add_cake {
    public static void main(String[] args) throws IOException {
        {
            String csvFile = "/C:/xampp/cgi-bin/database.csv";
            FileWriter writer = new FileWriter(csvFile, true);

            String type = "Content-Type: text/html"
                    + System.lineSeparator();
            System.out.println(type);

            String output =
                    ""
                            + "<html>"
                            + "<body>"
                            + "<a href=\"/cgi-bin/home.cgi\">Back to home</a>"
                            + "<form method=\"post\">" +
                            "<br/>Name: <input type=\"text\" name=\"name\">" +
                            "Price: <input type=\"text\" name=\"price\">" +
                            "<input type=\"submit\" value=\"Create\">" +
                            "</form>" +
                            "</body>"
                            + "</html>";

            System.out.println(output);


            Map<String, String> params = postUtils.getParameters(System.in);

            for (Map.Entry<String, String> stringStringEntry : params.entrySet()) {
                System.out.printf("%s: %s<br/>", stringStringEntry.getKey(), stringStringEntry.getValue() + "<br/>");
            }
            if (!params.entrySet().isEmpty()) {
                writer.write(String.join(",", params.values()) + "\n");
            }


            writer.close();
        }
    }
}




