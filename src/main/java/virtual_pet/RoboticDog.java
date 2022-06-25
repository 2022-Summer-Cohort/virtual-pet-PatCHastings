package virtual_pet;

public class RoboticDog extends VirtualPet {


    public RoboticDog(String name, int maintenanceLvl, int oilLvl) {
        super(name, "robodog");
        this.maintenanceLvl = maintenanceLvl;
        this.oilLvl = oilLvl;

    }
}
