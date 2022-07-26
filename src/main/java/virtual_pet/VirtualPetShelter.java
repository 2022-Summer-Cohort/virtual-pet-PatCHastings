package virtual_pet;
import java.util.ArrayList;


public class VirtualPetShelter {

    ArrayList<VirtualPet> shelterList = new ArrayList<>();

    public VirtualPetShelter() {

    }

    public ArrayList<VirtualPet> getPetShelter() {
        return shelterList;
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
            if (arrayPet.petType.equals("organicat") || arrayPet.petType.equals("organidog")) {
                arrayPet.feedOrganicPet();
            }
        }
    }
    public void waterAllOrganicPets() {
            for (VirtualPet arrayPet : shelterList) {
                if (arrayPet.petType.equals("organicat") || arrayPet.petType.equals("organidog")) {
                    arrayPet.waterOrganicPet();
                }
            }
        }
    public void playAllOrganicPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organicat") || arrayPet.petType.equals("organidog")) {
                arrayPet.playOrganicPet();
            }
        }
    }
    public void walkAllOrganicDogs() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("robodog")) {
                arrayPet.maintenanceGoesUp();
            }
            if (arrayPet.petType.equals("organidog")) {
                arrayPet.boredomLvlGoesDown();
                arrayPet.cageDirtinessGoesDown();
            }
        }
    }
    public void maintenanceOnAllRoboticPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("robocat") || arrayPet.petType.equals("robodog")) {
                arrayPet.maintenanceOnRobot();
            }
        }
    }
    public void cleanAllOrganicDogCages() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organidog")) {
                arrayPet.cleanAllCages();
            }
        }
    }
    public void cleanAllOrganicatLitterboxes() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("organicat")) {
                arrayPet.cleanAllLitterboxes();
            }
        }
    }
    public void oilAllRoboticPets() {
        for (VirtualPet arrayPet : shelterList) {
            if (arrayPet.petType.equals("robocat") || arrayPet.petType.equals("robodog")) {
                arrayPet.oilRoboticPets();
            }
        }
    }

    public void waterPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.water();
        }
    }

    public void playPets() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.play();
        }
    }

    public void showPetsStatus() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.status();
        }
    }

    public void tickAll() {
        for (VirtualPet arrayPet : shelterList) {
            arrayPet.tick();
        }
    }
}