package hell.models.Items;

public class CommonItem extends AbstractItems {

    public CommonItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointBonus, int damageBonus) {
        super(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointBonus, damageBonus);
    }

    @Override
    public String toString() {
        return String.format("Added item - %s",super.getName());
    }
}
