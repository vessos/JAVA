package tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class HeroTests {


    public static final int WEAPON_ATTACK = 10;
    public static final int WEAPON_DURABILITY = 10;
    public static final int EXPERIENCE = 10;

    @Test
    public void heroGainsXPFromDeadTarget(){
        Weapon weaponMock = Mockito.mock(Weapon.class);

        Hero hero = new Hero("Hero",weaponMock);

        Target targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(EXPERIENCE);


        hero.attack(targetMock);

        Assert.assertEquals(EXPERIENCE,hero.getExperience());
    }
}
