package hell.models.Items;

import hell.interfaces.Recipe;

import java.util.ArrayList;
import java.util.List;


public class RecipeItem extends AbstractItems implements Recipe {

    private List<String> requiredItems;

    public RecipeItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointBonus, int damageBonus) {
        super(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointBonus, damageBonus);
        this.requiredItems = new ArrayList<>();
    }

    @Override
    public List<String> getRequiredItems()
    {
        return this.requiredItems;
    }

    public void addRequiredItem(String string){
        this.requiredItems.add(string);
    }

    @Override
    public String toString() {
        return String.format("Added recipe - %s",super.getName());
    }
}
