package Items;


public class RangedWeapon extends Weapon {

    private boolean loading;
    // private Ammunition ammunition;

    public RangedWeapon(String name){
        super();
        this.setName(name);
        this.loading = false;
        // this.ammunition = new Ammunition("Arrows")
    }

    /**
     * Getter methods
     */
    public boolean isLoading(){
        return this.loading;
    }

//    public boolean getAmmunition(){
//        return this.Ammunition;
//    }

    /**
     * Setter Methods
     */
    public void toggleLoading(){
        this.loading = !this.loading;
    }
//
//    public void setAmmunition(){
//        //TODO: Proper ammo changing logic
//    }

    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
