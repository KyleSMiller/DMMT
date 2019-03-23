package Items;

public class Ammunition extends Item{

    private boolean reusable;

    public Ammunition(String name){
        super();
        this.setName(name);
        this.reusable = true;
    }

    public Ammunition(){
        super();
        this.setName("Unnamed Ammunition");
        this.reusable = true;
    }

    /**
     * Getter methods
     */
    public boolean isReusable(){
        return reusable;
    }

    /**
     * Setter methods
     */
    public void toggleReusable(){
        this.reusable = !this.reusable;
    }

    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
