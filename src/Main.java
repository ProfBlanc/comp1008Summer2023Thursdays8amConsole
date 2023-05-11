import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

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
}