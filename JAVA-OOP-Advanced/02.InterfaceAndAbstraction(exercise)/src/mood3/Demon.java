package mood3;

public class Demon extends BaseCharacter {

    private Double energy;

    public Demon(String username, Integer level,Double energy) {
        super(username, level);
        this.energy = energy;
    }

    @Override
    public String toString() {
        double point = this.energy*super.getLevel();
        String str = String.format("\"%s\" | \"%s\" -> Demon\n%.1f",super.getUsername()
                ,super.getHashedPassword(),point);
        return str;

    }

    @Override
    public void generateHashPasword() {
      int usernameLength =  super.getUsername().length();
      int result = 217*(usernameLength);
      super.setHashedPassword(String.valueOf(result));
    }
}
