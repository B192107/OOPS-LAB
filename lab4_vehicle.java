import java.util.Scanner;

class Vehicle {
    String company;
    String model;
    double mileage;
    double fuelCapacity;
    double displacement;

    public Vehicle(String company, String model, double mileage, double fuelCapacity, double displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }

    public void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Displacement: " + displacement + " cc");
    }
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    String userReviews;

    public TwoWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, String userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Front Brake: " + frontBrake);
        System.out.println("Rear Brake: " + rearBrake);
        System.out.println("Tyre Type: " + tyreType);
        System.out.println("Head Lamp: " + headLamp);
        System.out.println("User Reviews: " + userReviews);
    }
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    int airbags;
    boolean powerSteering;
    boolean rainSensingWiper;

    public FourWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                       boolean airConditioner, int airbags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airbags = airbags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Air Conditioner: " + airConditioner);
        System.out.println("Airbags: " + airbags);
        System.out.println("Power Steering: " + powerSteering);
        System.out.println("Rain Sensing Wiper: " + rainSensingWiper);
    }
}

public class lab4_vehicle{
    public static void main(String[] args) {
        TwoWheeler[] twoWheelers = new TwoWheeler[2];
        twoWheelers[0] = new TwoWheeler("Hero", "Splendor Plus", 80, 10, 97.2, "Drum", "Drum", "Tube", "Halogen", "Positive");
        twoWheelers[1] = new TwoWheeler("Honda", "Activa 6G", 60, 5.3, 109.51, "Drum", "Drum", "Tubeless", "LED", "Excellent");

        FourWheeler[] fourWheelers = new FourWheeler[2];
        fourWheelers[0] = new FourWheeler("Maruti Suzuki", "Swift", 23, 42, 1197, true, 2, true, true);
        fourWheelers[1] = new FourWheeler("Hyundai", "Creta", 18, 50, 1497, true, 6, true, true);

        // Display available vehicles
        System.out.println("Available 2-Wheelers:");
        displayAllVehicles(twoWheelers);
        System.out.println("\nAvailable 4-Wheelers:");
        displayAllVehicles(fourWheelers);

        // Let the user choose vehicles to compare
        Vehicle[] selectedVehicles = getSelectedVehicles(twoWheelers, fourWheelers);

        // Compare the selected vehicles
        if (selectedVehicles.length > 0) {
            if (selectedVehicles[0] instanceof TwoWheeler) {
                compareVehicles("2-wheeler", selectedVehicles);
            } else {
                compareVehicles("4-wheeler", selectedVehicles);
            }
        } else {
            System.out.println("No vehicles selected for comparison.");
        }
    }

    public static void displayAllVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i].company + " - " + vehicles[i].model);
        }
    }

    public static void compareVehicles(String vehicleType, Vehicle[] vehicles) {
        System.out.println("Comparing " + vehicleType + " vehicles:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicles[i].displayDetails();
        }
    }

    public static Vehicle[] getSelectedVehicles(TwoWheeler[] twoWheelers, FourWheeler[] fourWheelers) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = twoWheelers.length + fourWheelers.length;
        Vehicle[] selectedVehicles = new Vehicle[maxSize];
        int selectedCount = 0;

        while (true) {
            System.out.print("Enter the number of the vehicle to compare (0 to finish): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice >= 1 && choice <= twoWheelers.length) {
                selectedVehicles[selectedCount++] = twoWheelers[choice - 1];
            } else if (choice > twoWheelers.length && choice <= maxSize) {
                selectedVehicles[selectedCount++] = fourWheelers[choice - twoWheelers.length - 1];
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        Vehicle[] finalSelectedVehicles = new Vehicle[selectedCount];
        System.arraycopy(selectedVehicles, 0, finalSelectedVehicles, 0, selectedCount);
        return finalSelectedVehicles;
    }
}

