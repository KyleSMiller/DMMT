package Items;



public abstract class Item {

    private String name = "Unnamed Item";
    private boolean magical = false;
    private int rarity = 5;  // common rarity by default
    private int[] statBlockMod = {0, 0, 0, 0, 0, 0};
    private String traits = "No traits";
    private String description = "No description";
    private int basePrice = 0;
    private int weight = 0;
    private String summary = "No description";

    public Item(String name){
        this.name = name;
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
            case 0: return "Unique";
            case 1: return "Legendary";
            case 2: return "Very rare";
            case 3: return "Rare";
            case 4: return "Uncommon";
            case 5: return "Common";
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

    public String getSummary(){
        return summary;
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
        for (int i = 0; i < statMods.length; i ++){
            statBlockMod[i] = statMods[i];
        }
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

    protected abstract void writeSummary();
}