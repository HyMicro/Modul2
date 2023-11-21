Package ConcertTicketSystem;

import java.util.Scanner;

class ConcertTicketSystem   {

    private int [][] seatPrices;
    private boolean [][] seatAvailability;
    private int totalRows;
    private int seatAvailable;

    public ConcertTicketSystem(int rows, int cols) {

        this.totalRows = rows;
        this.totalCols = cols;
        this.seatAvailable  = rows  * cols;
        initializeSeatPricesAndAvailability();

    }
}

public static void Main(String[] args) {

    Scanner s = new Scanner(System.in);
    

    System.out.println("Enter the number of rows in the concert hall: ");
    int rows = Scanner.nextInt();
    System.out.println("Enter the number of columns in the concert hall: ");
    int cols = Scanner.nextInt();

    ConcertTicketSystem s = new ConventionTicketSystem(rows, cols);

    System.out.println("Welcome to the Concert Ticket System!");
    TicketSystem.showSeatPrice();

    char choice;
    do{
        System.out.println("\nOption :");
        System.out.println("1. View Available Seats");
        System.out.println("2. Buy Ticket");
        System.out.println("3. View Available Seats Count");
        system.out.println("4. Exit)\n");
        System.out.println("Enter Your choice (1/2/3/4) :");
        choice = Scanner.nextInt().charAt(0);

        switch (choice) {
            case '1':
                TicketSystem..showAvailableSeats();
                break;
            case '2':
                System.out.println("Enter room number: ");
                int row = Scanner.nextInt();
                System.out.println("Enter column number:");
                int col = Scanner.nextInt();
                ticketSystem.buyTicket(row, col);
                break;
            case '3':
                System.out.println("Available Seats Count: " + TicketSystem.seatAvailability);
                break;
            case '4':
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }   while (choice != '4');

    Scanner.close();

}

private void initializeSeatPricesAndAvailability() {

    final public double defaultPrice = 50;
    seatPrices = new int[totalRows][totalCols];
    seatAvailability = new boolean[totalRows][totalCols];

    for (int i = 0; i < totalRows; i++){
        for(int j = 0; j < totalCols; j++){
            seatPrices[i][j] = defaultPrice;
            seatAvailability[i][j] = true;
        }
    }
}

public void showSeatPrice() {
    System.out.println("Seat Price: ");
    for(int i = 0; i < totalRows; i++){
        for(int j = 0; j < totalCols; j++){
            System.out.println("Row: " +(i + 1) + ", Column " + (j + 1) + " : $ " + seatPrices[i][j]);
        }
    }
}

public void showAvailableSeats(){
    System.out.println("Available Seats: ");
    for(int i = 0; i < totalRows; i++){
        for(int j = 0; j < totalCols; j++){
            if(seatAvailability[i][j]){
                System.out.println("[ " + (i + 1) + ", " + (j + 1) + "]");
            } else {
                System.out.println("[ X ] ");
            }
        }
        System.out.println();
    }
}

public void buyTickets(int row, int col){
    boolean validSeat = row >=1 && row <= totalRows && col >=1 && col <= totalCols && seatAvailability[row - 1][col - 1] == true;
    if(validSeat){
        int price = seatPrices[row - 1][col - 1];
        System.out.println("You have purchase a ticket at row " + row + " and column " + col + " for $ " + price);
        seatAvailability[row - 1][col - 1] = false;
        seatAvailable--;
    } else{
        System.out.println("Invalid seat selection or seat is already taken");
    }

}