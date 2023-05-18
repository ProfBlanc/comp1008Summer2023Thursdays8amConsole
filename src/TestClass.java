public class TestClass {

    private int first = 100;
    private double second = 12.345;
    private String third = "Hello";

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    TestClass(){}

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass.getFirst()); //0
        System.out.println(testClass.getSecond()); //0.0
        System.out.println(testClass.getThird()); //null
    }

}
