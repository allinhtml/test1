package com.company;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        Main m = new Main();
        System.out.println(m.max(a));

    }

    public int max(int[] a) {
        int maximum = a[0];
        for (int i = 0; i < 100; i++) {
            if (a[i] > maximum)
                maximum = a[i];
        }
        return maximum;
    }
}
