package Items;

public abstract class Weapon extends Item{

    private int damage;
    private String damageType;
    private int[] range = new int[2];
    private boolean light;
    private boolean heavy;
    private boolean special;
    private boolean twoHanded;
    private boolean martial;

    public Weapon(String name){
        this.setName(name);
    }

    /**
     * Getter methods
     */
    public int getDamage(){
        return this.damage;
    }

    public String getDamageType(){
        return this.damageType;
    }

    public int[] getRange(){
        return this.range;
    }

    public boolean isLight(){
        return this.light;
    }

    public boolean isHeavy(){
        return this.heavy;
    }

    public boolean isSpecial(){
        return this.special;
    }

    public boolean isTwoHanded(){
        return this.twoHanded;
    }

    public boolean isMartial(){
        return this.martial;
    }

    /**
     * Setter methods
     */
    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setDamageType(String damageType){
        this.damageType = damageType;
    }

    public void setRange(int regular, int disadvantaged){
        this.range[0] = regular;
        this.range[1] = disadvantaged;
    }

    public void toggleLight(){
        this.light = !this.light;
    }

    public void toggleHeavy(){
        this.heavy = !this.heavy;
    }

    public void toggleSpecial(){
        this.special = !this.special;
    }

    public void toggleTwoHanded(){
        this.twoHanded = !this.twoHanded;
    }

    public void toggleMartial(){
        this.martial = !martial;
    }


}
