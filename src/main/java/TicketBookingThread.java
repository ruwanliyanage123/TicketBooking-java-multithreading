public class TicketBookingThread extends Thread{
    private TicketCounter ticketCounter;
    private String ownerName;
    private int numberOfTickets;

    TicketBookingThread(TicketCounter ticketCounter, String ownerName, int numberOfTickets){
        this.ticketCounter = ticketCounter;
        this.ownerName     = ownerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        super.run();
        ticketCounter.getTicket(ownerName,numberOfTickets);
    }
}
