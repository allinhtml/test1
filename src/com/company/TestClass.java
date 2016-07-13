package com.company;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.*;
import java.util.*;

//-----------PrintWriter for faster output---------------------------------


class TestClass {
    public static PrintWriter out;
    public static void main(String args[] ) throws Exception {

        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        out.println("Enter N:");
        int N = sc.nextInt();
        out.println("Enter M:");
        int M = sc.nextInt();


        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            out.println("Enter Knowledge level: ");
            a[i] = sc.nextInt();
        }
        UF uf = new UF(N);

        while (M > 0) {
            out.println("Enter P:");
            int p = sc.nextInt();
            out.println("Enter q:");
            int q = sc.nextInt();
            if (uf.connected(p-1, q-1)) continue;
            uf.union(p-1, q-1);
            //sc.println(p + " " + q);
            M--;
        }
        //StdOut.println(uf.count() + " components");
        out.println(uf.leaders());
        out.close();
    }

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}





class UF {

    private int[] parent;  // parent[i] = parent of i
    private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
    private int count;     // number of components
    private int totalCount;


    public UF(int n) {
        if (n < 0) throw new IllegalArgumentException();
        count = n;
        totalCount = n;
        parent = new int[n];
        rank = new byte[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];    // path compression by halving
            p = parent[p];
        }
        return p;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make root of smaller rank point to root of larger rank
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IndexOutOfBoundsException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    public int leaders(){
        HashSet<Integer> hs = new HashSet();
        for(int i=0; i<totalCount; i++){
            hs.add(parent[i]);
        }
        return hs.size();
    }
}
