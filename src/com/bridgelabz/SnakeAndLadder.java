package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder");
        int position = 0;
        int playerNumber = 1;
        int noOfTimeDiceRoll = 0;
        System.out.println("Welcome Player " + playerNumber);
        Random random = new Random();
        while (position <= 1) {
            noOfTimeDiceRoll++;
            int roll = random.nextInt(6) + 1; //For roll the die
            if (roll == 6) {
                System.out.println("Dice roll " + noOfTimeDiceRoll + " time");
                position += 1; // If player got number 6 in dice than it start moving and start form 1.
                System.out.println("Player 1 position is 1");
                break;
            } else {
                System.out.println("Dice roll " + noOfTimeDiceRoll + " time");
                System.out.println("Player 1 stays in position 0 ");
            }
        }
        while (position < 88) {
            noOfTimeDiceRoll++;
            int roll = random.nextInt(6) + 1;
            int check = random.nextInt(3);
            switch (check) {
                case 0:
                    position = position + roll;
                    System.out.println("player 1 got number in dice is " + roll);
                    System.out.println("player 1 found a Snake and moved behind ");
                    position = position - roll;
                    System.out.println("player 1 position = " + position);
                    break;
                case 1:
                    position = position + roll;
                    System.out.println("player 1 got number in dice is " + roll);
                    System.out.println("Player 1 moved ahead using Ladder");
                    position = position + roll;
                    System.out.println("player 1 position = " + position);
                    break;
                default:
                    position = position + roll;
                    System.out.println("player 1 got number in dice is " + roll);
                    System.out.println("Player 1 cant move forward");
                    System.out.println("player 1 position = " + position);
                    break;
            }

        }
        while (position <= 100) {
            noOfTimeDiceRoll++;
            int roll = random.nextInt(6) + 1;
            position = position + roll;
            if (position > 100) {
                position = position -roll;
            }
            else if (position==100){
                System.out.println("player 1 got number in dice is " + roll);
                System.out.println("Player 1 cant move forward");
                System.out.println("player 1 position = " + position);
                break;
            }

        }
        System.out.println("For reach the position 100 we have to roll the dice " +  noOfTimeDiceRoll + " time .");

    }
}