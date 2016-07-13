package RE;

/**
 * Given a string, find number of words in that string.
 * For this problem a word is defined by a string of one or more english alphabets.
 * There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your skill by solving this problem!
 * <p>
 * Input Format
 * A string not more than 400000 characters long. The string can be defined by following regular expression:
 * [A-Za-z !,?.\_'@]+
 * That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
 * <p>
 * Output Format
 * In the first line, print number of words  in the string. The words don't need to be unique.
 * In the next  lines, print all the words you found in the order they appeared in the input.
 */

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for (String s1 : s.split("[ !,?._'@]"))
            if (s1.length() != 0)
                counter++;
        System.out.println(counter);
        for (String s1 : s.split("[ !,?._'@]"))
            if (s1.length() != 0)
                System.out.println(s1);
    }
}

/*
Input
======================
He is a very very good boy, isn't he?

Output
======================
10
He
is
a
very
very
good
boy
isn
t
he
*/
