package week12;

import java.io.Serializable;
import java.util.Date;

/*

This base class defines the common attributes inherited to the derived classes which includes the title of the song,
the name of the band/artist, recorded year, add or remove the song in the playlist, and play the music or not.
Also included in this class are the getter methods to return the specific variable value and the setter method to
update the value of the variable.

*/

public class Genre {
    
    // Description of the data fields
    String title; // The title of the song/music as a string
    String band;  // The name of the band or artist as a string
    int recorded; // The released date of the music as integer
    boolean added; // True - add the song, False - remove the song
    boolean playing; // True - play the song, False  - don't play the song
    java.util.Date dateCreated; // Date creation
    String type; // The genre of the song; pop, rock or jazz as a string

    public String type(String type) {
        this.type = type;
        return type;
    }

    // The set method to take the title of the song and assign it to title
    public Genre(String title, String band,
                 int recorded, boolean added, boolean playing,Date dateCreated) {
        this.title = title;
        this.band = band;
        this.recorded = recorded;
        this.added = added;
        this.playing = playing;
        this.dateCreated = dateCreated;
    }
    
    // The get method to return the title of the song [String]
    public String setTitle(String title) {
        this.title = title;
        return title;
    }
    
    // The get method to return the name of the band [String]
    public String getTitle() {
        return title;
    }

    // The get method to return the name of the band [String]
    public String getBand() {
        return band;
    }

    // The set method to take title of the song and assign it to band [String]
    public String setBand(String band) {
        this.band = band;
        return band;
    }

    // The get method to return the recorded year of the song [Integer]
    public int getRecorded() {
        return recorded;
    }

    // The set method to take the recorded year of the song and assign it to recorded [Integer]
    public int setRecorded(int recorded) {
        this.recorded = recorded;
        return recorded;
    }

    // To determine if the song will be added or removed [Serializable]
    public Serializable isAdded() {
        if (added){
            return "\n Music Successfully Added" ;

        } else {
            return "\n Music Successfully Removed";

        }
    }

    // The set method to take the boolean added and assign it to added
    public boolean setAdded(boolean added) {
        this.added = added;
        return added;
    }
    
    // To determine if the song will be played or not
    public boolean isPlaying() {
        return playing;
    }

    // The set method to take the boolean added and assign it to added
    public boolean setPlaying(boolean playing) {
        this.playing = playing;
        return playing;
    }

    // Set the creation date and time of the object
    public Genre() {
        dateCreated = new java.util.Date();
    }

    // The get method to return creation date and time of the object
    public Date getDateCreated() {
        return dateCreated;
    }

    // ToString method to add a string to the creation date.
    public String toString() {
        return
                "\n Modified: " + getDateCreated();
    }
    
    // Display the welcome message [Static]
    public static void welcome() {
        System.out.println("\nWelcome to your online music player!");
        System.out.println("Please enter the details of the three songs that you like add or remove in the playlist");
    }
}




