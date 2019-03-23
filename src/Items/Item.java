package Items;
import UserInterface.EntityPage.EntityPage;


public abstract class Item implements EntityPage{

    private String name;
    private boolean magical;
    private int rarity;
    private int[] statBlockMod;
    private String traits;
    private String description;
    private int basePrice;
    private int weight;

    public Item(String name){
        this.name = name;
        this.magical = false;
        this.rarity = 0; // common rarity by default
        this.statBlockMod = new int[6];
        this.traits = "";
        this.description = "";
        this.basePrice = 0;
        this.weight = 0;
    }

    public Item(){
        this.name = "Unnamed Item";
        this.magical = false;
        this.rarity = 0; // common rarity by default
        this.statBlockMod = new int[6];
        this.traits = "";
        this.description = "";
        this.basePrice = 0;
        this.weight = 0;
    }


    /**
     * getter methods
     */
    public String getName(){
        return this.name;
    }

    public boolean isMagical(){
        return this.magical;
    }

    public String getRarity(){
        switch (this.rarity){
            case 0: return "common";
            case 1: return "uncommon";
            case 2: return "rare";
            case 3: return "very rare";
            case 4: return "legendary";
            case 5: return "unique";
            default: return "Unknown Rarity";
        }
    }

    public int[] getStatBlockMod() {
        return statBlockMod;
    }

    public String getTraits() {
        return traits;
    }

    public String getDescription() {
        return description;
    }

    public int getBasePrice(){
        return basePrice;
    }

    public int getWeight(){
        return weight;
    }


    /**
     * setter methods
     */
    public void setName(String newName){
        this.name = newName;
        // TODO: add max name length -- need UI draft to determine max length
    }

    public void toggleMagical(){
        this.magical = !this.magical;
    }

    public void setRarity(int rareValue){
        //TODO: Get max and min rarities from an actual area
        int minRarity = 0;
        int maxRarity = 5;
        if (rareValue < minRarity){
            this.rarity = 0;
        }
        else if(rareValue > maxRarity){
            this.rarity = 5;
        }
        else{
            this.rarity = rareValue;
        }
    }

    public void setStatBlock(int[] statMods){
        System.arraycopy(statMods, 0, this.statBlockMod, 0, statMods.length);
//        for (int i = 0; i < statMods.length; i ++){
//            this.statBlockMod[i] = statMods[i];
//        }
    }

    public void setTraits(String text){
        this.traits = text;
    }

    public void setDescription(String text){
        this.description = text;
    }

    public void setBasePrice(int price){
        this.basePrice = price;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

}