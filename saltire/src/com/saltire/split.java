package com.saltire;

import java.util.ArrayList;
import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String re = "91 46 35 90 72";

        String[] arrString = re.split(" ");
        int[] arrInt = new int[arrString.length];

        for (int i = 0; i < arrString.length; i++) {
            arrInt[i] = Integer.parseInt(arrString[i]);
        }

        Arrays.sort(arrInt);

        System.out.println();;
    }
}
