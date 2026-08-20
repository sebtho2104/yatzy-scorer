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
}
