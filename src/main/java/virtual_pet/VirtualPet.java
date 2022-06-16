package virtual_pet;

public abstract class VirtualPet {

    protected String petName;

    protected String petType;
    protected int hungerLvl;
    protected int thirstLvl;
    protected int boredomLvl;
    protected boolean isAlive;
    protected int maintenanceLvl;

    //constructor
    public VirtualPet(String name, String type) {
    this.petName = name;
    this.petType = type;

    }

    //getter methods
    public String getPetName() {
        return petName;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public int getThirstLvl() {
        return thirstLvl;
    }

    public int getBoredomLvl() {
        return boredomLvl;
    }
    public boolean getIsAlive() {
        return isAlive;
    }



    //METHODS
    public void petsName() {
        System.out.println(petName);
    }

    public void feed() {
        hungerLvl = hungerLvl - 5;
        boredomLvl = boredomLvl +3;
        if (hungerLvl < 0) {
            hungerLvl = 0;
        }
    }
    public void water() {
        thirstLvl = thirstLvl - 5;
        boredomLvl = boredomLvl +3;
        if (thirstLvl < 0) {
            this.thirstLvl = 0;
        }
    }
    public void play() {
        boredomLvl = boredomLvl - 5;
        hungerLvl = hungerLvl +4;
        thirstLvl = thirstLvl +4;
        if (boredomLvl < 0) {
            this.boredomLvl = 0;
        }
    }

    public void isAlive() {
        isAlive = true;

    }




    public void status() {

            System.out.println(petName + "'s " + "Hunger: " + hungerLvl + " Thirst: " + thirstLvl + " boredom: " + boredomLvl);

            if (hungerLvl >= 18) {
                System.out.println(petName + " is starving.. You better feed it..");
            }
            if (hungerLvl > 20) {
                System.out.println(petName + " just died from starvation... But its remains need buried..");
                isAlive = false;
            }

            if (thirstLvl >= 13) {
                System.out.println(petName + " is dehydrated... give it some water ASAP!");
            }
            if (thirstLvl > 18) {
                System.out.println(petName + " just died of thirst... But its carcass is decaying..");
                isAlive = false;
            }

            if (boredomLvl > 15) {
                System.out.println(petName + " is real bored. Be careful; it may run away from home soon..");
            }
            if (boredomLvl >= 18) {
                System.out.println(petName + " just died of boredom.., But it needs a proper funeral..");
                isAlive = false;
            }

    }

    // Tick
    public void tick() {
        hungerLvl = hungerLvl + 2;
        thirstLvl = thirstLvl + 2;
        boredomLvl = boredomLvl + 2;

    }

    //Test method
    public String parse(int i) {
        return i + "";
    }
}

