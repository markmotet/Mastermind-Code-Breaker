/*
markmotet
December 30th, 2019

DESCRIPTION:
A command line program that suggests guesses, allowing the
user to win a game of Mastermind in about five or six guesses.
*/

import java.util.*;
import  java.lang.Math;

public class Mastermind {

    //Defining Mastermind colours as integers 0 through 7
    static final int RED = 0;
    static final int ORANGE = 1;
    static final int YELLOW = 2;
    static final int GREEN = 3;
    static final int BLUE = 4;
    static final int PINK = 5;
    static final int GREY = 6;
    static final int WHITE = 7;

    //Returns the number of pins of the a guess code that are the correct colour given an answer code
    public static int whiteSlider(Code guessCode, Code answerCode) {
        int whiteSliderCounter = 0;
        for (int i = 0; i < 8; i++) {
                for (int j = 0; j < (Math.min(guessCode.colourCountArray[i], answerCode.colourCountArray[i])); j++) {
                    whiteSliderCounter++;
                }
        }
        return whiteSliderCounter;
    }

    //Returns the number of pins of the guess code that have the correct position and colour given an answer code
    public static int redSlider(Code guessCode, Code answerCode) {
        int redSliderCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (guessCode.codeArray[i] == answerCode.codeArray[i]) {
                redSliderCounter++;
            }
        }
        return redSliderCounter;
    }

    //Prints the next ideal code guess
    public static void MastermindGuesser () {

        //Creates a linked list of Mastermind codes that has every possible combination in it
        LinkedList<Code> potentialAnswersCodeList = new LinkedList<Code>();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        potentialAnswersCodeList.add(new Code (i, j, k, l));
                    }
                }
            }
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first guess: ");
        Code guessCode = new Code(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());

        System.out.print("Your starting guess code: ");
        guessCode.printCode();

        while (true) {

            //Gets the white slider value of the last guess from user input
            System.out.print("Enter the WHITE slider number: ");
            int whiteSliderNumber = input.nextInt();
            System.out.println("You entered " + whiteSliderNumber);

            //Gets the red slider value of the last guess from user input
            System.out.print("Enter the RED slider number: ");
            int redSliderNumber = input.nextInt();
            System.out.println("You entered " + redSliderNumber);

            for (int i = 0; i < potentialAnswersCodeList.size(); i++) {
                if (redSlider(guessCode, potentialAnswersCodeList.get(i)) != redSliderNumber || whiteSlider(guessCode, potentialAnswersCodeList.get(i)) != whiteSliderNumber) {
                    potentialAnswersCodeList.remove(i);
                    i--;
                }
            }
            guessCode = potentialAnswersCodeList.get(0);
            guessCode.printCode();
        }
    }

    public static void main(String[] args) {

        MastermindGuesser();

    }
}


