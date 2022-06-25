package virtual_pet;

public class OrganicDog extends VirtualPet implements OrganicD{

protected int cageDirtiness;

    public OrganicDog(String name, int hungry, int thirsty, int bored, boolean isAlive, int cageDirtiness, boolean cleanCage) {
        super(name, "organidog");
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

    @Override
    public int cleanDogCages() {
        return cageDirtiness = 0;
    }

    public int cleanDogCage() {
        return cageDirtiness = 0;
    }

}
