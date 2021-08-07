package week03;
import java.util.Scanner;

public class CalculateDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Title of the Program
        System.out.println(" Given a year and a month in that year, this program will tell you\n" +
                " the number of days in that month. ");
        System.out.print(" Enter a year: ");
        int year = input.nextInt();
        System.out.print(" Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int value = input.nextInt();
        final String LAST_MESSAGE = (" Goodbye. ");

        if (year < 0){ // conditions for negative numbers
            System.out.println("\n" + " " + year + " is a negative year. " +
                    "We only accept positive number for years.");
        }
        //limit the year range to only 9999; Just to be realistic
         else if (year < 10000) {
            switch (value) {
                case 1 : //Use switch to convert value into string
                    System.out.print("\n" + " January ");
                    break;
                case 2 :
                    System.out.print("\n" + " February ");
                    break;
                case 3 :
                    System.out.print("\n" + " March ");
                    break;
                case 4 :
                    System.out.print("\n" + " April ");
                    break;
                case 5 :
                    System.out.print("\n" + " May ");
                    break;
                case 6 :
                    System.out.print("\n" + " June ");
                    break;
                case 7 :
                    System.out.print("\n" + " July ");
                    break;
                case 8 :
                    System.out.print("\n" + " August ");
                    break;
                case 9 :
                    System.out.print("\n" + " September ");
                    break;
                case 10 :
                    System.out.print("\n" + " October ");
                    break;
                case 11 :
                    System.out.print("\n" + " November ");
                    break;
                case 12 :
                    System.out.print("\n" + " December ");
                    break;
                default: //output for invalid month input; if the value is greater that 12
                    System.out.print("\n" + " " + value + " is invalid. Month values must be between between 1 and 12, inclusive."
                    + LAST_MESSAGE);
                    break;
                }
            if (year % 4 == 0) //condition for leap year
                {
                    if (value == 1 || value == 3 || value == 5 || value == 7 || value == 8 ||
                            value == 10 || value == 12 )
                        {
                            System.out.println("of " + year + " has 31 Days in it. " + "\n" + LAST_MESSAGE);
                        }
                    else if ( value == 4 || value == 6 || value == 9 || value == 11 )
                        {
                            System.out.println("of " + year + " has 30 Days in it. " + "\n" + LAST_MESSAGE);
                        }
                    else if ( value == 2 )
                        {
                            System.out.println("of " + year + " has 29 Days in it. " + "\n" + LAST_MESSAGE);
                        }
                }
            else if (value <= 12){
                if (value == 1 || value == 3 || value == 5 || value == 7 || value == 8 ||
                        value == 10 || value == 12 )
                    {
                        System.out.println("of " + year + " has 31 Days in it." );
                    }

                else if ( value == 4 || value == 6 || value == 9 || value == 11 )
                    {
                        System.out.println("of " + year + " has 30 Days in it.");
                    }
                else if ( value == 2 )
                    {
                        System.out.println("of " + year + " has 28 Days in it.");
                    }
                System.out.println(LAST_MESSAGE);
                }
        }
      else {
            System.out.println("\n" + " " + year + " is invalid year. Year is between" +
                    "0 to 9999 inclusive ");
        }
    }
}

