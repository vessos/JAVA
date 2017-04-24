package rpg_lab;

public interface Target {
    int getHealth();

    void takeAttack(int attackPoints);

    int giveExperience();

    Weapon giveWeapon(RandomProvider random);

    boolean isDead();
}
