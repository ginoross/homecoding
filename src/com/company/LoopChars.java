package com.company;

import java.util.Scanner;

public class LoopChars {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        char[] alphabet = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
        String startChar = "";
        int loopValue = 0;
        int startIndex = 0;
        int overflowIndex = 0;
        int startNum = 0;

        System.out.println("What letter / number would you like to start from? ");
        startChar = input.next();

        try {
            startNum = Integer.parseInt(startChar);
        } catch (Exception e) {
            System.out.println("How many letters would you like to loop through? ");
            loopValue = input.nextInt();

            startIndex = new String(alphabet).indexOf(startChar);
            for (int i = startIndex; i < (startIndex + loopValue); i++) {
                if (i > (alphabet.length - 1)) {
                    overflowIndex = i;
                    do {
                        overflowIndex = overflowIndex - alphabet.length;
                    } while (overflowIndex > 25);

                    System.out.print(alphabet[overflowIndex]);
                } else {
                    System.out.print(alphabet[i]);
                }
            }
            System.exit(1);
        } finally {
            System.out.println("How many numbers would you like to loop through? ");
            loopValue = input.nextInt();
            for (int i = startNum; i > startNum - loopValue; i--) {
                System.out.print(i + ", ");

            }
        }


    }
}
