import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Buat info tamu
        GuestInfo tamu = new GuestInfo("Dhimas Afrizal", "1234567890", "08123456789", "dhimas@email.com", "Laki-laki");

        // Set tanggal check-in dan check-out
        Calendar cal = Calendar.getInstance();
        Date checkin = cal.getTime();
        cal.add(Calendar.DATE, 2);
        Date checkout = cal.getTime();
        TanggalBooking tanggalBooking = new TanggalBooking(checkin, checkout);

        // Buat voucher (kalau ada, kalau tidak null saja)
        Voucher voucher = new Voucher("PROMO50");

        // Buat detail booking
        BookingDetails detail = new BookingDetails(
            JenisKamar.DELUXE, 3, 2, 500000, tanggalBooking, true, voucher, true
        );

        // Buat pemesanan
        HotelRoomBooking booking = new HotelRoomBooking(tamu, detail);

        // Cetak detail
        booking.cetakDetailPemesanan();
    }
}
