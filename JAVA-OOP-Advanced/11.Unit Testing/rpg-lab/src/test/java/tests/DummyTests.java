
package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Dummy;

public class DummyTests {

    private static final int DUMMY_HEALTH = 10;
    private static final int EXPERIENCE = 10;
    private static final int ATTACK_POINTS = 10;
    private Dummy dummy;

    @Before
    public void createDummy() {
        this.dummy = new Dummy(DUMMY_HEALTH, EXPERIENCE);
    }

    @Test
    public void testDummyHealthWhenAttacked() {
        this.dummy.takeAttack(ATTACK_POINTS);
        Assert.assertEquals("Wrong health", DUMMY_HEALTH - ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyWhenAttacked() {

        this.dummy.takeAttack(ATTACK_POINTS);
        this.dummy.takeAttack(ATTACK_POINTS);

    }

    @Test
    public void testDeadDummyGivesXPWhenKilled() {
        this.dummy.takeAttack(ATTACK_POINTS);
        Assert.assertEquals("Wrong experience",EXPERIENCE,this.dummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyNotGiveXP() {
        this.dummy.giveExperience();
    }
}
