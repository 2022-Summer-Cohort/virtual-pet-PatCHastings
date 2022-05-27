package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldGetName() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Charizard", 0, 0, 0, true);
        //Action
        underTest.petsName();
        //Assertion
        assertEquals("Charizard", underTest.getPetName());
    }

    @Test
    public void shouldReduceHungryBy20() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Charizard", 0, 0, 0, true);
        //Action
        underTest.feed();
        //Assertion
        assertEquals(- 5, underTest.getHungerLvl());
        assertEquals(+1, underTest.getBoredomLvl());
    }

    @Test
    public void shouldReduceThirstyBy20IncreaseBored2() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Charizard", 0, 0, 0, true);
        //Action
        underTest.water();
        //Assertion
        assertEquals(- 5, underTest.getThirstLvl());
        assertEquals(+1, underTest.getBoredomLvl());
    }

    @Test
    public void shouldReduceBoredomBy20IncreaseHungry5Thirsty5() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Charizard", 0, 0, 0, true);
        //Action
        underTest.play();
        //Assertion
        assertEquals(- 5, underTest.getBoredomLvl());
        assertEquals(+3, underTest.getHungerLvl());
        assertEquals(+3, underTest.getThirstLvl());
    }

    @Test
    public void tickShouldIncreaseStatsBy2AndPrintStatus() {
        //Assignment
        VirtualPet underTest = new VirtualPet("Charizard", 0, 0, 0, true);
        //Action
        underTest.tick();
        //Assertion
        assertEquals(+2, underTest.getHungerLvl());
        assertEquals(+2, underTest.getThirstLvl());
        assertEquals(+2, underTest.getBoredomLvl());

    }

}


