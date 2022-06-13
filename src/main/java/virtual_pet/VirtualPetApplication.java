package virtual_pet;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {
    private VirtualPetShelter petShelter; //instantiated class

    public VirtualPetApplication() {
        this.petShelter = petShelter;
    }
    public static void main(String[] args) {

        //VirtualPetShelter
        Scanner input= new Scanner(System.in);

        // create method to create virtual pet to add to shelter
        //VirtualPetShelter allIn = new VirtualPetShelter();

        //Interact with a VirtualPet object in this method
        VirtualPetApplication newGame = new VirtualPetApplication();
        // Call gameLoop method

        System.out.println("Welcome! Enter: " + 1 + " for VirtualPet's Souls. " + 2 + " to enter your VirtualPet's Shelter.");
        int gameChoice = input.nextInt();
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
        if (gameChoice2 == 1) {
            newGame.gameLoop();
        } else if (gameChoice2 == 2) {
            newGame.gameLoopShelter();
        } else {
            newGame.gameLoop();
        }
        newGame.gameLoop();

    }
    // PET SHELTER GAMELOOP

    public void gameLoop() {

        Scanner input = new Scanner(System.in);

        //boolean isAlive = true;
        System.out.println("Welcome to VirtualPet's Souls! Enter the name of your new pet:");
        String petName = input.nextLine();
        VirtualPet pet1 = new VirtualPet(petName, 0, 0, 0, true);


        while (pet1.getIsAlive() == true) {
            System.out.println("What do you want to do with " + petName + "?" + " (type: feed | water | play)");
            String prompt = input.nextLine();

            if (prompt.equalsIgnoreCase("feed")) {
                pet1.feed();
                pet1.tick();
                pet1.status();
            } else if (prompt.equalsIgnoreCase("water")) {
                pet1.water();
                pet1.status();
                pet1.tick();
            } else if (prompt.equalsIgnoreCase("play")) {
                pet1.play();
                pet1.status();
                pet1.tick();
            }  // maybe create another else if status reaches certain levels to
            else {
                boolean isAlive = false;
            }

        }

    }
    // VIRTUAL PET SHELTER GAMELOOP

    public void gameLoopShelter() {
        System.out.println("you are in the shelter");

        Scanner input = new Scanner(System.in);


    VirtualPetShelter petShelter = new VirtualPetShelter(); // constructor
        boolean quitGame = false;
        while (!quitGame) {
            System.out.println("what do you want to do? 1: Add a Pet to the Shelter 2: Feed all pets 3: Water all pets 4: Play with all pets");
            int prompt = input.nextInt();
            input.nextLine();

            if (prompt == 1) {
                System.out.println("enter the new pet's name:");
                String name =input.nextLine();
                petShelter.addPetToShelter(name);
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 2) {
                petShelter.feedPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 3) {
                petShelter.waterPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else if (prompt == 4) {
                petShelter.playPets();
                petShelter.showPetsStatus();
                petShelter.shelterPopulation();
                petShelter.tickAll();

            } else {
                quitGame = true;
            }


        }


    }

}


