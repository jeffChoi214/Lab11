import java.text.NumberFormat;

/*
 * Lab 9 Car Used Class File
*/

public class UsedCar extends Car {
    private int miles;
    private boolean isUsed;

    public UsedCar(String theMake, String theModel, int theYear, double thePrice, int theMiles) {
        this.make = theMake;
        this.model = theModel;
        this.year = theYear;
        this.price = thePrice;
        this.miles = theMiles;
        this.isUsed = true;
    }

    public int getMiles() {
        return miles;
    }

    public boolean getUsed() {
        return isUsed;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void printString() {
        System.out.printf("%-15s %-15s %-10d %-15s %-15s" , make, model, year, df.format(price), mg.format(miles) + " miles");
        System.out.println("");
    }
}
