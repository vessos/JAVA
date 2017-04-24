package hell.models.Heroes;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;


import java.lang.reflect.Field;
import java.util.*;


public abstract class AbstractHeroes implements Hero {

    private String name;
    private long strength;
    private long agility;
    private long intelligence;
    private long hitPoints;
    private long damage;
    private Inventory items;

    protected AbstractHeroes(String name) {
        this.setName(name);
        this.items = new HeroInventory() {
        };

    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setStrength(long strength) {
        this.strength = strength;
    }

    protected void setAgility(long agility) {
        this.agility = agility;
    }

    protected void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }

    protected void setHitPoints(long hitPoints) {
        this.hitPoints = hitPoints;
    }

    protected void setDamage(long damage) {
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength;
    }

    @Override
    public long getAgility() {
        return this.agility;
    }

    @Override
    public long getIntelligence() {
        return this.intelligence;
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public long getDamage() {
        return this.damage;
    }

    @Override
    public Collection<Item> getItems() throws IllegalAccessException, NoSuchFieldException {
        Class item = HeroInventory.class;
        Field field = item.getDeclaredField("commonItems");
        field.setAccessible(true);
        this.setAgility(this.items.getTotalAgilityBonus()+this.getAgility());
        this.setHitPoints(this.items.getTotalHitPointsBonus()+this.getHitPoints());
        this.setDamage(this.items.getTotalDamageBonus()+this.getDamage());
        this.setIntelligence(this.items.getTotalIntelligenceBonus()+this.getIntelligence());
        this.setStrength(this.items.getTotalStrengthBonus()+this.getStrength());
        Map<String,Item>map = (HashMap<String, Item>) field.get(this.items);
        List<Item> itemm = new ArrayList<>();
        for (String s : map.keySet()) {
            itemm.add(map.get(s));
        }

        return  itemm;
    }

    @Override
    public void addItem(Item item) {
        this.items.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
        this.items.addRecipeItem(recipe);
    }

    @Override
    public String toString() {
        return "AbstractHeroes{}";
    }
}
