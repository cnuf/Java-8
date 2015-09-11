package com.sandy.defaultMethods;

interface Formula{
    double add(int a, int b);

    /**
     * This a default method in Java 8 interface.
     * The key part of it is 'default' keyword
     *
     * @param a
     * @return
     */
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}

/**
 * Created by sandy on 9/11/2015.
 */
public class DefaultMethods {
    public static void main(String[] args) {
        Formula f = new Formula() {
            @Override
            public double add(int a, int b) {
                return a+b;
            }
        };

        System.out.println(f.add(1,2));
        System.out.println(f.sqrt(4));
    }
}
