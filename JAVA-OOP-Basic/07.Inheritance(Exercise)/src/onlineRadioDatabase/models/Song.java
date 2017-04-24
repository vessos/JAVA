package onlineRadioDatabase.models;


import onlineRadioDatabase.exeption.*;

public class Song {

    private String artistName;
    private String songName;
    private int minutes;
    private int seconds;

    public Song(String artistName,String songName,String duration){

        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setDuration(duration);
    }

    public int getMinutes() {
        return this.minutes;
    }

    private void setMinutes(int minutes) {
        if(minutes<0 || minutes>14){
            throw new InvalidSongMinutesExeption();
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    private void setSeconds(int seconds) {
        if(seconds<0 || seconds>59){
            throw new InvalidSongSecondsExeption();
        }
        this.seconds = seconds;
    }

    private void setArtistName(String artistName) {
        if(artistName==null|| artistName.length()<3 || artistName.length()>20){
            throw new InvalidArtistNameExeption();
        }
        this.artistName = artistName;
    }

    private void setSongName(String songName) {
        if(songName==null || songName.length()<3 || songName.length()>30){
            throw new InvalidSongNameExeption();
        }
        this.songName = songName;
    }

    private void setDuration(String duration){
        String[] durationParams = duration.split(":");
        int minutes;
        int seconds;
        try{
            minutes = Integer.parseInt(durationParams[0]);
            seconds = Integer.parseInt(durationParams[1]);
        }catch(NumberFormatException nfe){
            throw new InvalidSongLenghtExeption();
        }

        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }




}