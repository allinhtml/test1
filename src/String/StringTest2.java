/*
* Learning SubString: which can have two parameters start index and end indax
* compareTo method which is use to find lexicographic order is also known as alphabetic order dictionary order
*
*
 */

package String;

import java.util.HashSet;
import java.util.Iterator;

public class StringTest2 {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String max = "", min = "";
        */
        int index = 6;
        //System.out.println("Shifted : "+ (index >> 1));


        HashSet<Integer> h = new HashSet<>(5);
        h.add(3);
        h.add(45);
        h.add(65);
        for(int a: h){
            System.out.println(a);
        }

        Iterator<Integer> itr = h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        /*for (int i = 0; i <= s.length() - n; i++) {
            if (i == 0) {
                min = max = s.substring(i, i + n);
            } else {
                String subString = s.substring(i, i + n);
                if (max.compareTo(subString) < 0) {
                    max = subString;
                }
                if (min.compareTo(subString) > 0) {
                    min = subString;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
*/
    }
}

/*

Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3

Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.
*/