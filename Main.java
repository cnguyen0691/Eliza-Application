package com.company;


import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("Good day. What is your problem?");

        ArrayList<String> qualifiers = new ArrayList<>();
        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to think that");
        qualifiers.add("So, you are concerned that");

        while (true) {
            System.out.print("Enter your response here or Q to quit: ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Q") ||
                    answer.equalsIgnoreCase("i am feeling great")) {
                System.out.println(">>>End");
                break;
            }
            String[] retval = answer.split(" ");
            for (int i = 0; i < retval.length; i++) {
                if (retval[i].equalsIgnoreCase("i")) {
                    retval[i] = "you";
                } else if (retval[i].equalsIgnoreCase("me")) {
                    retval[i] = "you";
                } else if (retval[i].equalsIgnoreCase("my")) {
                    retval[i] = "your";
                } else if (retval[i].equalsIgnoreCase("am")) {
                    retval[i] = "are";
                }
                result = String.join(" ", retval);
            }

            System.out.println(randItems(qualifiers) + " " + result);

        }
    }

    public static String randItems(ArrayList<String>itemList){
        Random rand = new Random();
        String randItems= itemList.get(rand.nextInt(itemList.size()));
        return randItems;
    }
}

