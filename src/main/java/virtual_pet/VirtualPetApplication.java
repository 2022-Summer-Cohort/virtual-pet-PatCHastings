package virtual_pet;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {
    private VirtualPetShelter petShelter;

    public VirtualPetApplication() {

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPetApplication newGame = new VirtualPetApplication();

        System.out.println("Welcome! Enter: " + 1 + " for VirtualPet's Souls. " + 2 + " to enter your VirtualPet's Shelter: Amok.");
        int gameChoice = input.nextInt();
        input.nextLine();
        if (gameChoice == 1) {
            newGame.gameLoop();
        } else if (gameChoice == 2) {
            newGame.gameLoopShelter();
        } else {
            newGame.gameLoop();
        }

        System.out.println("==YOU DIED==");
        System.out.println("___credits___");
        System.out.println(" Director & lead game designer: Patrick Hastings ");
        System.out.println("");
        System.out.println("(new game+: affirmative.)");

        System.out.println("Welcome! Enter: " + 1 + " for VirtualPet's Souls. " + 2 + " to enter your VirtualPet's Shelter.");
        int gameChoice2 = input.nextInt();
        input.nextLine();
        if (gameChoice2 == 1) {
            newGame.gameLoop();
        } else if (gameChoice2 == 2) {
            newGame.gameLoopShelter();
        } else {
            newGame.gameLoop();
        }
        newGame.gameLoop();

    }
    // VirtualPet's Souls gameLoop
    public void gameLoop() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to VirtualPet's Souls! Enter the name of your new pet:");
        String petName = input.nextLine();
        VirtualPet pet1 = new OrganicCat(petName, 0, 0, 0, true, 0, true);


        while (pet1.getIsAlive()) {
            System.out.println("What do you want to do with " + petName + "?" + " 1: feed  2: water  3: play  4: exit)");
            int prompt = input.nextInt();
            input.nextLine();

            if (prompt == 1) {
                pet1.feed();
                pet1.tick();
                pet1.status();
            } else if (prompt == 2) {
                pet1.water();
                pet1.status();
                pet1.tick();
            } else if (prompt == 3) {
                pet1.play();
                pet1.status();
                pet1.tick();
            } else if (prompt == 4) {
                break;

            }
            else {
                boolean isAlive = false;
            }
        }
    }
    // Virtual Pet Shelter/Amok GameLoop
    public void gameLoopShelter() {
        System.out.println("you are in the shelter");
        Scanner input = new Scanner(System.in);

    VirtualPetShelter petShelter = new VirtualPetShelter(); // constructor
        boolean quitGame = false;
        while (!quitGame) {

            System.out.println("what do you want to do?" +
                               "\n 1: Add a Pet to the Shelter    2: Feed all organic pets 3: Water all organic pets" +
                               "\n 4: Play with all Organic pets  5: Walk all dogs         6: maintenance on robotic pets" +
                               "\n 7: Oil robotic dogs            8: Clean cat litterboxes 9: clean dog cages" +
                               "\n10: Remove deceased pet        11: Adopt a pet");
            int prompt = input.nextInt();
            input.nextLine();

            if (prompt == 1) {
                System.out.println("enter the type of pet: 1: Organic Cat 2: Organic Dog 3: Robotic Cat 4: Robotic Dog");
                int typeChoice = input.nextInt();
                input.nextLine();
                if (typeChoice == 1) {
                    System.out.println("enter the organic cat's name:");
                    String typeName = input.nextLine();
                    VirtualPet petTypeAdded = new OrganicCat(typeName, 0, 0, 0, true, 0, true);
                    petShelter.addPetToShelter(petTypeAdded);
                }
                if (typeChoice == 2) {
                    System.out.println("enter the organic dog's name:");
                    String typeName = input.nextLine();
                    VirtualPet petTypeAdded = new OrganicDog(typeName, 0, 0, 0, true, 0, true);
                    petShelter.addPetToShelter(petTypeAdded);
                }
                if (typeChoice == 3) {
                    System.out.println("enter the robotic cat's name:");
                    String typeName = input.nextLine();
                    VirtualPet petTypeAdded = new RoboticCat(typeName, 0);
                    petShelter.addPetToShelter(petTypeAdded);
                }
                if (typeChoice == 4) {
                    System.out.println("enter the robotic dog's name:");
                    String typeName = input.nextLine();
                    VirtualPet petTypeAdded = new RoboticDog(typeName, 0, 0);
                    petShelter.addPetToShelter(petTypeAdded);
                }

            } else if (prompt == 2) {
                petShelter.feedAllOrganicPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 3) {
                petShelter.waterAllOrganicPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 4) {
                petShelter.playAllOrganicPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 5) {
                petShelter.walkAllOrganicDogs();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 6) {
                petShelter.maintenanceOnAllRoboticPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 7) {
                petShelter.oilAllRoboticPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 8) {
                petShelter.cleanAllOrganicatLitterboxes();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 9) {
                petShelter.cleanAllOrganicDogCages();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 10) {
                System.out.println("please type the name of the pet you need to bury:");
                String name = input.nextLine();
                petShelter.removePet(name);

            } else if (prompt == 11) {
                System.out.println("please type the name of the pet you wish to adopt:");
                String name = input.nextLine();
                petShelter.adoptPet(name);

            } else {
                quitGame = true;
            }
        }
    }
}


