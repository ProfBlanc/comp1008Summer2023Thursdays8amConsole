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
static void example3(){

    Object o = true;
    o = 1;
    o = 1.23;
    o = new Car();


}

static void example4(){
    /*
        create an array of Car objects
        //ask the user 3 times for Car values
            color, make, model, price

        THEN
            output the color make model and price for EACH car object
     */

    Car[] cars = new Car[3];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < cars.length; i++){
        System.out.println("Entering info for car #" + (i + 1));
        //ask user for color, make, model, price
        System.out.println("Enter car color");
        String  color = input.nextLine();
        System.out.println("Enter car make");
        String  make = input.nextLine();
        System.out.println("Enter car model");
        String  model = input.nextLine();
        System.out.println("Enter car price");
        double price = input.nextDouble();
        input.nextLine(); // consume nl char

        //create an object at the specified index of cars array
        cars[i] = new Car(color, make, model, price);
    }
    System.out.println("Here is the information that you entered");
    //enhanced for == foreach loop in other language
    //for(dataType placeholder : collectionOfValues)
    for(Car currentCar : cars){
        System.out.printf("Car color = %s, make = %s, model = %s, price = %.2f%n",
                 currentCar.color, currentCar.make, currentCar.model, currentCar.getPrice()
                );
    }













}
    void regularMethod(){}
    public static void main(String[] args) {

    /*
            Main main = new Main();
        main.regularMethod();

        new Main().regularMethod();
        Main.example2();

     */
        example4();
    }
}