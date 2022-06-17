package virtual_pet;

public abstract class RoboticPet extends VirtualPet {



    public RoboticPet(String name, String type, int maintenanceLvl) {
        super(name, type);
        this.maintenanceLvl = maintenanceLvl;
    }


}
