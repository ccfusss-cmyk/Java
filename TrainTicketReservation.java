import java.util.Scanner;

class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}

public class TrainTicketReservation {
    public static void checkAge(int age)
            throws InvalidBookingException {
        if (age < 5 || age > 120) {
            throw new InvalidBookingException("Age must be between 5 and 120 years.");
        }
        System.out.println("Age verified successfully.");
    }

    public static void bookTickets(String name, int age, String source, String destination, int tickets, String seatType, int availableSeats)
            throws InvalidBookingException {
        if (tickets <= 0) {
            throw new InvalidBookingException("Number of tickets must be greater than zero.");
        }
        if (tickets > availableSeats) {
            throw new InvalidBookingException("Only " + availableSeats + " seats are available.");
        }
        if (source.equalsIgnoreCase(destination)) {
            throw new InvalidBookingException("Source and destination cannot be the same.");
        }
        double farePerTicket = 500;
        double totalFare = tickets * farePerTicket;
        System.out.println("\n===== BOOKING CONFIRMATION =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Passenger Age  : " + age);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Number of Tickets : " + tickets);
        System.out.println("Seat Preference : " + seatType);
        System.out.println("Fare per Ticket : ₹" + farePerTicket);
        System.out.println("Total Fare      : ₹" + totalFare);
        System.out.println("Booking Status  : CONFIRMED");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== TRAIN TICKET RESERVATION =====");

        try {
            System.out.print("Enter available seats: ");
            int availableSeats = sc.nextInt();
            sc.nextLine();
            if (availableSeats <= 0) {
                throw new InvalidBookingException("Available seats must be greater than zero.");
            }
            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();
            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();
            sc.nextLine();
            checkAge(age);
            System.out.print("Enter source: ");
            String source = sc.nextLine();
            System.out.print("Enter destination: ");
            String destination = sc.nextLine();
            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();
            System.out.println("\nSeat Preference");
            System.out.println("1. Window Seat");
            System.out.println("2. Aisle Seat");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            String seatType;
            if (choice == 1) {
                seatType = "Window Seat";
            }
            else if (choice == 2) {
                seatType = "Aisle Seat";
            }
            else {
                throw new InvalidBookingException("Invalid seat preference.");
            }
            bookTickets(name, age, source, destination, tickets, seatType, availableSeats);
            availableSeats = availableSeats - tickets;
            System.out.println("\nRemaining Available Seats: " + availableSeats);
            System.out.println("Booking completed successfully.");
        }
        catch (InvalidBookingException e) {
            System.out.println("\nBooking Failed: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("\nInvalid input! Please enter valid data.");
        }
        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
        System.out.println("Thank you for using the Train Ticket Reservation System.");
    }
}
