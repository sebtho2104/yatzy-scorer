package com.sebastian.yatzy;

import java.util.Random;

public class RandomDiceRoller implements DiceRoller {
    private Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}