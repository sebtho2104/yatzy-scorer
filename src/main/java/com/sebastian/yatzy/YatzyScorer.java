package com.sebastian.yatzy;

public class YatzyScorer {

    public static int ones(int[] dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 1) {
                sum += 1;
            }
        }
        return sum;
    }
}
