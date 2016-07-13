package Sorting;

public class Merge {

    private static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi){
        for(int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid+1;
        for(int k = lo; k <= hi; k++){
            if  (i > mid)                   a[k] = aux[j++];
            else if(j > hi)                 a[k] = aux[i++];
            else if(less(aux[i], aux[j]))   a[k] = aux[i++];
            else                            a[k] = aux[j++];
        }
    }

    private static void sort(Comparable a[], Comparable aux[], int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable a[]){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
}
