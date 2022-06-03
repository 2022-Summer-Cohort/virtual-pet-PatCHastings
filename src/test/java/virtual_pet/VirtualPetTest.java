package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    @Test
    public void shouldGetName() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 0, 0, 0, true);
        //Action
        underTest.petsName();
        //Assertion
        assertEquals("test", underTest.getPetName());
    }

    @Test
    public void shouldReduceHungry() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 0, 0, 0, true);
        //Action
        underTest.feed();
        //Assertion
        assertEquals(- 5, underTest.getHungerLvl());
        assertEquals(+3, underTest.getBoredomLvl());
    }

    @Test
    public void shouldReduceThirstyIncreaseBored() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 0, 0, 0, true);
        //Action
        underTest.water();
        //Assertion
        assertEquals(- 5, underTest.getThirstLvl());
        assertEquals(+3, underTest.getBoredomLvl());
    }

    @Test
    public void shouldReduceBoredomIncreaseHungryThirsty() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 0, 0, 0, true);
        //Action
        underTest.play();
        //Assertion
        assertEquals(- 5, underTest.getBoredomLvl());
        assertEquals(+4, underTest.getHungerLvl());
        assertEquals(+4, underTest.getThirstLvl());
    }

    @Test
    public void tickShouldIncreaseStats() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 0, 0, 0, true);
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

    //shelterPopulation
    @Test
    public void petIsAdmittedToVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet TestPet = new VirtualPet("test", 0,0,0,true);
        underTest.addPetToShelter(TestPet);
        assertEquals(4, underTest.shelterPopulation());
        assertTrue(underTest.getPetShelter().add(new VirtualPet("test", 0,0,0, true)));
    }


}


