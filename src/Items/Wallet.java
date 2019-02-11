package Items;

public class Wallet {

    private long balance = 0;
    private int[] formattedBalance = new int[5];

    public Wallet(boolean autoGenerate){
        if (autoGenerate){
            generateBalance();
        }
    }


    public void changeBalance(int[] newBalance, boolean setTo){
        // TODO: change the balance of the wallet
    }

    public void setCoinage(int pp, int gp, int ep, int sp, int cp){
        // TODO: force the formattedBalance to a specific value
    }

    private void generateBalance(){
        // TODO: wealth auto-generation logic
    }

    private void calcCoinage() {
        // TODO: convert raw balance into formatted array of coins
    }

    private int coinageToRaw(int[] coinage){
        // Convert the formatted array of coins into an integer
        int rawValue = 0;
        rawValue += coinage[0] * 1000;        // add PP
        rawValue += coinage[1] * 100;         // add GP
        rawValue += (coinage[2] / 2) * 100;   // add EP
        rawValue += coinage[3] * 10;          // add SP
        rawValue += coinage[4];               // add CP
        return rawValue;
    }
}

