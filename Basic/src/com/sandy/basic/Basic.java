package com.sandy.basic;

import java.util.Arrays;

/**
 * Created by sandy on 9/11/2015.
 */
public class Basic {
    public static void main(String[] args) {
        String []str = new String[]{"kishore", "ram", "rahim", "vasudha", "anand"};

        //This is an simple example of lambda
        Arrays.sort(str, (x,y)->x.compareTo(y));
        System.out.println(Arrays.deepToString(str));
    }
}
