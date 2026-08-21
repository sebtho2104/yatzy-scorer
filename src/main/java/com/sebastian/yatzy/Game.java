package com.sebastian.yatzy;

public class Game {

    private DiceRoller diceRoller;

    public Game(DiceRoller diceRoller) {
        this.diceRoller = diceRoller;
    }

    public int[] rollAllDice() {
        int[] dice = new int[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = diceRoller.roll();
        }
        return dice;
    }
}