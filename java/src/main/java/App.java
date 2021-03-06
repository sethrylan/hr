import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
//        IntStream.of(oddNumbers(1,4)).forEach(System.out::println);
//        IntStream.of(rotateLeft(new int[]{1, 2, 3, 4, 5}, 4)).forEach(e -> System.out.print(e + " "));
    }


    public static int[] rotateLeft(int[] arr, int k) {
        k = k % arr.length;
        int[] result = new int[arr.length];
        for (int x = 0; x <= arr.length - 1; x++) {
            result[(arr.length - k + x) % arr.length] = arr[x];
        }
        return result;
    }

    public static void testRotateLeft() {
        Assert.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, rotateLeft(new int[]{1, 2, 3, 4, 5}, 4));
        Assert.assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, rotateLeft(new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10));
    }

    public static int[] rotateRight(int[] arr, int k) {
        int[] result = new int[arr.length];
        for (int x = 0; x <= arr.length - 1; x++) {
            result[(x + k) % arr.length] = arr[x];
        }
        return result;
    }


    static String findNumber(int[] arr, int k) {
        if (IntStream.of(arr).anyMatch(a -> a == k)) {
            return "YES";
        } else {
            return "NO";
        }

    }

    static int[] oddNumbers(int l, int r) {
        return IntStream.rangeClosed(l, r).filter(i -> i % 2 == 0).toArray();
    }

}
