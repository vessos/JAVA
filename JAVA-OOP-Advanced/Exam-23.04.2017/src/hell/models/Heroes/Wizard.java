package hell.models.Heroes;

public class Wizard extends AbstractHeroes {

    private static final long STRENGTH = 25;
    private static final long AGILITY = 100;
    private static final long INTELLIGENCE = 15;
    private static final long HIT_POINTS = 150;
    private static final long DAMAGE = 300;


    public Wizard(String name) {
        super(name);
        super.setStrength(STRENGTH);
        super.setAgility(AGILITY);
        super.setIntelligence(INTELLIGENCE);
        super.setHitPoints(HIT_POINTS);
        super.setDamage(DAMAGE);
    }
}
