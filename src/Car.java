public class Car {

    /*
    	color
	number of doors
	weight
	model
	number of cylinders
	year
	horse power engine
	seats
	color
	number of doors
	weight
	model
	number of cylinders
	year
	horse power engine
	seats
     */
    String color, model, make;
    private float horsePowerEngine;
    private byte seats, doors;
    private short year;
    private double weight, price;

    private int kilometres;

    //getters and setters
    /*
    in CS
    public int Kilometres{
    get;
    set{ this.Kilometres = value ? value > 1 : 0}
    }
     */

    //alt+insert
    //right-click => Generate


    public float getHorsePowerEngine() {
        return horsePowerEngine;
    }

    public void setHorsePowerEngine(float a) {

        if(horsePowerEngine > 1.1f)
            this.horsePowerEngine = horsePowerEngine;


    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getKilometres() {
        return kilometres;
    }

    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }
}
