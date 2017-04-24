package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTests {


    public static final int AXE_ATTACK = 10;
    public static final int AXE_DURABILITY = 10;
    public static final int DUMMY_HEALTH = 10;
    public static final int DUMMY_EXPERIENCE = 10;
    public static final int EXPECTED_DURABILITY = 9;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void initializeTestObject(){
        this.axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH,DUMMY_EXPERIENCE);
    }
    @Test
    public void axeDurabilityTest(){
        //act
        axe.attack(dummy);
        //assert
        Assert.assertEquals("Wrong durability",EXPECTED_DURABILITY,this.axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void brokenAxeAttackTest(){
        while(this.axe.getDurabilityPoints()>0){
            axe.attack(dummy);
        }
    }
}
