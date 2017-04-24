package mood3;

public abstract class BaseCharacter implements Character {

    private String username;
    private String hashedPassword;
    private Integer level;

    protected BaseCharacter(String username, Integer level){
        this.username = username;
        this.level = level;
    }

    protected String getUsername() {
        return this.username;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    protected void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    protected Integer getLevel() {
        return this.level;
    }

    @Override
    public String toString() {

        return "BaseCharacter{}";
    }

    @Override
    public void generateHashPasword() {

    }

}
