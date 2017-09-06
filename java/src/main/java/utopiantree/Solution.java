package utopiantree;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] cases = new int[t];
        for (int j=0; j < t; j++) {
            cases[j] = in.nextInt();
        }
        algo(cases);
    }

    public static void algo(int[] cases){
        for (int c : cases) {
            System.out.println(utopianGrowth(c));
        }
    }

    public static int utopianGrowth(int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return (utopianGrowth(n-1) + 1);
        } else {
            return (utopianGrowth(n-1) * 2);
        }
    }

}