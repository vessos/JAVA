package p01_system_resources;

import java.time.LocalTime;

public class LocalTimeProvaider implements TimeProvider {


    @Override
    public int getHour() {

        return LocalTime.now().getHour();
    }
}