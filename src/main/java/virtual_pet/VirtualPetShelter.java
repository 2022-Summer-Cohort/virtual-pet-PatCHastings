package virtual_pet;
import java.util.ArrayList;


public class VirtualPetShelter {

    ArrayList<VirtualPet> shelterList = new ArrayList<>();

    public VirtualPetShelter() {

    }

    public ArrayList<VirtualPet> getPetShelter() {
        return shelterList;
    }

    public String getAllNames() {
        for (VirtualPet arrayPet : shelterList) {
            return arrayPet.getPetName();
        }
        return "empty nest";
    }

    public void addPetToShelter(VirtualPet petToAdd) {
        shelterList.add(petToAdd);
        }

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

    public int shelterPopulation() {
        return (shelterList.size());
    }

    public void feedPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.feed();
        }
    }
    //amok methods
    public void feedAllOrganicPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organic")) {
                arrayPet.feedOrganicPet();
            }
        }
    }
    public void waterAllOrganicPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organic")) {
                arrayPet.waterOrganicPet();
            }
        }
    }
    public void playAllOrganicPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organic")) {
                arrayPet.playOrganicPet();
            }
        }
    }
    public void walkAllPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("robot")) {
                arrayPet.maintenanceGoesUp();
            }
        }
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organic")) {
                arrayPet.refuseGoesDown();
            }
        }
    }
    public void maintenanceOnAllRoboticPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("robot")) {
                arrayPet.maintenanceOnRobot();
            }
        }
    }
    public void cleanAllOrganicPetCages() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organic")) {
                arrayPet.cleanAllCages();
            }
        }
    }


    //petShelter methods
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