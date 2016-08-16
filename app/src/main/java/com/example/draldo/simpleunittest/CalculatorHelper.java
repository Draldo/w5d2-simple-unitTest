package com.example.draldo.simpleunittest;

/**
 * Created by Draldo on 16/08/2016.
 */
public class CalculatorHelper {

    public static int sumItems(int n1, int n2){
        return  n1 + n2;
    }

    public static int multiplyItems(int n1, int n2) {
        int mult = 0;
        for (int i=0; i<n2; i++){
            mult += n1;
        }
        return mult;
    }

    public static int powerItems(int n1, int n2){
        int pow = 0;
        int temp = n1;
        if(n2 == 0){
            return 1;
        } else if (n2 == 1) {
            return n1;
        } else {
            for (int i=1; i<n2; i++){
                temp = multiplyItems(temp,n1);
            }
        }
        pow = temp;

        return pow;
    }
}
