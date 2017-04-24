package hell.models.Heroes;


public class Barbarian extends AbstractHeroes {

    private static final long STRENGTH = 90;
    private static final long AGILITY = 25;
    private static final long INTELLIGENCE = 10;
    private static final long HIT_POINTS = 350;
    private static final long DAMAGE = 150;


    public Barbarian(String name) {
        super(name);
        super.setStrength(STRENGTH);
        super.setAgility(AGILITY);
        super.setIntelligence(INTELLIGENCE);
        super.setHitPoints(HIT_POINTS);
        super.setDamage(DAMAGE);
    }
}
