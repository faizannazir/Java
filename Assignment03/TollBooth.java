import java.util.Scanner;

public class TollBooth {
//    instance variables
    private int numberOfCars;
    private int numberOfBuses;
    private int numberOfTrucks;
    private int numberOfVans;
    private int amountForCars;
    private int amountForBuses;
    private int amountForTrucks;
    private int amountForVans;

// Constructor
    TollBooth()
    {
        numberOfCars = 0;
        numberOfBuses = 0;
        numberOfTrucks = 0;
        numberOfVans = 0;
        amountForCars = 0;
        amountForBuses = 0;
        amountForTrucks = 0;
        amountForVans = 0;
    }

    //payingVehicle method
    public void payingVehicle(char vehicleType)
    {
        switch (vehicleType)
        {
            case 'C':
                numberOfCars++;
                amountForCars= amountForCars + 25;
                break;
            case 'B':
                numberOfBuses++;
                amountForBuses= amountForBuses + 75;
                break;
            case 'T':
                numberOfTrucks++;
                amountForTrucks= amountForTrucks + 100;
                break;
            case 'V':
                numberOfVans++;
                amountForVans= amountForVans + 25;
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
    }
//    nonpayingVehicle method
    public void nonpayingVehicle(char vehicleType)
    {
        switch (vehicleType) {
            case 'C':
                numberOfCars++;
                break;
            case 'B':
                numberOfBuses++;
                break;
            case 'T':
                numberOfTrucks++;
                break;
            case 'V':
                numberOfVans++;
                break;
            default:
                System.out.println("Invalid Vehicle Type");
                break;
        }
    }
//    displayReport Method
    public void displayReport()
    {
        System.out.println("Number of cars passed: " + numberOfCars);
        System.out.println("Number of buses passed: " + numberOfBuses);
        System.out.println("Number of vans passed: " + numberOfVans);
        System.out.println("Number of trucks passed: " + numberOfTrucks);
        System.out.println("Amount collected from cars: " + amountForCars);
        System.out.println("Amount collected from vans: " + amountForVans);
        System.out.println("Amount collected from buses: " + amountForBuses);
        System.out.println("Amount collected from trucks: " + amountForTrucks);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBooth tollBooth = new TollBooth();

        while (true) {
            System.out.println("Press 'P' for paying vehicles, 'N' for nonpaying vehicles, or 'E' to exit.");
            char input = scanner.next().charAt(0);
            if (input == 'E') {
                break;
            }
            System.out.println("Press 'C' for car, 'V' for van, 'B' for bus, or 'T' for truck.");
            char vehicleType = scanner.next().charAt(0);
            if (input == 'P') {
                tollBooth.payingVehicle(vehicleType);
            } else if (input == 'N') {
                tollBooth.nonpayingVehicle(vehicleType);
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }

        tollBooth.displayReport();
    }
}
