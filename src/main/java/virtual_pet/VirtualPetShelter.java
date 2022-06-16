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
        for (VirtualPet arrayPet : shelterList) {
            return arrayPet.getPetName();
        }
        return "empty nest";
    }


    // methods: use for loops for feed-all, water-all, play-all
    // keep all the old methods, but call them for VirtualPetShelter mass-actions

    // Add a pet
    public void addPetToShelter(VirtualPet petToAdd) {

        shelterList.add(petToAdd);

        }

    // Remove a pet
    public void removePet(String remove) {
        for (VirtualPet arrayPet : shelterList) {
            String name = arrayPet.getPetName();
            if (name.equalsIgnoreCase(remove)) {
                System.out.println("You successfully buried your pet. RIP..");
                shelterList.remove(arrayPet);
                break;
            } else {
                System.out.println("Pet not found.");
            }
        }
    }
    // Adopt a pet
    public void adoptPet(String adopt) {
        for (VirtualPet arrayPet : shelterList) {
            String name = arrayPet.getPetName();
            if (name.equalsIgnoreCase(adopt)) {
                System.out.println("Your new pet is happy you adopted it!");
                shelterList.remove(arrayPet);
                break;
            } else {
                System.out.println("Pet not found.");
            }
        }
    }
    //shelter population
    public int shelterPopulation() {
        return (shelterList.size());
    }

    //feed
    public void feedPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.feed();
        }
    }
    //feed all organic pets
    public void feedAllOrganPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet instanceof OrganicPet) {
                ((OrganicPet)arrayPet).feedOrganicPet();
            }
        }
    }
    //water
    public void waterPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.water();
        }
    }
    //play
    public void playPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.play();
        }
    }
    //status
    public void showPetsStatus() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.status();
        }
    }
    //Tick
    public void tickAll() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.tick();
        }
    }



}