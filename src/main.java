import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/*
 * Lab 11 by Jeff Choi 2/9/2017
*/

public class main {
    public static int getCars(Scanner sc, Validator validate) {
        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        int numCars = validate.getInt(sc);
        return numCars;
    }
    
    public static void getInput(Car[] cars, int numCars, Scanner sc) {
        for (int i = 0; i < numCars; i++) {
            String make, model, holder;
            int year;
            double price;
            
            System.out.print("Enter Car#" + i + " Make: " );
            make = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Model: ");
            model = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Year: ");
            year = sc.nextInt();
            System.out.print("Enter Car#" + i + " Price: ");
            holder = sc.next();
            sc.nextLine();
            price = Double.parseDouble(holder);
            cars[i] = new Car(make, model, year, price);
        } }

    // "overloading" for arraylist of cars
    public static void getInput(ArrayList<Car> theCars, int numCars, Scanner sc) {
        for (int i = 0; i < numCars; i++) {
            String make, model, holder;
            int year;
            double price;

            System.out.print("Enter Car#" + i + " Make: " );
            make = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Model: ");
            model = sc.next();
            sc.nextLine();
            System.out.print("Enter Car#" + i + " Year: ");
            year = sc.nextInt();
            System.out.print("Enter Car#" + i + " Price: ");
            holder = sc.next();
            sc.nextLine();
            price = Double.parseDouble(holder);
            Car theCar = new Car(make, model, year, price);
            UsedCar testing = new UsedCar(make, model, year, price, 2828);
            theCars.add(theCar);
        }
    }

    public static Car getInput(Scanner sc, Validator validate) {
        String make, model, holder;
        int year, mileage;
        double price;

        System.out.print("Enter Car Make: " );
        make = validate.getString(sc);
        System.out.print("Enter Car Model: ");
        model = validate.getString(sc);
        System.out.print("Enter Car Year: ");
        year = validate.getInt(sc);
        System.out.print("Enter Car Price: ");
        price = validate.getDouble(sc);
        System.out.print("enter Car Mileage: ");
        mileage = validate.getInt(sc);

        if (mileage > 0) {
            return new UsedCar(make, model, year, price, mileage);
        }
    
        return new Car(make, model, year, price);
    }


    public static void printOutput(Car[] cars, int numCars) {
        System.out.println("");
        System.out.println("Current Inventory:");

        for (int j = 0; j < numCars; j++) {
            cars[j].printString();
        }
    }

    public static void printOutput(ArrayList<Car> theCars, int numCars) {
        System.out.println("Current Inventory:");
        System.out.printf("   %-15s %-15s %-10s %-15s %-15s", "Make", "Model", "Year", "Price", "Mileage (Used)");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < numCars; i++) {
            System.out.print((i + 1) + ". ");
            theCars.get(i).printString();
        }

