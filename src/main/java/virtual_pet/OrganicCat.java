package virtual_pet;

public class OrganicCat extends VirtualPet implements Organic {

protected int litterBoxDirtiness;
protected String name;

    public OrganicCat(String name, int hungry, int thirsty, int bored, boolean isAlive, int litterBoxDirtiness, boolean cleanCage) {
        super(name, "organicat");
        this.name = name;
        this.litterBoxDirtiness = 0;
        this.hungerLvl = hungry;
        this.thirstLvl = thirsty;
        this.boredomLvl = bored;
        this.isAlive = isAlive;
        this.refuseLvl = refuseLvl;
        this.cleanCage = cleanCage;
    }

    public int getLitterBoxDirtiness() {
        return litterBoxDirtiness;
    }

    public int cleanLitterBox() {
        return litterBoxDirtiness = 0;
    }


    public int getCageDirtiness() {
        return 0;
    }



}
