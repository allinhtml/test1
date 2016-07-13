package Sorting;

/**
 * Created by prvikani on 6/25/2016.
 */
public class MergeBU {

    private static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi){
        int i = lo;
        int j = mid+1;
        for(int k = lo; k < hi; k++){
            if(i > mid)                 aux[k] = a[j++];
            else if(j > hi)             aux[k] = a[i++];
            else if(less(a[i],a[j]))    aux[k] = a[i++];
            else                        aux[k] = a[j++];
        }
    }

    public static void sort(Comparable a[]){
        int N = a.length;
        Comparable aux[] = new Comparable[a.length];
        for(int sz = 1; sz < N; sz = sz + sz){
            for(int lo = 0; lo < N - sz;  lo += sz + sz);
               // merge(a, aux, );
        }
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static void exc(Comparable a[], int i, int j){
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
