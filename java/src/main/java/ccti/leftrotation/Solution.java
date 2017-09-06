package ccti.leftrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        IntStream.of(rotateLeft(a,k)).forEach(e -> System.out.print(e + " "));
    }

    public static int[] rotateLeft(int[] arr, int k) {
        k = k % arr.length;
        int[] result = new int[arr.length];
        for (int x = 0; x <= arr.length - 1; x++) {
            result[(arr.length - k + x) % arr.length] = arr[x];
        }
        return result;
    }





}
