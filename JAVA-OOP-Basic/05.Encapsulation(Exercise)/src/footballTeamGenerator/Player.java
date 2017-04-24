package footballTeamGenerator;


public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int drible;
    private int passing;
    private int shooting;
    private double average;


    public Player(String name ,int endurance,int sprint,int drible,int passing,int shooting){
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDrible(drible);
        this.setPassing(passing);
        this.setShooting(shooting);
        this.calculateAverage();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private int getEndurance() {
        return this.endurance;
    }

    private void setEndurance(int endurance) {
        if(endurance<0||endurance>100){
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this.endurance = endurance;
    }

    private int getSprint() {
        return this.sprint;
    }

    private void setSprint(int sprint) {
        if(sprint<0||sprint>100){
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
        this.sprint = sprint;
    }

    private int getDrible() {
        return this.drible;
    }

    private void setDrible(int drible) {
        if(drible<0||drible>100){
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
        this.drible = drible;
    }

    private int getPassing() {
        return this.passing;
    }

    private void setPassing(int passing) {
        if(passing<0||passing>100){
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
        this.passing = passing;
    }

    private int getShooting() {
        return this.shooting;
    }

    private void setShooting(int shooting) {
        if(shooting<0||shooting>100){
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
        this.shooting = shooting;
    }

    private void calculateAverage() {
        this.average = (this.getDrible()+this.getShooting()+this.getPassing()
                +this.getEndurance()+this.getSprint())/5.0;
    }

    protected double getAverage() {
        return this.average;
    }
}
