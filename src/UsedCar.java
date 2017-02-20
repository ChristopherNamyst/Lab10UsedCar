/**
 * Created by christophernamyst on 2/20/17.
 */
import java.util.*;






/**
 * Created by christophernamyst on 2/20/17.
 */
public class UsedCar extends Car {

    private double mileage;


    public UsedCar(String make, String model, int year, double price, double mileage) {

        super(make, model, year, price);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;


    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }






    public String toString() {
        return super.toString() + "(used)\t" +  mileage + " miles";

    }


}