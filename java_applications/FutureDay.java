package week03;

import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //title of the program
        System.out.println(" Given today's day of the week and some number of days in the future\n" +
                " this program will tell you the day of the week for the future day ");
        System.out.print(" Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        int dayToday = input.nextInt();
        System.out.print(" Enter the number of days in the future: ");
        int numberOfDays = input.nextInt();
        final String OPENING_MESSAGE = ("\n" + " Today is");
        final String FUTURE_MESSAGE = ("and the future day is");
        final String LAST_MESSAGE = ("\n"+ " Goodbye. ");
        final String INVALID_MESSAGE = ("You must enter a positive Number ");
        //calculation for determine the next future days
        final int FUTURE_DAY = (numberOfDays + dayToday) % 7;



        if (dayToday < 0 && numberOfDays < 0){ //condition for negative numbers
            System.out.println("\n"+ " " + dayToday + " and " + numberOfDays + " are invalid. " + INVALID_MESSAGE
            + LAST_MESSAGE);
        }
        else if (dayToday < 0 && numberOfDays > 0 ){
            System.out.println("\n"+ " " + dayToday + " is invalid. " + INVALID_MESSAGE
                    + LAST_MESSAGE);
        }
        else if (numberOfDays < 0 && dayToday > 0 ){
            System.out.println("\n"+ " " + numberOfDays + " is invalid. " + INVALID_MESSAGE
                    + LAST_MESSAGE);
        }

        else {
            switch (dayToday) {
                case 0 :
                    System.out.print(OPENING_MESSAGE + " Sunday ");
                    break;
                case 1 :
                    System.out.print(OPENING_MESSAGE + " Monday ");
                    break;
                case 2 :
                    System.out.print(OPENING_MESSAGE + " Tuesday ");
                    break;
                case 3 :
                    System.out.print(OPENING_MESSAGE + " Wednesday ");
                    break;
                case 4 :
                    System.out.print(OPENING_MESSAGE + " Thursday ");
                    break;
                case 5 :
                    System.out.print(OPENING_MESSAGE + " Friday ");
                    break;
                case 6 :
                    System.out.print(OPENING_MESSAGE + " Saturday ");
                    break;
            }

            switch (FUTURE_DAY) {
                case 0 :
                    System.out.print(FUTURE_MESSAGE + " Sunday ");
                    break;
                case 1 :
                    System.out.print(FUTURE_MESSAGE + " Monday ");
                    break;
                case 2 :
                    System.out.print(FUTURE_MESSAGE + " Tuesday ");
                    break;
                case 3 :
                    System.out.print(FUTURE_MESSAGE + " Wednesday ");
                    break;
                case 4 :
                    System.out.print(FUTURE_MESSAGE + " Thursday ");
                    break;
                case 5 :
                    System.out.print(FUTURE_MESSAGE + " Friday ");
                    break;
                case 6 :
                    System.out.print(FUTURE_MESSAGE + " Saturday ");
                    break;
            }
            System.out.println(LAST_MESSAGE);
        }


    }
}