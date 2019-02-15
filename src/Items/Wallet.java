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
        // change the integer balance of the wallet
        // newBalance follows [pp, gp, ep, sp, cp] format
        long intAmount = coinageToRaw(newBalance);
        if (setTo) {
            this.balance = intAmount;
        }
        else{
            this.balance += intAmount;
        }
        this.calcCoinage();
    }


    public void setCoinage(int pp, int gp, int ep, int sp, int cp){
        // Set the exact coins of the wallet
        // This is method is only used when a DM manually sets the coins in a wallet

        this.formattedBalance[0] = pp;
        this.formattedBalance[1] = gp;
        this.formattedBalance[2] = ep;
        this.formattedBalance[3] = sp;
        this.formattedBalance[4] = cp;

        this.balance = this.coinageToRaw(this.formattedBalance);
    }


    private void generateBalance(){
        // TODO: wealth auto-generation logic -- need owner wealth logic before this can be implemented
    }


    private void calcCoinage() {
        // Convert balance integer into formatted coinage array
        // EP and PP are ignored when calculating the coinage
        // This method is only used in auto-generation of wallets
        long tempBalance = this.balance;
        int[] autoFormattedBalance = {this.formattedBalance[1], this.formattedBalance[3], this.formattedBalance[4]};

        for (int i = 0; i < autoFormattedBalance.length; i++){
            // split the balance at each digit
            autoFormattedBalance[(autoFormattedBalance.length - 1) - i] = (int) tempBalance % 10;
            tempBalance /= 10;
        }
        if (tempBalance != 0){
            // account for GP > 9
            autoFormattedBalance[0] += tempBalance * 10;
        }

        // add the autoFormattedBalance back into formattedBalance
        this.formattedBalance[0] = 0;
        this.formattedBalance[1] = autoFormattedBalance[0];
        this.formattedBalance[2] = 0;
        this.formattedBalance[3] = autoFormattedBalance[1];
        this.formattedBalance[4] = autoFormattedBalance[2];

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

