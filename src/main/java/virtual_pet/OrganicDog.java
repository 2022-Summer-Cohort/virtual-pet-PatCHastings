package virtual_pet;

public class OrganicDog extends VirtualPet {

protected int cageDirtiness;

    public OrganicDog(String name, int hungry, int thirsty, int bored, boolean isAlive, int refuseLvl, boolean cleanCage) {
        super(name, "organic");
        this.cageDirtiness = 0;
        this.hungerLvl = hungry;
        this.thirstLvl = thirsty;
        this.boredomLvl = bored;
        this.isAlive = isAlive;
        this.refuseLvl = refuseLvl;
        this.cleanCage = cleanCage;
    }

    public int getCageDirtiness() {
        return cageDirtiness;
    }

    public int cleanDogCage() {
        return cageDirtiness = 0;
    }
}
