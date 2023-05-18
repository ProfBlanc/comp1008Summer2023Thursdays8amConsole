import java.util.Scanner;
public class Main {

static void example1(){
    System.out.println("Hello world!");

    Car car1 = new Car();
    car1.make = "Honda";
    car1.model = "Accord";
    car1.color = "grey";

    System.out.println("Car 1 make is " + car1.make);

        /*
        String formatting is done by
            %
                s: string
                d: digit (any whole numer)
                f: float (any decimal number)
         */



    System.out.printf("Car 1 model is %s and the color is %s%n", car1.make, car1.model);
    car1.setKilometres(10000);
    System.out.println(car1.getKilometres());

        /*
            data types are strict
                a byte is not the same as int
                short is not same as long
         */
    byte doors = 4;
    car1.setDoors(doors);

}

static void example2(){

    //get user input
    //Scanner object: package java.util.Scanner
    Scanner input = new Scanner(System.in);


    //ask a question
    //sout+tab
    //get user info
    System.out.println("Enter car color");
    String color = input.nextLine();
    System.out.println("Enter car make");
    String make = input.nextLine();
    System.out.println("Enter car number of doors");
    byte numOfDoors = input.nextByte();
    input.nextLine(); //consume the Scanner delimeter (aka the nl char)
    System.out.println("Enter car model");
    String model = input.nextLine();
    System.out.println("Enter a year");
    short year = input.nextShort();
    System.out.println("Enter weight");
    double weight = input.nextDouble();
    //if going from number to number.
    //no need to consume the nl character
    //why? because nextNumberDataType => truncate \n
    System.out.println("# cylinders");
    short cylinders = input.nextShort();
    System.out.println("Enter kilometers");
    int km = input.nextInt();
    //    public Car(String color, String model, String make,
    //    float horsePowerEngine, byte seats, byte doors,
    //    short year, double weight, double price, int kilometres) {
    byte seats = 5;
    Car car = new Car(color, model, make, 100f, seats,
            numOfDoors, year, weight, 12345d, km);

    Car defaultCar = new Car(); //using default constructor

    System.out.println("What is the kilometers of Car object? ");
    System.out.println(car.getKilometres());

    System.out.println("What is the kilometers of default Car? ");
    System.out.println(defaultCar.getKilometres());

    System.out.println("Thank you for your input");
}

    void regularMethod(){}
    public static void main(String[] args) {

    /*
            Main main = new Main();
        main.regularMethod();

        new Main().regularMethod();
        Main.example2();

     */
        example2();
    }
}