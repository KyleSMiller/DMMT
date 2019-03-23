package Items;

public class Armor extends Item {

    private int armorClass;
    private int dexMod;

    public Armor(String name){
        super();
        this.setName(name);
        this.armorClass = 10;
        this.dexMod = 0;
    }

    public Armor(){
        super();
        this.setName("Unnamed armor");
        this.armorClass = 10;
        this.dexMod = 0;
    }


    /**
     * Getter methods
     */
    public int getArmorClass(){
        return armorClass;
    }

    public int getDexMod(){
        return dexMod;
    }

    /**
     * Setter methods
     */
    public void setArmorClass(int armorClass){
        this.armorClass = armorClass;
    }

    public void setDexMod(int dexMod){
        this.dexMod = dexMod;
    }


    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
