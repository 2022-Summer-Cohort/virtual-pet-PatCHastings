package virtual_pet;

public abstract class OrganicPet extends VirtualPet {

    public OrganicPet(String name, int hungry, int thirsty, int bored, boolean isAlive) {
        super(name, "Organic Pet");
        this.hungerLvl = hungry;
        this.thirstLvl = thirsty;
        this.boredomLvl = bored;
        this.isAlive = isAlive;
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

    public void feedOrganicPet() {
    }
}
