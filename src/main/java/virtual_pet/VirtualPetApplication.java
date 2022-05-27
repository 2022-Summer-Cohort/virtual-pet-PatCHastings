package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

    VirtualPetApplication newGame = new VirtualPetApplication();
    // Call gameLoop method
        newGame.gameLoop();

        System.out.println("exited the loop");


    }


    public void gameLoop() {

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean isAlive = true;

        System.out.println("Welcome to Virtual Pet Andventure! Enter the name of your new pet:");
        String petName = input.nextLine();
        VirtualPet pet1 = new VirtualPet(petName, 0, 0, 0, true);

        while (isAlive == true) {
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
                isAlive = false;
            }

        }

    }
}


