package Items;

public class AdventureGear extends Item{

    private boolean consumable;

    public AdventureGear(String name){
        super();
        this.setName(name);
        this.consumable = false;
    }

    public AdventureGear(){
        super();
        this.setName("Unnamed Adventure Gear");
        this.consumable = false;
    }


    /**
     * Getter methods
     */
    public boolean isConsumable(){
        return consumable;
    }

    /**
     * Setter methods
     */
    public void toggleConsumable(){
        this.consumable = !this.consumable;
    }

    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
