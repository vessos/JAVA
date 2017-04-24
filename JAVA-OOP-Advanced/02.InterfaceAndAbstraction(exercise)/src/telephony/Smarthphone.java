package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smarthphone implements Call,Browse {

    @Override
    public String callToOtherPhones(String number) {
        String pattern = "(\\d*[A-Za-z]+\\d*)";
        if(number.matches(pattern)){
            throw new IllegalArgumentException("Invalid number!");
        }

        return "Calling... "+ number;
    }

    @Override
    public String browseInTheWWW(String site) {
        String pattern = "^[A-Za-z:\\/\\.]*\\d+[A-Za-z:\\/\\.]*$";
        if(site.matches(pattern)){
            throw new IllegalArgumentException("Invalid URL!");
        }
        return "Browsing: "+ site+"!";
    }
}