        System.out.println((numCars + 1) + ". Quit");
        System.out.println("");
    }

    public static ArrayList<Car> generateCars() {
        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Ford", "Escape", 2004, 12999);
        carList.add(new Car("Toyota", "Camry", 2011, 21999);
        carList.add(new Car("Mercedes", "GLK", 2011, 39500);
        carList.add(new UsedCar("Honda", "Pilot", 2009, 12000, 60000);
        carList.add(new UsedCar("Honda", "Civic", 2014, 22999, 20000);
        carList.add(new UsedCar("BMW", "335i", 2016, 39999, 999);

        return carList;
    }

    public static HashMap<Integer, Car> generateCarMap() {
        HashMap<Integer, Car> carMap = new HashMap<Integer, Car>();
        Car newOne = new Car("Ford", "Escape", 2004, 12999);
        Car newTwo = new Car("Toyota", "Camry", 2011, 21999);
        Car newThree = new Car("Mercedes", "GLK", 2011, 39500);
        UsedCar usedOne = new UsedCar("Honda", "Pilot", 2009, 12000, 60000);
        UsedCar usedTwo = new UsedCar("Honda", "Civic", 2014, 22999, 20000);
        UsedCar usedThree = new UsedCar("BMW", "335i", 2016, 39999, 999);

        carMap.put(0, newOne);
        carMap.put(1, newTwo);
        carMap.put(2, newThree);
        carMap.put(3, usedOne);
        carMap.put(4, usedTwo);
        carMap.put(5, usedThree);

        return carMap;
    }

    public static CarLot generateCarLot() {
        CarLot holder = new CarLot();
        Car newOne = new Car("Ford", "Escape", 2004, 12999);
        Car newTwo = new Car("Toyota", "Camry", 2011, 21999);
        Car newThree = new Car("Mercedes", "GLK", 2011, 39500);
        UsedCar usedOne = new UsedCar("Honda", "Pilot", 2009, 12000, 60000);
        UsedCar usedTwo = new UsedCar("Honda", "Civic", 2014, 22999, 20000);
        UsedCar usedThree = new UsedCar("BMW", "335i", 2016, 39999, 999);

        holder.addCar(newOne);
        holder.addCar(newTwo);
        holder.addCar(newThree);
        holder.addCar(usedOne);
        holder.addCar(usedTwo);
        holder.addCar(usedThree);

        return holder;
    }

    public static void listOptions() {
        System.out.println("Welcome, what would you like to do? (Please choose a number)");
        System.out.println("1. List all cars.");
        System.out.println("2. Add a car.");
        System.out.println("3. Remove a car.");
        System.out.println("4. Look up a car in a given position.");
        System.out.println("5. Replace a car in a given position.");
        System.out.println("6. List cars based on make.");
        System.out.println("7. List cars based on years.");
        System.out.println("8. List cars based on price limit.");
        System.out.println("9. List cars based on new or used.");
        System.out.println("10. Quit");
        System.out.println("");
    }


    public static void main (String[] args) {
        Validator validate = new Validator();
        Scanner sc = new Scanner(System.in);
        int userInput;
        char toContinue;
        ArrayList<Car> carList = generateCars();
        CarLot carLot = generateCarLot();

        while (true) {
            listOptions(); 
            userInput = validate.getInt(sc);
            System.out.println("");

            if (userInput == 1) {
                System.out.println("Car list: ");
                carLot.listCars();
            }
            else if (userInput == 2) {
                System.out.println("Add a car.");
                carLot.addCar(getInput(sc, validate));

            }
            else if (userInput == 3) {
                System.out.println("Remove a car. (Choose number)");
                carLot.listCars();
                carLot.removeCar(validate.getInt(sc) - 1);
            }
            else if (userInput == 4) {
                System.out.println("Please enter the number of the car you would like to look up: ");
                // add another int validator to not exceed index limit
                carLot.getCar(validate.getInt(sc) - 1);

            }
            else if (userInput == 5) {
                System.out.println("Please enter the number of the car you would like to replace: ");
                carLot.replaceCar(validate.getInt(sc) - 1, getInput(sc, validate)); 
            }
            else if (userInput == 6) {
                System.out.println("Please enter the make of car(s) you would like to see: ");
                carLot.listByMake(validate.getString(sc));
            }
            else if (userInput == 7) {
                System.out.println("Please enter the year of car(s) you would like to see: ");
                carLot.listByYear(validate.getInt(sc));
            }
            else if (userInput == 8) {
                System.out.println("Please enter the price limit of car(s) you would like to see: ");
                carLot.listByPrice(validate.getInt(sc));
            }
            else if (userInput == 9) {
                System.out.println("Would you like to see used or new cars? ");
                carLot.listByUsed(validate.getString(sc));
            }

            else if (userInput == 10) {
                System.out.println("Have a great day!");
                break;
            }






            //carList.get(userInput - 1).printString();

            System.out.println("Choose another?(y/n) ");
            toContinue = validate.getYesNo(sc);

            if (toContinue == 'n' || toContinue == 'N') {
                break;
            }

            System.out.println("");
        }
    }
}
