package militaryElit;

public class Mission implements IMission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }
    @Override
    public String getState() {
        return this.state;
    }


    public void setState(String state) {
        if(state.equals("Finished")||state.equals("inProgress")){
            this.state = state;
        }else{
            this.state = "Invalid";
        }
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",this.getCodeName(),this.getState());
    }

    @Override
    public boolean isItMission(){
        if(this.getState().equals("Invalid")){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void completeMission() {
        this.setState("Finished");
    }


}
