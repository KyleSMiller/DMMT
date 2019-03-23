package Items;

public class Potion extends Item{

    public Potion(String name){
        super();
        this.setName(name);
    }

    public Potion(){
        super();
        this.setName("Unnamed Potion");
    }

    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
