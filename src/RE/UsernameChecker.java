package RE;

/**
 * Regular expressions () help us match or search for patterns in strings. In this problem, you will be given a username.
 * <p>
 * Your task is to check whether that username is valid. A valid username will have the following properties:
 * <p>
 * 1. The username can contain alphanumeric characters and/or underscores(_).
 * 2. The username must start with an alphabetic character.
 * 3. 8  |Username|  30.
 * <p>
 * To simplify your task, we have provided a portion of the code in the editor.
 * You just need to write down the pattern which will be used to validate the username input.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();


            String pattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";


            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
/*
Sample Input
==============
4
alpha_naheed
xahidbuffon
nagib@007
123Swakkhar

Sample Output
=============================
Valid
Valid
Invalid
Invalid

*/