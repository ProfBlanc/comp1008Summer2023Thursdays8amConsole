package wk9;

public abstract class Canine {

    private String name;
    private double weight;

    //abstract method named speak
    public Canine(){}
    public Canine(String name, double weight) {
//        this.name = name;
//        this.weight = weight;

        setName(name);
        setWeight(weight);
    }


    //create our getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    //
    public void setWeight(double weight) {

        if(weight < 0 || weight > 1000)
            throw new IllegalArgumentException(weight + " Is either too small or too big");

        this.weight = weight;
    }

    public abstract String speak(int numberOfTimes);

    //abstract void speed();


}
