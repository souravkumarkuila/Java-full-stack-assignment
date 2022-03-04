package main;

import java.util.Arrays;
public class junitassignment3 {
    public static int[] findMinMax(int[] arr) {
        int[] as = new int[2];
        as[0] = (Arrays.stream(arr).min().getAsInt());
        as[1] = (Arrays.stream(arr).max().getAsInt());
        return as;
    }
    //Modify the above method to return a single object representing min and max value of the
    //pass array. Define new sets of Junit Test cases of this modified method.

    public static String findMinMax2(int[] arr) {
        int min = (Arrays.stream(arr).min().getAsInt());
        int max = (Arrays.stream(arr).max().getAsInt());
        return "Min is "+ min+" Max is "+max;
    }
}