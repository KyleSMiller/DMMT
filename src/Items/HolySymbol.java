package Items;

public class HolySymbol extends Item {

    //TODO: figure out how to link to an undefined Person or a defined Person

    // private Person patron;

    public HolySymbol(String name){
        super();
        this.setName(name);
        // this.patron = new Patron("__DNE__")
    }

//    public Person getPatron(){
//        return this.patron;
//    }

    @Override
    public String writeSummary(){
        return "Placeholder Summary";
    }
}
