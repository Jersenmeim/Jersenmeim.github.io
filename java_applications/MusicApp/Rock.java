package week12;

import java.io.Serializable;
import java.util.Date;

/* 

The class Rock inherits the common attributes from the Genre class. Inside this class is a unique attribute
which allows the user to add the acoustic version of the rock song. We also include the superclass constructor
to match the arguments of the Rock object. There's also a toString method to return the string format of the Rock object.

*/

class Rock extends Genre{
    String rock;
    boolean acoustic; // The unique attribute of this derived class

    // The method to format the version of the rock song [Serializable]
    public Serializable isAcoustic() {

        if (acoustic){
            return "Acoustic";
        } else{
            return "Non Acoustic";
        }

    }


    // Set the boolean acoustic [boolean]
    public boolean setAcoustic(boolean acoustic) {
        this.acoustic = acoustic;
        return acoustic;
    }

    @Override
    public String type(String type) {
        super.type(rock);
        return "rock";
    }

    // The no-arg constructor
    public Rock() {

    }

    // The method to invoke the superclass constructor that matches the arguments for the Rock object
    public Rock(String title, String band,
                int recorded, String type, boolean added, boolean playing, Date dateCreated, boolean acoustic) {
        super(title, band, recorded, added, playing , dateCreated);
        this.rock = type;
        this.acoustic = acoustic;
    }
    
    // Return the string representation of Rock object
    @Override
    public String toString() {

        return      isAdded() +
                "\n Title: " + getTitle() +
                "\n Band: " + getBand() +
                "\n Recorded: " + getRecorded() +
                "\n Genre: " + super.type(rock) +
                "\n Version: " + isAcoustic() +
                "\n Playing: " + isPlaying() +
                "\n Modified: " + getDateCreated();
    }
}