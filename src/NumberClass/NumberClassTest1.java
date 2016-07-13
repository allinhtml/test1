package NumberClass;

/**
 * Created by prvikani on 6/9/2016.
 */
public class NumberClassTest1 {
    public static void main(String args[]) {

        // Example of Auto boxing
        Integer x = 19;
        x = x + 6; // unbox Int object to int
        System.out.print(x);


        // Convert Number object to primitive data type
        Integer i = new Integer(4);
        int p = i.intValue();
        System.out.print(p);
        // Returns byte primitive data type
        System.out.println(i.byteValue());
        // Returns double primitive data type
        System.out.println(i.doubleValue());
        // Returns long primitive data type
        System.out.println(i.longValue());


        // Convert value to wrapper class
        Integer xx = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");

        Integer b = Integer.valueOf("444", 16);

        System.out.println(xx);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        // CompareTo Method
        // Return Value:
        //If the Integer is equal to the argument then 0 is returned.
        //If the Integer is less than the argument then -1 is returned.
        //If the Integer is greater than the argument then 1 is returned.
        Integer x1 = 5;
        System.out.println(x1.compareTo(3));
        System.out.println(x1.compareTo(5));
        System.out.println(x1.compareTo(8));

        //The equals methods
        // It returns True if the argument is not null and is an object of the same type and with the same numeric value.
        // There are some extra requirements for Double and Float objects that are described in the Java API documentation.
        Integer x3 = 5;
        Integer y = 10;
        Integer z = 5;
        Short a2 = 5;

        System.out.println(x3.equals(y));
        System.out.println(x3.equals(z));
        System.out.println(x3.equals(a2));

        // Convert String to Int or Double
        int x4 = Integer.parseInt("9");
        double c1 = Double.parseDouble("5");
        int b2 = Integer.parseInt("444", 16);

        System.out.println(x4);
        System.out.println(c1);
        System.out.println(b2);

        String stringExample = "345435";

        int stringInt = Integer.parseInt(stringExample);
        System.out.print(stringInt);
    }
}
