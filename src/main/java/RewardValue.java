public class RewardValue {
    private double cashValue;
    private int milesValue;

// Constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) Math.round(cashValue / 0.0035);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method that returns the cash value of the RewardValue class
    public double getCashValue() {
        return this.cashValue;
    }

    // Method that returns how many miles the 'RewardValue' is worth
    public int getMilesValue() {
        return this.milesValue;
    }
}
