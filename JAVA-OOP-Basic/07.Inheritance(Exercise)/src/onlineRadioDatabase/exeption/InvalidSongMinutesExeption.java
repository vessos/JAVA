package onlineRadioDatabase.exeption;


public class InvalidSongMinutesExeption extends InvalidSongLenghtExeption{

    private static final String DEFAULT_MESSAGE = "Song minutes should be between 0 and 14.";

    public InvalidSongMinutesExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidSongMinutesExeption(String message){
        super(message);
    }
}
