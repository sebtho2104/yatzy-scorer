package com.sebastian.yatzy;

public class YatzyScorer {

     public static int sumOfValue(int[] dice, int value) {
        int sum = 0;
        for (int die : dice){
            if (die == value) {
                sum += value;
            }   
        }
        return sum;
    }
    
    public static int ones(int[] dice) {
        return sumOfValue(dice, 1);
    }

}
