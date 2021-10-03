package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class RandTally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int diceSides = 0;
        int diceThrows = 0;
        int totalDice = 0;
        Map<Integer, Integer> Tally = new HashMap<Integer, Integer>();

        System.out.println("How many sides do you want your dice to have: ");
        diceSides = input.nextInt();
        System.out.println("How many times do you want to throw your dice: ");
        diceThrows = input.nextInt();


        for (int i = 1; i < diceSides; i++) {
            Tally.put(i,0);

        }

        for (int i = 0; i < diceThrows; i++) {
            int newRandom = random.nextInt(diceSides - 1);
            newRandom = newRandom + 1;

            int tempNum = Tally.get(newRandom);
            tempNum +=1;
            Tally.replace(newRandom,tempNum);

            totalDice = totalDice + newRandom;

        }

        for (int i = 1; i < diceSides; i++) {
            double tallyPercent = (Tally.get(i))/(double)diceThrows*100;
            System.out.println("The number of "+i+"s you threw was "+Tally.get(i)+ " or "+Math.round(tallyPercent)+"%");

        }


    }
}
