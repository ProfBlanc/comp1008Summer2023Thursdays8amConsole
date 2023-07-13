package wk9;

import java.util.Random;

public class Dog extends Canine implements Paws{

    public Dog(){}
    public Dog(String name, double weight){
        super(name, weight);
    }

    @Override
    public String speak(int numberOfTimes){
        return "bark ".repeat(numberOfTimes);
    }

    @Override
    public void walk(double distance) {
        System.out.println("Dog has walked " + distance + " kilometres");
    }

    @Override
    public double strike(int age, double clawLength) {
        return age * clawLength;
    }

    @Override
    public double dig() {
        return new Random().nextInt(1, 20);
    }
}
