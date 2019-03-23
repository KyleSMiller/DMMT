package Items;

import java.util.ArrayList;

public class Material extends Item{

    private ArrayList<Item> partOf;

    public Material(String name){
        super();
        this.setName(name);
        this.partOf = new ArrayList<Item>();
    }

    public Material(){
        super();
        this.setName("Unnamed Material");
        this.partOf = new ArrayList<Item>();
    }


    public ArrayList<Item> getPartOf(){
        return this.partOf;
    }

    /**
     * Add any Item to the list of Items this material composes
     * @param part the item to add to the list
     */
    public void addPartOf(Item part){
        this.partOf.add(part);
    }

    /**
     * Remove any Item from the list of Items this material composes
     * @param part the item to remove from the list
     */
    public void removePartOf(Item part){
        this.partOf.remove(part);
    }


    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }

}
