package com.sebastian.yatzy;

public class YatzyScorer {

     public static int sumOfValue(int[] dice, int value) {
        int sum = 0;
        for (int die : dice) {
            if (die == value) {
                sum += value;
            }   
        }
        return sum;
    }

    public static int[] countValues(int[] dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1] += 1;
        }
        return counts;
    }
    
    public static int ones(int[] dice) {
        return sumOfValue(dice, 1);
    }

    public static int onePair(int[] dice) {
        int[] counts = countValues(dice);
        int pairSum = 0;
        for (int i = counts.length -1; i >= 0; i--) {
            if (counts[i] >= 2){
                pairSum= 2 * (i + 1);
                return pairSum;
            }
        }
        return pairSum;
    }


}
