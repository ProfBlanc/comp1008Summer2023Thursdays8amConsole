package wk9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week9 {


    static void example1(){
        Dog dog = new Dog();

        Canine canine = new Dog();
        //Canine canine = new Dog("dog", -1);

        //Paws paws = new Paws();  //interface cannot be instantiated
        Paws paws = new Dog();  //takes the methods of interface, Object


    }
    static Scanner input = new Scanner(System.in);
    static void example2(){

        //ask user for number
        System.out.println("Enter number:");
        int number = input.nextInt();
        //output number
        System.out.println(number);

    }
    static void example3(){

        try {
            //ask user for number
            System.out.println("Enter number:");
            int number = input.nextInt();
            //output number
            System.out.println(number);
        }
        catch (Exception e){

            //serr+tab
            System.err.println("Error with number input");
        }

        //try-catch statements
        //put code in try statements where: opening resources, getting user input
        //                                  use a method that can possible THROW an exception/error

    }

    static void example4(){

        try {
            //ask user for number
            System.out.println("Enter an odd number:");
            int number = input.nextInt();

            if(number % 2 == 0)
                throw new IllegalArgumentException(number + " is not odd!");

            //output number
            System.out.println(number);
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e){
            //serr+tab
            System.err.println("Invalid numerical value");
        }

        //try-catch statements
        //put code in try statements where: opening resources, getting user input
        //                                  use a method that can possible THROW an exception/error

    }

    static void example5() throws IllegalArgumentException, InputMismatchException{

        //ask user for number
        System.out.println("Enter an odd number:");
        int number = input.nextInt();

        if(number % 2 == 0)
            throw new IllegalArgumentException(number + " is not odd!");

        //output number
        System.out.println(number);


    }

    static void example6(){

        try{
            example5();
        }
        catch (IllegalArgumentException | InputMismatchException e){
            System.err.println("Error from Example 6: " + e.getMessage());
        }
    }

    static void checkDataLength(String data){
        if(data.length() > 10)
            throw new IllegalArgumentException(String.format("String of '%s' is too long", data));
    }
    static void getValueRange(double value){
        if(value < -10 || value > 10)
            throw new IllegalArgumentException(value + " is either less than -10 or greater than 10");
    }

    /**
     * Create a sum of all the values passed to it. If String, count letter, if numbers, add numbers.
     * Only going to accept a maximum value of +/- 10
     * @throws IllegalArgumentException if string length is greater than 10 or numerical values is either less than 10 or greater than 10
     * @param values any data type
     * @return a count of the param letter-count or values
     */
    static double total(Object ...values){  // ...values  : unlimited arguments

        double sum = 0;

        for(Object value : values){

            if(value instanceof String ){
                checkDataLength(((String) value));
                sum += ((String) value).length();
            }
            else if (value instanceof Integer){
                getValueRange((int)value);
                sum += ((int) value);
            }
            else if (value instanceof Float){
                getValueRange((float)value);
                sum += ((float) value);
            }
            else if (value instanceof Double){
                getValueRange((double)value);
                sum += ((double) value);
            }
            else{
                throw new IllegalArgumentException(values.getClass().getSimpleName() + " is not a valid data type for this method");
            }

        }

        //"hello", 1, 2.5, 3f => 11.5
        return sum;
    }

    //all exceptions from the java.lang & java.util package do not need to be explicitly caught

    static void example7(){

        try {
            double value = total(5f, "hello world", 1, 3.5, 2f);
            System.out.println("Total is " + value);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void main(String[] args) {

        //example7();
        total(5f, "hello world", 1, 3.5, 2f);

    }
}
