package com.sebastian.yatzy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class YatzyScorerTests{

    @Test
    public void ones_returnsZeroWhenNoOnes() {
        int [] dice = {2, 2, 4, 5, 6};
        int result = YatzyScorer.ones(dice);
        assertEquals(0, result);
    }

    @Test
    public void onePair_returnsHighestValue() {
        int [] dice = {2, 2, 4, 6, 6};
        int result = YatzyScorer.onePair(dice);
        assertEquals(12, result);
    }

}
