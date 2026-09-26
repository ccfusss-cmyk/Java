import java.util.Scanner;

interface Rental {
    void rentVehicle();
    void returnVehicle();
}

interface PremiumRental extends Rental {
    void addPremiumService();
}

class CarRental implements PremiumRental {
    public void rentVehicle() {
        System.out.println("Car rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Car returned successfully.");
    }
    public void addPremiumService() {
        System.out.println("GPS and roadside assistance added.");
    }
}

class BikeRental implements PremiumRental {
    public void rentVehicle() {
        System.out.println("Bike rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
    public void addPremiumService() {
        System.out.println("Helmet and roadside assistance added.");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PremiumRental rental;
        System.out.println("===== VEHICLE RENTAL SYSTEM =====");
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("\nSelect Vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            rental = new CarRental();
        }
        else if (choice == 2) {
            rental = new BikeRental();
        }
        else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }
        System.out.println("\nCustomer: " + name);

        rental.rentVehicle();

        System.out.print("\nDo you want premium service? (yes/no): ");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) {
            rental.addPremiumService();
        }
        else {
            System.out.println("No premium service selected.");
        }

        System.out.print("\nDo you want to return the vehicle? (yes/no): ");
        answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            rental.returnVehicle();
        }
        else {
            System.out.println("Vehicle rental is still active.");
        }
        sc.close();
    }
}
