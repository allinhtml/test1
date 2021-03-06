package Sorting;

/**
 * Created by prvikani on 6/24/2016.
 */
public class MergeImproved {
    private static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi){
        int i = lo;
        int j = mid+1;
        for(int k = lo; k <= hi; k++){
            if  (i > mid)                   aux[k] = a[j++];
            else if(j > hi)                 aux[k] = a[i++];
            else if(less(a[i], a[j]))       aux[k] = a[i++];
            else                            aux[k] = a[j++];
        }
    }

    private static void sort(Comparable a[], Comparable aux[], int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo)/2;
        sort(aux, a, lo, mid);
        sort(aux, a, mid+1, hi);
        merge(aux, a, lo, mid, hi);
    }

    public static void sort(Comparable a[]){
        Comparable[] aux = new Comparable[a.length];
        for (int i = 0; i < a.length; i++)
            aux[i] = a[i];
        sort(a, aux, 0, a.length - 1);
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
}
