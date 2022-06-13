package virtual_pet;
import java.util.ArrayList;


public class VirtualPetShelter {


    //instance variables
    ArrayList<VirtualPet> shelterList = new ArrayList<>();


    //Constructor
    public VirtualPetShelter() {





    }

    //getters
    public ArrayList<VirtualPet> getPetShelter() {
        return shelterList;
    }

    public String getAllNames() {
        for (VirtualPet allPets : shelterList) {
            return allPets.getPetName();
        }
        return "empty nest";
    }


    // methods: use for loops for feed-all, water-all, play-all
    // keep all the old methods, but call them for VirtualPetShelter mass-actions

    //add a pet
    public void addPetToShelter(String name) {
        shelterList.add(new VirtualPet(name, 0, 0, 0, true));
    }
    //remove a pet
    public void adoptAPet () {
        shelterList.remove(getAllNames()); // fix this
    }
    //shelter population
    public int shelterPopulation() {
        return (shelterList.size());
    }
    // find by name
//    public findPetName(String name) {

    //feed
    public void feedPets() {
        for (VirtualPet allPets : shelterList) {
            allPets.feed();
        }
    }
    //water
    public void waterPets() {
        for (VirtualPet allPets : shelterList) {
            allPets.water();
        }
    }
    //play
    public void playPets() {
        for (VirtualPet allPets : shelterList) {
            allPets.play();
        }
    }
    //status
    public void showPetsStatus() {
        for (VirtualPet allPets : shelterList) {
            allPets.status();
        }
    }

    //Tick
    public void tickAll() {
        for (VirtualPet allPets : shelterList) {
            allPets.tick();
        }
    }



}