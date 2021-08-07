package week12;

import java.io.Serializable;
import java.util.Date;

/* 

The class Jazz inherits the common attributes from the Genre class. Inside this class is a unique attribute
which allows the user to add the instrumental version of the jazz song. We also include the superclass constructor
to match the arguments of the Jazz object. There's also a toString method to return the string format of the Jazz object.

*/

class Jazz extends Genre{
    String jazz;
    boolean instrumental; // The unique attribute of this derived class

    // The method to format the version of the jazz song [Serializable]
    public Serializable isInstrumental() {

        if (instrumental){
            return "Instrumental";
        } else {
            return "Non Instrumental";
        }
    }


    // Set the boolean instrumental [boolean]
    public boolean setInstrumental(boolean instrumental) {
        this.instrumental = instrumental;
        return instrumental;
    }


    @Override
    public String type(String type) {
        super.type(jazz);
        return type;
    }


    // The no-arg constructor
    public Jazz() {

    }

    // The method to invoke the superclass constructor that matches the arguments for the Jazz object
    public Jazz(String title, String band,
                int recorded, String type, boolean added, boolean playing, Date dateCreated, boolean instrumental) {
        super(title, band, recorded, added, playing , dateCreated);
        this.jazz = type;
        this.instrumental = instrumental;
    }
    
    // Return the string representation of Jazz object
    @Override
    public String toString() {
        return
                isAdded() +
                        "\n Title: " + getTitle() +
                        "\n Band: " + getBand() +
                        "\n Recorded: " + getRecorded() +
                        "\n Genre: " + super.type(jazz) +
                        "\n Version: "+ isInstrumental() +
                        "\n Playing: " + isPlaying() +
                        "\n Modified: " + getDateCreated() +
                        "\n Goodbye...";
    }
}