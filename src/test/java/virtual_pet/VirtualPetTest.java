package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {

    @Test
    public void shouldGetName() {
        //Assignment
        VirtualPet underTest;
        underTest = new VirtualPet("test", 0, 0, 0, true);
        //Action
        underTest.petsName();
        //Assertion
        assertEquals("test", underTest.getPetName());
    }

    @Test
    public void shouldReduceHungry() {
        //Assignment
        VirtualPet underTest = new VirtualPet("test", 10, 10, 10, true);
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
        VirtualPet underTest = new VirtualPet("test", 10, 10, 10, true);
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
        VirtualPet underTest = new VirtualPet("test", 10, 10, 10, true);
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
        underTest.addPetToShelter("test");
        assertEquals(1, underTest.shelterPopulation());
        assertTrue(underTest.getPetShelter().add(new VirtualPet("test", 0,0,0, true)));
    }

    @Test
    public void allFeed() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addPetToShelter("test");
        underTest.feedPets();
        assertEquals(0, underTest.getPetShelter().get(0).getHungerLvl());

    }

    @Test
    public void allWater() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addPetToShelter("test");
        underTest.waterPets();
        assertEquals(0, underTest.getPetShelter().get(0).getThirstLvl());

    }

    @Test
    public void allPlay() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addPetToShelter("test");
        underTest.playPets();
        assertEquals(0, underTest.getPetShelter().get(0).getBoredomLvl());

    }
}


