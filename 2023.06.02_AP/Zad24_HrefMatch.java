import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.regex.*;

public class Zad24_HrefMatch {
    public static void main(String[] args) {
        try {
            // get URL string from command line or use default
            String urlString;
            if (args.length > 0) {
                urlString = args[0];
            } else {
                urlString = "https://www.ujd.edu.pl";
            }
            // open reader for URL
            InputStreamReader in = new InputStreamReader(
                    new URL(urlString).openStream(),
                    StandardCharsets.UTF_8
            );
            // read contents into string builder
            StringBuilder input = new StringBuilder();
            int ch;
            while ((ch = in.read()) != -1) {
                input.append((char) ch);
            }
            // search for all occurrences of pattern
            String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s>]*)\\s*>";
            Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String match = matcher.group();
                // check if the matched link is a .jpg file
                if (match.toLowerCase().contains(".jpg")) {
                    // extract the file name from the link
                    String fileName = extractFileName(match);
                    System.out.println(fileName);
                }
            }
        } catch (IOException | PatternSyntaxException e) {
            e.printStackTrace();
        }
    }

    // helper method to extract the file name from a link
    private static String extractFileName(String link) {
        String fileName = "";
        int startIndex = link.lastIndexOf("/");
        if (startIndex != -1 && startIndex < link.length() - 1) {
            fileName = link.substring(startIndex + 1);
        }
        return fileName;
    }
}
