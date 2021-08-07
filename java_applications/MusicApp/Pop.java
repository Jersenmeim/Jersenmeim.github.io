package week12;

import java.io.Serializable;
import java.util.Date;

/* 

The class Pop inherits the common attributes from the Genre class. Inside this class is a unique attribute
which allows the user to add the mashup version of the pop song. We also include the superclass constructor
to match the arguments of the Pop object. There's also a toString method to return the string format of the Pop object.

*/

class Pop extends Genre{
    String pop;
    boolean mashup; // The unique attribute of this derived class

    // The method to format the version of the pop song [Serializable]
    public Serializable isMashup() {

        if (mashup){
            return "Mashup";
        } else{
            return "Non Mashup";
        }
    }

    // Set the boolean mashup [boolean]
    public boolean setMashup(boolean mashup) {
        this.mashup = mashup;
        return mashup;
    }


    // The no-arg constructor
    public Pop() {

    }


    @Override
    public String type(String type) {
        super.type(pop);
        return "pop" + isMashup();

    }


    // The method to invoke the superclass constructor that matches the arguments for the Pop object
    public Pop(String title, String band,
               int recorded, String type, boolean added, boolean playing, Date dateCreated, boolean mashup) {
        super(title, band, recorded, added, playing, dateCreated);
        this.pop = type;
        this.mashup = mashup;

    }

    // Return the string representation of Pop object
    @Override
    public String toString() {

        return
                isAdded() +
                        "\n Title: " + getTitle() +
                        "\n Band: " + getBand() +
                        "\n Recorded: " + getRecorded() +
                        "\n Genre: " + super.type(pop) +
                        "\n Version: " + isMashup() +
                        "\n Playing: " + isPlaying() +
                        "\n Modified: " + getDateCreated();
    }


}
