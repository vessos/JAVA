package hell.models.Items;

import hell.interfaces.Item;

public abstract class AbstractItems implements Item {

    private String name;
    private int strengthBonus;
    private int agilityBonus;
    private int intelligenceBonus;
    private int hitPointBonus;
    private int damageBonus;

    protected AbstractItems(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointBonus, int damageBonus) {
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.agilityBonus = agilityBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.hitPointBonus = hitPointBonus;
        this.damageBonus = damageBonus;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrengthBonus() {
        return this.strengthBonus;
    }

    @Override
    public int getAgilityBonus() {
        return this.agilityBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return this.intelligenceBonus;
    }

    @Override
    public int getHitPointsBonus() {
        return this.hitPointBonus;
    }

    @Override
    public int getDamageBonus() {
        return this.damageBonus;
    }
}
