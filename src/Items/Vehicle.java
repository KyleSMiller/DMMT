package Items;

public class Vehicle extends Item{

    private boolean autonomous;

    public Vehicle(String name){
        super();
        this.setName(name);
        this.autonomous = false;
    }

    public Vehicle(){
        super();
        this.setName("Unnamed Vehicle");
        this.autonomous = false;
    }


    /**
     * Getter methods
     */
    public boolean isAutonomous(){
        return this.autonomous;
    }

    /**
     * Setter methods
     */
    public void toggleAutonomous(){
        this.autonomous = !this.autonomous;
    }


    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
