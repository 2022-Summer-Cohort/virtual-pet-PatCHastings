package virtual_pet;
import java.util.ArrayList;


public class VirtualPetShelter {


    //instance variables
    private ArrayList<VirtualPet> petShelter;

    //Constructor
    public VirtualPetShelter() {
        petShelter = new ArrayList<>();

        petShelter.add(new VirtualPet("Chrono", 0, 0, 0, true));
        petShelter.add(new VirtualPet("Frog", 0, 0, 0, true));
        petShelter.add(new VirtualPet("Robo", 0, 0, 0, true));



    }

    //getters
    public ArrayList<VirtualPet> getPetShelter() {
        return petShelter;
    }

    public String getAllNames() {
        for (VirtualPet allPets : petShelter) {
            return allPets.getPetName();
        }
        return "empty nest";
    }


    // methods: use for loops for feed-all, water-all, play-all
    // keep all the old methods, but call them for VirtualPetShelter mass-actions

    //add a pet
    public void addPetToShelter(VirtualPet addPets) {
        petShelter.add(addPets);
    }
    //shelter population
    public int shelterPopulation() {
        return (petShelter.size());
    }
    //feed
    public void feedPets() {
        for (VirtualPet allPets : petShelter) {
            allPets.feed();
        }
    }
    //water
    public void waterPets() {
        for (VirtualPet allPets : petShelter) {
            allPets.water();
        }
    }
    //play
    public void playPets() {
        for (VirtualPet allPets : petShelter) {
            allPets.play();
        }
    }
    //status
    public void showPetsStatus() {
        for (VirtualPet allPets : petShelter) {
            allPets.status();
        }
    }




}