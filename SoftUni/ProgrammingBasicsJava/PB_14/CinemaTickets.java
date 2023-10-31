package PB_14;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTicketBought = 0, studentTicketsBought = 0, standardTicketsBought = 0, kidTicketsBought = 0;

        while (!input.equals("Finish")){

            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsBought = 0;
            String seatType = scanner.nextLine();
            while (!seatType.equals("End")){

                switch (seatType){
                    case "student":
                        totalTicketBought++;
                        studentTicketsBought++;
                        ticketsBought++;
                        break;
                    case "standard":
                        totalTicketBought++;
                        standardTicketsBought++;
                        ticketsBought++;
                        break;
                    case "kid":
                        totalTicketBought++;
                        kidTicketsBought++;
                        ticketsBought++;
                        break;
                    default:
                        break;
                }
                if (ticketsBought == freeSeats)
                    break;
                seatType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", input, ticketsBought*1.0/freeSeats*100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTicketBought);
        System.out.printf("%.2f%% student tickets.%n", studentTicketsBought*1.0/totalTicketBought*100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsBought*1.0/totalTicketBought*100);
        System.out.printf("%.2f%% kids tickets.%n", kidTicketsBought*1.0/totalTicketBought*100);
    }
}
