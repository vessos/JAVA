package mood3;

public class Archangel extends BaseCharacter {

    private Integer mana;

    public Archangel(String username, Integer level, Integer mana) {
        super(username, level);
        this.mana = mana;
    }

    @Override
    public String toString() {
        int point = this.mana*super.getLevel();
        String str = String.format("\"%s\" | \"%s\" -> Archangel\n%d",super.getUsername()
        ,super.getHashedPassword(),point);
        return str;
    }

    @Override
    public void generateHashPasword() {
        String name = super.getUsername();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        String output = sb.reverse().toString();
        int namesLength = (name.length())*21;
        String hashPasw = output+String.valueOf(namesLength);
        super.setHashedPassword(hashPasw);
    }


}