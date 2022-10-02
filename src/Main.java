import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");
        double inputMeters = reader.nextDouble();

        double conversionMiles = inputMeters * 0.00062137;
        double conversionFeet = inputMeters * 3.28084;
        double conversionInches = inputMeters * 39.3701;

        System.out.println(conversionMiles + " miles");
        System.out.println(conversionFeet + " feet");
        System.out.println(conversionInches + " inches");
    }
}