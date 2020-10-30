package com.adaidam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Virtual Rock, Paper, Scissors!");
        System.out.println("Please tell us your name");
        String playerName = scanner.nextLine();

        System.out.println("Hi "+playerName+", let's get started!");
        System.out.println("Would you like to read the rules?\n" + "Yes or Skip");
        String playerResponse = scanner.nextLine();

        //Game Rules
        if(playerResponse.equalsIgnoreCase("Yes")){
            System.out.println("Select your move by typing of of the following:\n"
                    + "1 for Rock, 2 for Paper, or 3 for Scissors\n"
                    + "Rock crushes Scissors, Scissors cuts Paper, but Paper covers Rock\n"
                    + "If you and the computer select the same move, the game goes on!\n"
                    + "Alright, " + playerName + " let's play!");

        } else {
            System.out.println("Thanks for playing!!");
        }

        Game game = new Game;
        game.startGame();

    }
}
