public class Counter {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread ticketBookingThread1 = new TicketBookingThread(ticketCounter,"ruwan",3);
        TicketBookingThread ticketBookingThread2 = new TicketBookingThread(ticketCounter,"liyanage",3);
        ticketBookingThread1.start();
        ticketBookingThread2.start();
    }
}
