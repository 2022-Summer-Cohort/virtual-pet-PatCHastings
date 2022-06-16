package virtual_pet;

public class OrganicDog extends VirtualPet {

protected int cageDirtiness;

    public OrganicDog(String name, int hungry, int thirsty, int bored, boolean isAlive) {
        super(name, "Organic Dog");
        this.cageDirtiness = 0;
        this.hungerLvl = hungry;
        this.thirstLvl = thirsty;
        this.boredomLvl = bored;
        this.isAlive = isAlive;
    }

    public int getCageDirtiness() {
        return cageDirtiness;
    }

    public int cleanDogCage() {
        return cageDirtiness = 0;
    }


}
