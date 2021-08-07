package week12;

//Provides for system input and output through data streams, serialization and the file system.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Welcome to your online music player!
Please enter the details of the three songs that you like add or remove in the playlist

Creating file name: Music.txt
File created: Music.txt

if already exist -->

Creating file name: Music.txt
File already exists: Music.txt



Enter the Released Year of the Music
(Only accepts year between 1000 to 9999, No Negative Numbers):
2

Enter the Released Year of the Music
(Only accepts year between 1000 to 9999, No Negative Numbers):
-1

Enter the Released Year of the Music
(Only accepts year between 1000 to 9999, No Negative Numbers):
2013
Enter the Title of the Music:
(Null)
Invalid Input
Enter the Title of the Music:
Story of My Life
Enter the Band of the Music:
(Null)
Invalid Input
Enter the Band of the Music:
One Direction
Enter the Genre (e.g. “pop, rock or jazz”):
2
Invalid Input
Enter the Genre (e.g. “pop, rock or jazz”):
OPM
Invalid Input
Enter the Genre (e.g. “pop, rock or jazz”):
pop
Do you want to include the Mashup Version? (e.g. “y or n”):
1
Invalid Input
Do you want to include the Mashup Version? (e.g. “y or n”):
2
Invalid Input
Do you want to include the Mashup Version? (e.g. “y or n”):
y
Do you want to add or remove this song in the playlist? (Type "1" to add or "2" to remove)
s
Invalid Input
Do you want to add or remove this song in the playlist? (Type "1" to add or "2" to remove)
3
Invalid Input
Do you want to add or remove this song in the playlist? (Type "1" to add or "2" to remove)
2

Enter the Released Year of the Music
(Only accepts year between 1000 to 9999, No Negative Numbers):
2015
Enter the Title of the Music:
Payphone
Enter the Band of the Music:
Maroon 5
Enter the Genre (e.g. “pop, rock or jazz”):
rock
Do you want to include the Acoustic Version? (e.g. “y or n”):
y
Do you want to add or remove this song in the playlist? (Type "1" to add or "2" to remove)
2

Enter the Released Year of the Music
(Only accepts year between 1000 to 9999, No Negative Numbers):
2008
Enter the Title of the Music:
The Man Who Can't be moved
Enter the Band of the Music:
The Script
Enter the Genre (e.g. “pop, rock or jazz”):
jazz
Do you want to include the Instrumental Version? (e.g. “y or n”):
n
Do you want to add or remove this song in the playlist? (Type "1" to add or "2" to remove)
1
Do you want to play the music? (e.g. “y or n”):
y

//Output

 Music Successfully Removed
 Title:  Story of My Life
 Band: One Direction
 Recorded: 2013
 Genre: pop
 Version: Mashup
 Playing: false
 Modified: Wed Jul 22 11:05:31 SGT 2020

 Music Successfully Removed
 Title: Payphone
 Band: Maroon 5
 Recorded: 2015
 Genre: rock
 Version: Acoustic
 Playing: false
 Modified: Wed Jul 22 11:05:31 SGT 2020

 Music Successfully Added
 Title: The Man Who Can't be moved
 Band: The Script
 Recorded: 2008
 Genre: jazz
 Version: Non Instrumental
 Playing: false
 Modified: Wed Jul 22 11:05:31 SGT 2020
 Goodbye...
*/


