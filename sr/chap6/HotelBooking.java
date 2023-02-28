package chap6;

public class HotelBooking extends Payment implements Booking  {
    private String name, address, telephone;

    @Override
    public boolean cancleBooking(int id) {
        return false;
    }

    @Override
    public void newBooking() {

    }

    @Override
    public boolean ubdateBooking(int id) {
        return false;
    }

    @Override
    public void printReceipt() {
    }

    public String getName() {
        return name;
    }

}

