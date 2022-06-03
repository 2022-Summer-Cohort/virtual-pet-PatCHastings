package virtual_pet;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        //VirtualPetShelter
        Scanner input= new Scanner(System.in);


        // create method to create virtual pet to add to shelter
        VirtualPetShelter allIn = new VirtualPetShelter();

        System.out.println("add a pet to your shelter");
        String name =input.nextLine();
        System.out.println(allIn.getAllNames());


        //Interact with a VirtualPet object in this method
    VirtualPetApplication newGame = new VirtualPetApplication();
    // Call gameLoop method
        newGame.gameLoop();

        System.out.println("==YOU DIED==");
        System.out.println("___credits___");
        System.out.println(" Director & lead game designer: Patrick Hastings ");
        System.out.println("");
        System.out.println("(new game+: affirmative.)");
        newGame.gameLoop();


    }


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

}


