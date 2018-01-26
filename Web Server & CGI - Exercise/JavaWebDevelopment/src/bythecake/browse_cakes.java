package bythecake;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class browse_cakes {
    public static void main(String[] args) throws IOException {
        {
            String csvFile = "/C:/xampp/cgi-bin/database.csv";

            String type = "Content-Type: text/html"
                    + System.lineSeparator();
            System.out.println(type);

            String output =
                    ""
                            + "<html>"
                            + "<body>"
                            + "<a href=\"/cgi-bin/home.cgi\">Back to home</a>"
                            + "<form method=\"get\">" +
                            "<br/><input type=\"search\" name=\"name\">" +
                            "<input type=\"submit\" value=\"Search\">" +
                            "</form>"
                            + "</body>"
                            + "</html>";

            System.out.println(output);

            File file = new File(csvFile);
            Scanner in;
            Map<String, String> params = postUtils.getParameters(System.in);
            if (!params.entrySet().isEmpty()) {
                StringBuilder sb = new StringBuilder(params.values().toString());
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
                try {
                    in = new Scanner(file);
                    while (in.hasNext()) {
                        String line = in.nextLine();
                        if (line.contains(sb)) {
                            String[] parts = line.split(",");
                            System.out.println("Name: " + parts[0] + " Price: " + parts[1] + "<br/>");
                        }
                    }
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }
}

