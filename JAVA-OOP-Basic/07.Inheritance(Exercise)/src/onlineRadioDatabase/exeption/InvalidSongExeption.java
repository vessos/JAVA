package onlineRadioDatabase.exeption;


public class InvalidSongExeption extends IllegalArgumentException {

    private static final String DEFAULT_MESSAGE = "Invalid song";

    public InvalidSongExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidSongExeption(String message){
        super(message);
    }
}
