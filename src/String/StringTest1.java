package String;

public class StringTest1 {
    public static void main(String args[]) {

        String a = "parth";
        System.out.println(a);

        char s[] = {'a', 'b', 'c'};
        String s1 = new String(s);
        System.out.println(s1);

        // Length
        System.out.print(s1.length());

        // Contcat
        // string1.concat(string2);
        // "My name is ".concat("Zara");
        // "Hello," + " world" + "!" -O/P: "Hello, world!"
        a = a.concat(" chandu choti");
        System.out.println(a);

        // OP: a
        String s3 = "Strings are immutable";
        char result3 = s3.charAt(8);
        System.out.println(result3);

        String str1 = "strings are immutable";
        String str2 = "strings are immutable";
        String str3 = "Integers are not immutable";

        str1 = "abc";
        str2 = "abc";
        str3 = "acc";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);

        System.out.print("Capitalize First world: " + capitalize(str1));

        String s11 = "parth";
        String s2 = "parth";


        String nirali = new String("chandulal choti");
        System.out.print(nirali);

    }

    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
