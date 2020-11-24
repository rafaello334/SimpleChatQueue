package com.application.utils;

import com.application.model.Answer;

import java.util.Map;
import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int getIntFromConsole() {
        try {
            String userInput = scanner.nextLine();
            return Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("Error occurred while reading your value. Make sure you use only integer number.\n");
        }
        return -1;
    }

    public static Answer getPossibleAnswer(Map<Character, Answer> possibleAnswers) {
        try {
            String userInput = scanner.nextLine();
            if(userInput.length() == 1) {
                return possibleAnswers.get(userInput.toUpperCase().charAt(0));
            }
        } catch (Exception e) {
            System.out.println("Error occurred while reading your value. Make sure you use only integer number.\n");
        }
        return null;
    }
}
