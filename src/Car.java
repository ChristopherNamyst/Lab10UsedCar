import java.io.PrintStream;
import java.text.NumberFormat;

import static java.lang.System.*;

/**
 * Created by christophernamyst on 2/16/17.
 */
public class  Car {

    ///INSTANCE VARIABLES///
    private String make;
    private String model;
    public int year;
    private double price;



    ///INPUT ASSIGNMENTS///
    public Car() {
        make = "";
        model = "";
        year = 0;
        price = 0.0;

    }


    public Car (String make, String model, int year, double price) {

        ////TAKING ARGUMENTS///
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }



        ////////////////////GETTERS///////////////////////////////

    public String getMake() {
        return make;
    }
    ///MODEL GETTER///
    public String getModel() {
        return model;
    }
    ///YEAR GETTER///
    public int getYear() {
        return year;
    }
    ///PRICE GETTER///
    public double getPrice() {
        return price;
    }
    ///MILEAGE GETTER///////



        ////////////////////SETTERS/////////////////////////////
    public void setMake(String make) {
        this.make = make;
    }
    ///MODEL SETTER///
    public void setModel(String model) {
        this.model = model;
    }
    ///YEAR SETTER///
    public void setYear(int year) {
        this.year = year;
    }
    ///PRICE SETTER///
    public void setPrice(double price) { this.price = price; }



    public String toString() {
        ///RETURN STATEMENT THAT RETURNS USER INPUT///
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        return
           ("Car" + " make = " +  make +
                   '\t' +  " model = " + model +
                   '\t' + " year = " + year +
                   '\t' + " price = " +  nf.format(price) );



    }




}


