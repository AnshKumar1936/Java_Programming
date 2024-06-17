class TicketBooking {
    private int totalSeats;
    private float totalCost;
    int initialSeats;
    public TicketBooking(int initialSeats) {
        this.totalSeats = initialSeats;
        this.totalCost = 0;
    }
    public synchronized void bookSeats(int numSeats, double ticketPrice) {
        if (numSeats > 0 && numSeats <= totalSeats) {
            totalSeats =totalSeats- numSeats;
            double cost = numSeats * ticketPrice;
            totalCost += cost;
            System.out.println(numSeats + " seat(s) booked. Total cost: " + cost);
        } else {
            System.out.println("Not enough seats available.");
        }
    }
    public synchronized void display() {
        System.out.println("Total seats booked: " + (initialSeats - totalSeats));
        System.out.println("Total cost: " + totalCost);
    }
}
    public class Ticket {
        public static void main(String[] args) {
            TicketBooking ticketBooking = new TicketBooking(50);
            Thread bookingThread1 = new Thread(() -> ticketBooking.bookSeats(5, 20.0));
            Thread bookingThread2 = new Thread(() -> ticketBooking.bookSeats(10, 25.0));
            Thread bookingThread3 = new Thread(() -> ticketBooking.bookSeats(8, 18.0));
            bookingThread1.start();
            bookingThread2.start();
            bookingThread3.start();
             try {
            bookingThread1.join();
            bookingThread2.join();
            bookingThread3.join();
            }
             catch (InterruptedException e){
            e.printStackTrace();
             }
            ticketBooking.display();
    }
}