import java.util.Scanner;

public class Week3 {


    static void example1(){

        /*
        Ask the user to input a temperature.
        DETERMINE if the temperature is
            lt 0
                tell user to wear a winter coat
            bt 0-10
                tell user to wear a light coat
            bt 11-20
                tell user to wear a long-sleeve t-shirt
            gt 21
                tell user to wear short sleeve
            We need 3 variables
                Scanner: take user input
                double/float: get temperature value
                String: store whatToWear


         */
        Scanner input = new Scanner(System.in);
        double temperature = 0;
        String whatToWear = "short sleeve";
        System.out.println("Enter a temperature");
        temperature = input.nextDouble();

        if(temperature < 0)
            whatToWear = "Winter Coat";
        else if(temperature < 11)
            whatToWear = "light coat";
        else if(temperature <= 20)
            whatToWear = "long-sleeve";
//        else
//            whatToWear = "short sleeve";

        System.out.println(whatToWear);
    }

    static void example2(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a season");
        String season = input.nextLine();
        String whatToWear = "";
        switch (season.toLowerCase()){
            case "spring":
                whatToWear = "long sleeve";
                break;
            case "winter":
                whatToWear = "winter coat";
                break;
            case "fall":
                whatToWear = "light coat";
                break;
            default:
                whatToWear = "t-shirt";
                break;
        }

        System.out.printf("In %s, you should wear a %s%n",
                season, whatToWear);

    }
    static void example3(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a season");
        String season = input.nextLine();
        String whatToWear = switch (season.toLowerCase()){
            case "spring":
                yield  "long sleeve";
            case "winter":
                yield  "winter coat";
            case "fall":
                yield  "light coat";
            default:
                yield  "t-shirt";
        };

        System.out.printf("In %s, you should wear a %s%n",
                season, whatToWear);

    }
    void method1(){}
    public static void main(String[] args) {

        example3();

//        Week3 wk3 = new Week3();
//        wk3.method1();
    }
}
