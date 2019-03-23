package Items;

public class MeleeWeapon extends Weapon{

    private boolean thrown;
    private boolean reach;
    private boolean versatile;

    public MeleeWeapon(String name){
        super();
        this.setName(name);
        this.thrown = false;
        this.reach = false;
        this.versatile = false;
    }

    public MeleeWeapon(){
        super();
        this.setName("Unnamed Weapon");
        this.thrown = false;
        this.reach = false;
        this.versatile = false;
    }

    /**
     * Getter methods
     */
    public boolean isThrown(){
        return this.thrown;
    }

    public boolean isReach(){
        return this.reach;
    }

    public boolean isVersatile(){
        return this.versatile;
    }

    /**
     * Setter methods
     */
    public void toggleThrown(){
        this.thrown = !this.thrown;
    }

    public void toggleReach(){
        this.reach = !this.reach;
    }

    public void toggleVersatile(){
        this.versatile = !this.versatile;
    }

     @Override
     public String writeSummary(){
        return "Placeholder Summary";
     }

}
