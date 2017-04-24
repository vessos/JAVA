package onlineRadioDatabase.exeption;

/**
 * Created by MARK-Max on 10/03/2017.
 */
public class InvalidSongLenghtExeption extends InvalidSongExeption {

    private static final String DEFAULT_MESSAGE = "Invalid song length.";

    public InvalidSongLenghtExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidSongLenghtExeption(String message){
        super(message);
    }
}
