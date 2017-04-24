package onlineRadioDatabase.exeption;

/**
 * Created by MARK-Max on 10/03/2017.
 */
public class InvalidArtistNameExeption extends InvalidSongExeption {

    private static final String DEFAULT_MESSAGE = "Artist name should be between 3 and 20 symbols.";

    public InvalidArtistNameExeption(){
        super(DEFAULT_MESSAGE);
    }

    public InvalidArtistNameExeption(String message){
        super(message);
    }
}
