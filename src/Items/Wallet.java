package Items;

/**
 * Store and manage the money of any Character, Faction, or Location
 * @author Kyle Miller
 */
public class Wallet {

    private int[] formattedBalance = new int[5];  // follows [pp, gp, ep, sp, cp] format
    private long balance = 0;  // value of the wallet in cp

    /**
     * Constructor for Wallets automatically created for Characters
     * @param ownerWealth the wealth modifier of the parent Character or Location
     */
    public Wallet(float ownerWealth){
        generateBalance(ownerWealth);
    }

    /**
     * Constructor for manually creating a Wallet
     */
    public Wallet(int pp, int gp, int ep, int sp, int cp){
        setCoinage(pp, gp, ep, sp, cp);
    }


    /**
     * Getter methods
     */
    public long getBalance(){
        return this.balance;
    }

    public int[] getFormattedBalance(){
        return this.formattedBalance;
    }



    /**
     * Alter the balance of the wallet
     * @param newBalance an array in the [pp, gp, ep, sp, cp] format
     */
    public void changeBalance(int[] newBalance){
        this.balance = coinageToRaw(newBalance);
        this.calcCoinage();
    }

    /**
     * Add a specified amount to the total Wallet value
     * @param formattedAmount an array - in the [pp, gp, ep, sp, cp] format - of the value to add
     */
    public void addToBalance(int[] formattedAmount){
        this.balance += coinageToRaw(formattedAmount);
        this.calcCoinage();
    }

    /**
     * Subtract a specified amount from the total Wallet value
     * @param formattedAmount an array - in the [pp, gp, ep, sp, cp] format - of the value to subtract
     */
    public void removeFromBalance(int[] formattedAmount){
        this.balance -= coinageToRaw(formattedAmount);
        this.calcCoinage();
    }


    /**
     * Set the exact coins of the wallet
     * This is method is only called when a DM manually sets the coins in a wallet
     */
    public void setCoinage(int pp, int gp, int ep, int sp, int cp){
        this.formattedBalance[0] = pp;
        this.formattedBalance[1] = gp;
        this.formattedBalance[2] = ep;
        this.formattedBalance[3] = sp;
        this.formattedBalance[4] = cp;

        this.balance = this.coinageToRaw(this.formattedBalance);
    }


    /**
     * Automatically set the values in the wallet to an amount appropriate for the owner
     * @param wealthModifier modifier used to generate the starting balance of the wallet
     */
    private void generateBalance(float wealthModifier){
        // TODO: wealth auto-generation logic
    }


    /**
     * Convert balance integer into formatted coinage array
     * EP and PP are ignored when calculating the coinage
     * Only used in auto-generation of wallets
     */
    private void calcCoinage() {
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


    /**
     * Convert the formatted array of coins into an integer
     * @param coinage an array in the [pp, gp, ep, sp, cp] format
     * @return the non-coinageArray-formatted value of the wallet
     */
    private int coinageToRaw(int[] coinage){
        int rawValue = 0;
        rawValue += coinage[0] * 1000;        // add PP
        rawValue += coinage[1] * 100;         // add GP
        rawValue += (coinage[2] / 2) * 100;   // add EP
        rawValue += coinage[3] * 10;          // add SP
        rawValue += coinage[4];               // add CP
        return rawValue;
    }
}

