// Q10. Overload a meothod book ticket for bus, train, and flight booking

public class TestTicketBooking {
    void bookTicket(String name, int seatNo){
        System.out.println("ticket booking for bus \n name : " + name + "\n seat no. :" + seatNo);
    }
    void bookTicket(String name, int seatNo, int trainNo){
        System.out.println("ticket booking for Train \n name : " + name + "\n train no: " + trainNo+ "\n seat no. :" + seatNo);
    }
    void bookTicket(String seatNo, String flightNo, String source , String destination){
        System.out.println("ticket booking for flight \n flight no : " + flightNo + "\n seat no. :" + seatNo + "\n source :" + source + "\n destination :" + destination);
    }

    public static void main(String[] args) {
        TestTicketBooking t = new TestTicketBooking();
        t.bookTicket("ABCD", 4);
        t.bookTicket("XYZ", 034, 012345);
        t.bookTicket("34D", "WE22Q1", "ASD", "QWE");
    }
    
}
