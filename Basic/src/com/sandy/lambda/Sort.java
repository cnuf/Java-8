package com.sandy.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sandy on 9/11/2015.
 */
public class Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        //Lambda function to sort List<String>
        Collections.sort(names, String::compareTo);
        System.out.println(names);
    }
}
