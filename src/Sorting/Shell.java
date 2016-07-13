package Sorting;

/**
 * Created by prvikani on 6/24/2016.
 */
public class Shell {

    public  static void sort(Comparable a[]){

        int h = 1;
        int N = a.length;

        while (h < N/3){
            h= 3*h+1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                //System.out.print(h);
                for(int j = i; j >= h && less(a[j], a[j-h]); j -= h){
                    exc(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static void exc(Comparable a[], int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
