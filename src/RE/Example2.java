package RE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        while (true) {

            // Scan Search String and Pattern
            String searchString = console.nextLine();
            String patternString = console.nextLine();

            // Create complied pattern and match it.
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(searchString);

            boolean found = false;

            while (matcher.find()) {
                System.out.format("Text \"%s\" - Starting index: %d and Ending index %d.%n", matcher.group(), matcher.start(), matcher.end());
                found = true;
            }
            if (!found) {
                System.out.format("No match found.%n");
            }
        }
    }
}