public class FinalProject {
    public static void main(String[] args) throws IOException{

         /*
         Constructs a new Scanner that produces values scanned from the specified input stream.
         */


        Scanner input = new Scanner(System.in);

         /*
            Create a new object for class Genre,Pop,rock and jazz
         */
        Genre x = new Genre();
        Pop mashup = new Pop();
        Rock acoustic = new Rock();
        Jazz instrumental = new Jazz();
        boolean error;

        //Generate of what the program does
        Genre.welcome();

        //list of arrays

        String[] title = new String[3];
        String[] band = new String[3];
        int[] releaseDate = new int[3];
        String[] genre = new String[3];
        boolean[] added = new boolean[3];
        boolean[] playing = new boolean[3];
        boolean[] version = new boolean[3];

        //Creating File
        File myObj = new File("Music.txt");
        System.out.println("\nCreating file name: " + myObj.getName());
        //Try and Catch block for creating a file
        try {

            if (myObj.createNewFile()){

                System.out.println("File created: " + myObj.getName());
            }

            else{
                System.out.println("File already exists: " + myObj.getName());
            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



         /*
            Prompt the user to enter the released date and loop if the condition is false or has invalid input.
            Try and Catch block is included.
         */
        for (int i = 0; i < 3; i++) {
            do {
                error = false;
                try {
                    System.out.println("\n" + "Enter the Released Year of the Music" );
                    System.out.println("(Only accepts year between 1000 to 9999, No Negative Numbers): " );
                    releaseDate[i] = x.setRecorded(input.nextInt());
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid Input");
                    error = true;
                    input.nextLine();
                }
            } while ((error) || (releaseDate[i]<1000 || releaseDate[i]>9999));

            //Prompt to enter the title
            System.out.println("Enter the Title of the Music: ");
            //Don't accept null and empty String
            while ((title[i] = x.setTitle(input.nextLine())).isBlank()) {
                System.out.println("Invalid Input");
                System.out.println("Enter the Title of the Music: ");
            }


            //Prompt to enter the band
            System.out.println("Enter the Band of the Music: ");
            //Don't accept null and empty String
            while ((band[i] = x.setBand(input.nextLine())).isBlank()) {
                System.out.println("Invalid Input");
                System.out.println("Enter the Band of the Music: ");
            }


            /*
                Prompt to enter the genre and loop if the condition is false or has invalid input. Try and Catch
                block is included.
            */
            System.out.println("Enter the Genre (e.g. “pop, rock or jazz”): ");
            do {
                error = false;

                String yn = input.next();
                switch (yn) {
                    case "pop" -> genre[i] = x.type("pop");
                    case "rock" -> genre[i] = x.type("rock");
                    case "jazz" -> genre[i] = ("jazz");
                    default -> {
                        System.out.println("Invalid Input");
                        System.out.println("Enter the Genre (e.g. “pop, rock or jazz”): ");
                        error = true;
                    }
                }


                 /*
                    Condition for the pop genre, provides a Mashup Version.
                 */
                switch (yn) {
                    case "pop" -> {
                        System.out.println("Do you want to include the Mashup Version? (e.g. “y or n”):");
                        do {
                            error = false;

                            String ans = input.next();
                            switch (ans) {
                                case "y" -> version[i] = mashup.setMashup(true);
                                case "n" -> version[i] = mashup.setMashup(false);
                                default -> {
                                    System.out.println("Invalid Input");
                                    System.out.println("Do you want to include the Mashup Version? (e.g. “y or n”):");
                                    error = true;
                                }
                            }
                        } while ((error));
                    }

                     /*
                        Condition for the rock genre, provides a Acoustic Version.
                    */
                    case "rock" -> {
                        System.out.println("Do you want to include the Acoustic Version? (e.g. “y or n”):");
                        do {
                            error = false;

                            String ans = input.next();
                            switch (ans) {
                                case "y" -> version[i] = acoustic.setAcoustic(true);
                                case "n" ->version[i] =  acoustic.setAcoustic(false);
                                default -> {
                                    System.out.println("Invalid Input");
                                    System.out.println("Do you want to include the Acoustic Version? (e.g. “y or n”):");
                                    error = true;
                                }
                            }
                        } while ((error));
                    }

                     /*
                        Condition for the jazz genre, provides a Instrumental Version.
                    */
                    case "jazz" -> {
                        System.out.println("Do you want to include the Instrumental Version? (e.g. “y or n”):");
                        do {
                            error = false;

                            String ans = input.next();
                            switch (ans) {
                                case "y" -> version[i] = instrumental.setInstrumental(true);
                                case "n" -> version[i] = instrumental.setInstrumental(false);
                                default -> {
                                    System.out.println("Invalid Input");
                                    System.out.println("Do you want to include the Acoustic Version? (e.g. “y or n”):");
                                    error = true;
                                }
                            }
                        } while ((error));
                    }
                }


            } while ((error));


             /*
                Prompt to add or remove the music
                and loop if the condition is false or has invalid input. Try and Catch
                block is included.
            */
            System.out.println("Do you want to add or remove this song in the playlist? " +
                    "(Type \"1\" to add or \"2\" to remove)");
            do {
                error = false;

                String yn = input.next();
                switch (yn) {
                    case "1" -> added[i] = x.setAdded(true);
                    case "2" -> added[i] = x.setAdded(false);
                    default -> {
                        System.out.println("Invalid Input");
                        System.out.println("Do you want to add or remove this song in the playlist? " +
                                "(Type \"1\" to add or \"2\" to remove)");
                        error = true;
                    }
                }


                 /*
                    Prompt to Play or not the music
                    and loop if the condition is false or has invalid input. Try and Catch
                    block is included.
                */

                if (yn.equals("1")) {
                    System.out.println("Do you want to play the music? (e.g. “y or n”):");
                    do {
                        error = false;

                        String ans = input.next();
                        switch (ans) {
                            case "y" -> playing[i] = x.setPlaying(true);
                            case "n" -> playing[i] = x.setPlaying(false);
                            default -> {
                                System.out.println("Invalid Input");
                                System.out.println("Do you want to play the music? (e.g. “y or n”):");
                                error = true;
                            }
                        }
                    } while ((error));

                }
            } while ((error));
        }
        //New Object
        Pop Music1 = new Pop(title[0], band[0], releaseDate[0], genre[0], added[0],
                playing[0], x.getDateCreated(),version[0]);
        Rock Music2 = new Rock(title[1], band[1], releaseDate[1], genre[1], added[1],
                playing[1], x.getDateCreated(),version[1]);
        Jazz Music3 = new Jazz(title[2], band[2], releaseDate[2], genre[2], added[2],
                playing[1], x.getDateCreated(),version[2]);
        //Array list
        ArrayList<Genre> list = new ArrayList<>();
        //add files into the array list
        list.add(Music1);
        list.add(Music2);
        list.add(Music3);

        //output for both java and the file
        FileWriter writer = new FileWriter("Music.txt");
        for (Genre s : list) {
            System.out.println(s.toString());
            writer.write(String.format("%s\n", s));
        }
        writer.close();
    }
}

