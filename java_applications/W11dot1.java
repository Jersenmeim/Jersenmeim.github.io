package week11;
import java.io.*;
import java.util.*;
/*
Write a Java program that does the following:

    1. Tells the user what the program does.
    2. Asks the user to enter in 10 integer values. If a non-integer value is entered, your program should
    display an error message and re-prompt the user to enter that value.
    3. Stores the user's input in an array of integers.
    4. Opens a file named data.txt. If the file does not exist, your program should create it.
    If the file cannot be opened, an error message is displayed and the program terminates.
    5. Writes the ten integer values entered by the user to the file. Write each integer value on
    a separate line.
    6. Closes the file.
    7. Opens the file. If the file cannot be opened, an error message is displayed and the program terminates.
    8. Reads the data back in from the file and sums the values as the data is read in.  An error message
    is displayed if there is an error reading the data, and the program is terminated.
    9. Computes and displays the average value of the numbers in the file. Show the average with two
    digits after the decimal point.
    10. Displays a goodbye message.

The example below show what your program should look like when it runs (user input is in green).

This program gets ten numbers from the user, and
computes and displays the average.

Please enter ten integer values.
Enter integer 1:
4
Enter integer 2:
5
Enter integer 3:
xyz
Error: input must be an integer.
Enter integer 3:
4
Enter integer 4:
5
Enter integer 5:
4
Enter integer 6:
5
Enter integer 7:
4
Enter integer 8:
5
Enter integer 9:
4
Enter integer 10:
5
The average of the input values is 4.50
Goodbye ...


*/
public class W11dot1 {
    public static void main(String[] args) throws IOException {
        //What the program does
        System.out.println("This program gets ten numbers from the user, and\n" +
                "computes and displays the average.");
        System.out.println("\n" + "Please enter ten integer values.");
        Scanner input = new Scanner(System.in);
        //Storing Data in array
        int[] arrayOfNumbers = new int[10];
        double total = 0;
        for (int i = 0; i < 10; i ++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            try {
                arrayOfNumbers[i]  = input.nextInt();
            }
            catch (Exception e) {
                System.out.println("Error: input must be an integer.");
                input.nextLine();
                --i;
            }
        }


        //Creating File
        File myObj = new File("data.txt");
        try {

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Writing a File
        FileWriter myWriter = new FileWriter("data.txt");
        for (int numbers : arrayOfNumbers) {
            total = total + numbers;
            try {
                myWriter.write(String.format("%s\n", numbers)) ;
            }catch (Exception e){
                System.out.println("An Error Has occurred");
                e.printStackTrace();
            }
        }
        //myWriter.close();


        //Reading a file
        Scanner myReader = new Scanner(myObj);
        int data;
        List<Integer> array2 = new ArrayList<>();
        while (myReader.hasNextInt()){
            data = myReader.nextInt();
            array2.add(data);
        }
        for (int s : array2) {
            total = total + s;
        }
        double average = total / arrayOfNumbers.length;
        String str = String.format("%.2f", average);


        //Outputting the file for both java and txt file
        System.out.println("The average of the input values is " + str + "\n" +
                "Goodbye ...");

        myWriter.write("The average of the input values is " + str + "\n" +
                "Goodbye ...");

        myWriter.close();

    }
}
