import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by christophernamyst on 2/20/17.
 import java.util.ArrayList;
 import java.util.Scanner;

 /**
 * Created by christophernamyst on 2/16/17.
 */
public class CarMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //THIS CALLS THE NO-ARGUMENT CONSTRUCTOR
        //Car Car1 = new Car();

        ///ASK YOUR USER HOW MANY CARS THEY WILL INPUT///
        System.out.print("Welcome to my Automobile Information Application. How many cars do you have to enter? ");
        int numUsers = scan.nextInt();

        ///ANOTHER STATEMENT BY PROGRAM////
        System.out.println("OK, Let's get started, shall we...");
        System.out.println();

        ///CREATE THE ARRAYLIST----OUTSIDE THE LOOP!!!!!!/////
        ArrayList<Car> carList = new ArrayList<Car>();

        ///MAKE AND STORE THE REQUIRED # OF CARS///
        for (int i = 0; (i < numUsers); i++) {
            System.out.println("Please enter 1 for used, 2 for new..");
            int choice = scan.nextInt();



            ///GET INFO///
            System.out.println("To start, what is the make of the car? ");
            String make = scan.next();

            ///ASK FOR THE MODEL OF THE CAR///
            System.out.println("And the model of the car? ");
            String model = scan.next();

            ///ASK FOR THE YEAR OF THE CAR///
            System.out.println("How about the year? ");
            int year = scan.nextInt();

            System.out.println("Lastly, please tell me the price of the car. ");
            Double price = scan.nextDouble();

            if (choice == 2) {


                ///CREATE A NEW INSTANCE///
                //Car c = new Car(make, model, year, price);
                Car c = new Car();
                c.setMake(make);
                c.setModel(model);
                c.setYear(year);
                c.setPrice(price);
                ///ADD IT TO THE ARRAY LIST///
                carList.add(c);
            } else {
                System.out.println("Please enter the mileage for the car..");
                double mileage = scan.nextDouble();
                Car c = new UsedCar (make, model, year, price, mileage);

                carList.add(c);
            }

        }
        ///LETTTING USER KNOW INPUT IS COMING///
        System.out.println("Thank you for your input. Here is your chart:  ");


        ///GO THRU USERS///
        while (true) {
            for (Car c : carList) {
                ///AND OUTPUT THEM///
                System.out.println(c);
                System.out.println();

            }

            int index = scan.nextInt();

            System.out.println("Which car would you like to look at today?");
            System.out.println(carList.get(index));
            System.out.println("Would you like to purchase the car today?");
            System.out.println("Please enter 1 for Yes and 2 for No..");
            int choice = scan.nextInt();
            if(choice == 1){
                carList.remove(index);
                System.out.println("Great, my finance dept will be contacting you!!");
                if(carList.isEmpty()){
                    System.out.println("Sorry Bromodo Dragon, we are out of vehicles today.");
                    return;
                }
            } else {
                System.out.println("Unfortunately, we can NOT do business today, please check back at a later date..");
            }
        }


    }
}


