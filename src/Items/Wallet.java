package Items;

public class Wallet {

    private long balance = 0;
    private int[] formattedBalance = new int[5];

    public Wallet(int[] startingCoinage){
        this.formattedBalance = startingCoinage;
        this.balance = this.coinageToRaw(this.formattedBalance);
    }


    public void changeBalance(int[] newBalance, boolean setTo){

    }

    public void setCoinage(int pp, int gp, int ep, int sp, int cp){

    }

    private void calcCoinage(){

    }

    private int coinageToRaw(int[] coinage){
        int rawValue = 0;
        return rawValue;
    }
}
