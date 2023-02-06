package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder");
        int position=0;
        int playerCount=1;
        int playerNumber=1;
        System.out.println("Welcome Player " + playerNumber);
        Random random = new Random();
        int roll = random.nextInt(6)+1; //For roll the die
    }
}
