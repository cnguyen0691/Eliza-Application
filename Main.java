package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Good day. What is your problem?" );
        boolean ans = false;
        while (ans == false) {
                System.out.println("Enter your response here or Q to quit: ");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("Q") ||
                        answer.equals("i am feeling great")) {
                    System.out.println(">>>End");
                    break;
                }

            }
        }
    }

