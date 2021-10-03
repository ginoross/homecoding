package com.company;

import java.util.Scanner;

public class RLE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String preString = "";
        int stringLength = 0;
        int postLength = 0;

        System.out.println("Please enter the string you would like to be encoded: ");
        preString = input.next();
        char[] arr = preString.toCharArray();
        System.out.println(arr);
        String[] arr1 = {};

        stringLength = preString.length();

        for (int i = 0; i < stringLength; i++) {
            int charCount = 0;
            while (i < stringLength - 1 && arr[i] == arr[i + 1]) {
                charCount++;
                i++;

            }
            System.out.print(arr[i]);
            System.out.print(charCount);
            postLength += (1 + (Integer.toString(charCount)).length());
        }
        System.out.println("");
        System.out.println("You saved " + (stringLength - postLength + " chars"));


    }
}
