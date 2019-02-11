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
        // if wallet is not auto-generated, this method is used to create an initial balance
        // TODO: change the balance of the wallet
    }

    public void setCoinage(int pp, int gp, int ep, int sp, int cp){
        //
        // TODO: force the formattedBalance to a specific value
    }

    private void generateBalance(){
        // TODO: wealth auto-generation logic
    }

    private void calcCoinage() {
        // Convert balance integer into formatted coinage array
        // EP and PP are ignored when calculating the coinage
        // This method is only used in auto-generation of wallets
        long tempBalance = this.balance;
        for (int i = 0; i <= this.formattedBalance.length; i++){
            // split the balance at each digit
            this.formattedBalance[(this.formattedBalance.length - 1) - i] = (int) tempBalance % 10;
            tempBalance /= 10;
        }
        if (tempBalance != 0){
            // account for GP > 9
            this.formattedBalance[0] += tempBalance * 10;
        }
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

    public long getBalance(){
        return this.balance;
    }

    public int[] getFormattedBalance(){
        return this.formattedBalance;
    }
}

