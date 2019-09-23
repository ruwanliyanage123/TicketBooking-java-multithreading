public class TicketCounter {
    private int availableTickets = 5;

    public void getTicket(String ownerName, int numberOfTickets){
        if (availableTickets>=numberOfTickets && numberOfTickets>0 ){
            System.out.println("Congradulations "+ownerName+"You Have Booked "+numberOfTickets+" Successfully");
            availableTickets = availableTickets-numberOfTickets;
        }
        else{
            System.out.println("Sorry "+ownerName+"Yout Booking is not Success. Your"+numberOfTickets+" were cancel");
        }
    }
}
