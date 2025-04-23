import java.util.Date;

public class TanggalBooking {
    private Date checkin;
    private Date checkout;

    public TanggalBooking(Date checkin, Date checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }
}
