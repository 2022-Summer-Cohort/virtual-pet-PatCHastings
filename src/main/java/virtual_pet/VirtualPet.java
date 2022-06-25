package virtual_pet;

public abstract class VirtualPet {

    protected String petName;
    protected String petType;
    protected int hungerLvl;
    protected int thirstLvl;
    protected int boredomLvl;
    protected boolean isAlive;
    protected int maintenanceLvl;
    protected int refuseLvl;
    protected int litterboxDirtiness;
    protected int cageDirtiness;
    protected boolean cleanCage;
    protected int oilLvl;

    //constructor
    public VirtualPet(String name, String type) {
        this.petName = name;
        this.petType = type;

    }

    //getter methods
    public int getRefuseLvl() {
        return refuseLvl;
    }
    public boolean isCleanCage() {
        return cleanCage;
    }
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
    public String getPetType() {
        return petType;
    }
    public int getMaintenanceLvl() {
        return maintenanceLvl;
    }

    //METHODS
    public void petsName() {
        System.out.println(petName);
    }

    public void feed() {
        hungerLvl = hungerLvl - 5;
        boredomLvl = boredomLvl + 3;
        if (hungerLvl < 0) {
            hungerLvl = 0;
        }
    }

    public void water() {
        thirstLvl = thirstLvl - 5;
        boredomLvl = boredomLvl + 3;
        if (thirstLvl < 0) {
            this.thirstLvl = 0;
        }
    }

    public void play() {
        boredomLvl = boredomLvl - 5;
        hungerLvl = hungerLvl + 4;
        thirstLvl = thirstLvl + 4;
        if (boredomLvl < 0) {
            this.boredomLvl = 0;
        }
    }

    public void isAlive() {
        isAlive = true;

    }


    public void status() {

        System.out.println(petType + " " + petName + "'s " + "Hunger: " + hungerLvl + " Thirst: " + thirstLvl +
                " boredom: " + boredomLvl + " dog cages: " + cageDirtiness + " cat litterboxes " + litterboxDirtiness +
                " maintenance: " + maintenanceLvl + " Needs-oil level: " + oilLvl);

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

        if (litterboxDirtiness >= 5) {//clean cat litterboxes
            System.out.println("Your organic cats have filled their litterboxes.. empty them..now");
        }
        if (cageDirtiness >= 5) { //clean dog cages
            System.out.println("the dogs have soiled their cages and they need cleaned out..");
        }
        if (maintenanceLvl >= 5) {
            System.out.println("Your robotic pets are about to glitch! give them maintenance asap!");
        }
        if (oilLvl >= 5) {
            System.out.println("Robots need oil!!");
        }



    }

    // Tick
    public void tick() {
        if (petType.equals("organicat") || petType.equals("organidog")) {
            hungerLvl = hungerLvl + 2;
            thirstLvl = thirstLvl + 2;
            boredomLvl = boredomLvl + 2;
        }
        if (petType.equals("robocat") || petType.equals("robodog")) {
            maintenanceLvl = maintenanceLvl + 1;
            oilLvl = oilLvl +1;
        }
        if (petType.equals("organicat") || petType.equals("organidog")) {
            refuseLvl = refuseLvl + 1;
        }
        if (petType.equals("organicat")) {
            litterboxDirtiness = litterboxDirtiness + 1;
        }
        if (petType.equals("organidog")) {
            cageDirtiness = cageDirtiness + 1;
        }

    }

    //Test method
    public String parse(int i) {
        return i + "";
    }

    public void waterOrganicPet() {
        thirstLvl = thirstLvl - 5;
        if (thirstLvl < 0) {
            thirstLvl = 0;
        }
    }

    public void feedOrganicPet() {
        hungerLvl = hungerLvl - 5;
        boredomLvl = boredomLvl + 1;
        if (hungerLvl < 0) {
            hungerLvl = 0;
        }
    }
    public void playOrganicPet() {
        boredomLvl = boredomLvl - 5;
        hungerLvl = hungerLvl + 3;
        thirstLvl = thirstLvl + 3;
        if (boredomLvl < 0) {
            this.boredomLvl = 0;
        }
    }
//    public void cleanAllCages() {
//        cageDirtiness = 0;
//    }
    public void maintenanceOnRobot() {
        maintenanceLvl = 0;
    }

    public void maintenanceGoesUp() {
        maintenanceLvl = maintenanceLvl + 1;
    }


    public void cleanAllLitterboxes() {
        litterboxDirtiness = 0;
    }

    public void oilRoboticPets() {
        oilLvl = 0;
    }

    public void boredomLvlGoesDown() {
        boredomLvl -= boredomLvl;
    }

    public void cleanAllCages() {
        cageDirtiness = 0;
    }
}


