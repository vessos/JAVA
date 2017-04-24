package onlineRadioDatabase.exeption;


public class InvalidSongNameExeption extends InvalidSongExeption{

    private static final String DEFAULT_MESSAGE = "Song name should be between 3 and 30 symbols.";

    public InvalidSongNameExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidSongNameExeption(String message){
        super(message);
    }
}
