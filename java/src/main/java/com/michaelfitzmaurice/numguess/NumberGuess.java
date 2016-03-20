package com.michaelfitzmaurice.numguess;

import java.lang.Integer;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

  public static void main(String[] args) {
    int upperBound = 100;
    if (args.length >= 1) {
      upperBound = Integer.parseInt(args[0]);
    }

    int numberToGuess = new Random().nextInt(upperBound + 1);
    System.out.println(
            String.format("\nI've chosen a number between 1 and %s. See if you can guess it:",
                          upperBound));

    int guess = -1;
    int numberOfGuesses = 0;
    Scanner scanner = new Scanner(System.in);
    while (guess != numberToGuess) {
      guess = scanner.nextInt();
      numberOfGuesses++;
      if (guess < numberToGuess) {
        System.out.println("Nope! Go higher:");
      } else if (guess > numberToGuess) {
        System.out.println("Nope! Go lower:");
      }
    }

    System.out.println(String.format("Congratulations! The number was indeed %s. You took %s guesses.",
                                      numberToGuess,
                                      numberOfGuesses));
  }
}