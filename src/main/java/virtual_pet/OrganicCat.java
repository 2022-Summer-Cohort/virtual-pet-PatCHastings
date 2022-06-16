package virtual_pet;

public class OrganicCat extends VirtualPet {

protected int litterBoxDirtiness;
protected String name;


    public OrganicCat(String name, int hungry, int thirsty, int bored, boolean isAlive) {
        super(name, "Organic Cat");
        this.name = name;
        this.litterBoxDirtiness = 0;
        this.hungerLvl = hungry;
        this.thirstLvl = thirsty;
        this.boredomLvl = bored;
        this.isAlive = isAlive;
    }

    public int getLitterBoxDirtiness() {
        return litterBoxDirtiness;
    }

    public int cleanLitterBox() {
        return litterBoxDirtiness = 0;
    }
}
