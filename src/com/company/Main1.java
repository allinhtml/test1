package com.company;


public class Main1 {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 4, 7};

        Main1 m1 = new Main1();

        int[] c = m1.find(a, b);
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0)
                System.out.println(c[i]);
        }
    }

    public int[] find(int[] a, int[] b) {
        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int counter = 0;
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                c[counter++] = a[i];
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return c;
    }

}
