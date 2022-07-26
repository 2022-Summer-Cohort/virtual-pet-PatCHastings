package virtual_pet;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    //Virtual Pet Amok: 3 working tests
    @Test
    public void shouldReduceAllRefuseLvlsToZero() {
        //assignment
        OrganicCat underTest = new OrganicCat("test", 0, 0, 0, true, 5, true);
        //action
        underTest.cleanAllCages();
        //Assertion
        assertEquals(0, underTest.getRefuseLvl());

    }

    @Test
    public void shouldReduceAllmaintenanceLvlsToZero() {
        //assignment
        RoboticCat underTest = new RoboticCat("test", 5);
        //action
        underTest.maintenanceOnRobot();
        //Assertion
        assertEquals(0, underTest.getMaintenanceLvl());

    }

    @Test
    public void shouldIncreaseAllmaintenanceLvlsByOne() {
        //assignment
        RoboticCat underTest = new RoboticCat("test", 0);
        //action
        underTest.maintenanceGoesUp();
        //Assertion
        assertEquals(1, underTest.getMaintenanceLvl());

    }


    @Test
    public void shouldGetName() {
        //Assignment
        OrganicCat underTest;
        underTest = new OrganicCat("test", 10, 10, 10, true, 0, true);
        //Action
        underTest.petsName();
        //Assertion
        assertEquals("test", underTest.getPetName());
    }

    @Test
    public void shouldReduceHungry() {
        //Assignment
        OrganicCat underTest = new OrganicCat("test", 10, 10, 10, true, 0, true);
        int initial = underTest.getHungerLvl();
        //Action
        underTest.feed();
        //Assertion
        int testLvl = underTest.getHungerLvl();
        assertTrue(initial > testLvl);
        assertEquals(5, underTest.getHungerLvl());
        assertEquals(13, underTest.getBoredomLvl());
    }


    @Test
    public void shouldReduceThirstyIncreaseBored() {
        //Assignment
        OrganicCat underTest = new OrganicCat("test", 10, 10, 10, true, 0, true);
        int initial = underTest.getThirstLvl();
        //Action
        underTest.water();
        //Assertion
        int testLvl = underTest.getThirstLvl();
        assertTrue(initial > testLvl);
        assertEquals(5, underTest.getThirstLvl());
        assertEquals(13, underTest.getBoredomLvl());
    }

    @Test
    public void shouldReduceBoredomIncreaseHungryThirsty() {
        //Assignment
        OrganicCat underTest = new OrganicCat("test", 10, 10, 10, true, 0, true);

        int initial = underTest.getBoredomLvl();
        //Action
        underTest.play();
        //Assertion
        int testLvl = underTest.getBoredomLvl();
        assertTrue(initial > testLvl);
        assertEquals(5, underTest.getBoredomLvl());
        assertEquals(14, underTest.getHungerLvl());
        assertEquals(14, underTest.getThirstLvl());
    }

    @Test
    public void tickShouldIncreaseStats() {
        //Assignment
        OrganicCat underTest = new OrganicCat("test", 0, 0, 0, true, 0, true);
        //Action
        underTest.tick();
        //Assertion
        assertEquals(+2, underTest.getHungerLvl());
        assertEquals(+2, underTest.getThirstLvl());
        assertEquals(+2, underTest.getBoredomLvl());

    }

    // *** VirtualPetShelter tests ***
    @Test
    public void shouldGetpetShelter() {
        //Assignment
        VirtualPetShelter underTest = new VirtualPetShelter();
        //Action
        underTest.getPetShelter();
        VirtualPetShelter petShelter = new VirtualPetShelter();
    }

}