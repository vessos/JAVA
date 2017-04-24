package onlineRadioDatabase.exeption;


public class InvalidSongSecondsExeption extends InvalidSongLenghtExeption {

    private static final String DEFAULT_MESSAGE = "Song seconds should be between 0 and 59.";

    public InvalidSongSecondsExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidSongSecondsExeption(String message){
        super(message);
    }
}
