package DS.StackExample;

/**
 * Created by prvikani on 6/22/2016.
 */
public class Test3 {

    public static void main(String arg[]) {

        int[] a = {14, 2, 5, 3};
        System.out.print(getMinimum(a));
    }

    public static int getMinimum(int a[]) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (m > a[i])
                m = a[i];
        }
        return m;
    }
}
