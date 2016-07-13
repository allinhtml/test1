package String;

import java.util.Scanner;

class RegExample1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();

        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.replaceAll("[\\p{Punct}\\t+\\n+]", " ").split("\\s+");
            System.out.println(strings.length);
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        }
    }
}

/*

import java.io.*;
import java.util.*;



public class Solution {


    public static void main(String[] args)
    {


      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
      String[] tokens = s.split("[ !,?._@']");

      int ans=0;
      for (String token : tokens)if(token.length()>0)ans++;
      System.out.println(ans);
      for (String token : tokens)
      {
            if(token.length()>0)
            System.out.println(token);
       }

    }
}
 */