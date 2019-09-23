public class TicketCounter {
    private int availableTickets = 5;

    public synchronized void getTicket(String ownerName, int numberOfTickets){
        if (availableTickets>=numberOfTickets && numberOfTickets>0 ){
            System.out.println("Congradulations "+ownerName+ "Successfully");
            availableTickets = availableTickets-numberOfTickets;
        }
        else{
            System.out.println("Sorry "+ownerName+"cancel");
        }
    }
}
