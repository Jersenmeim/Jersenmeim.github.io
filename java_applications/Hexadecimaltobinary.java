package week04;
//Jersen Meim
//CIT 260
//
//     1. Tells the user what the program does.
//     2. Prompts the user to enter a hexadecimal digit.
//     3. Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and
//        terminate the program.
//     4. Converts the hexadecimal digit into a four digit binary number.
//     5. Outputs the four digit binary number, including any leading zeros.
//     6. Outputs a goodbye message.

//     Here are some examples of what your program should look like when it runs
//     (user input is in green):
//     This program converts a hexadecimal digit into a four digit binary number.
//     Enter a hexadecimal number: B

 //    The binary value is 1011.
 //    Goodbye.
//     This program converts a hexadecimal digit into a four digit binary number.
//     Enter a hexadecimal number: G
//
//     G is not a valid hexadecimal digit.
//     Goodbye.
import java.util.Scanner;
public class W4dot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program converts a hexadecimal digit into a four digit binary number. ");
        System.out.print("Enter a hexadecimal number:");
        String hex = input.nextLine();
        final String LAST_MESSAGE = ("\n" + "Goodbye.");
        // Check if the hex string has exactly one character
        if (hex.length() != 1) {
            System.out.println("\n"+ "You must enter exactly one character" + LAST_MESSAGE);
            //exit if the input hits the condition
            System.exit(1);

        }

        // Display decimal value for the hex digit and Change the input to uppercase
        char ch = Character.toUpperCase(hex.charAt(0));
        int value = 0;
        if (ch <= 'F' && ch >= 'A') {
            value = ch - 'A' + 10;
        }
        //checks whether a character is numeric character(0-9) or not.
        else if (Character.isDigit(ch)) {
            value = ch - '0';
            //checks whether a character is a valid hex digit or not.
        } else {
            System.out.println("\n" + ch + " is not a valid hexadecimal digit" + LAST_MESSAGE);
            System.exit(1);

        }

        //converts integer to binary
        //%4s prints out the string, left-padded by spaces until the total length is 4
        //Use replace method to replace space by zeroes
        String binary = String.format("%4s", Integer.toBinaryString(value)).replace(" ", "0");
        System.out.println("\n" + "The binary value for hex digit " + ch + " is "
                + binary + LAST_MESSAGE);
    }
 }

