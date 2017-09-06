package sparc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    static int[] stringSimilarity(String[] inputs) {
        int[] sums = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            sums[i] = getSimilaritySum(inputs[i]);
        }
        return sums;
    }

    static int getSimilaritySum(String input) {
        int[] similarities = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            similarities[i] = getPrefixSimilarity(input, input.substring(i));
        }
        return java.util.stream.IntStream.of(similarities).sum();
    }

    static int getPrefixSimilarity(String input, String prefix) {
        int i = 0;
        while (i < prefix.length() && input.charAt(i) == prefix.charAt(i)) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;

        int _inputs_size = 0;
        _inputs_size = Integer.parseInt(in.nextLine().trim());
        String[] _inputs = new String[_inputs_size];
        String _inputs_item;
        for(int _inputs_i = 0; _inputs_i < _inputs_size; _inputs_i++) {
            try {
                _inputs_item = in.nextLine();
            } catch (Exception e) {
                _inputs_item = null;
            }
            _inputs[_inputs_i] = _inputs_item;
        }

        res = stringSimilarity(_inputs);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }


}
