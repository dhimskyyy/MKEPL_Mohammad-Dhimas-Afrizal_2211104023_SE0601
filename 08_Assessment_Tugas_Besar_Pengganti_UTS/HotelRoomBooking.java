public class HotelRoomBooking {

    private GuestInfo guestInfo;
    private BookingDetails bookingDetails;

    public HotelRoomBooking(GuestInfo guestInfo, BookingDetails bookingDetails) {
        this.guestInfo = guestInfo;
        this.bookingDetails = bookingDetails;
    }

    public void cetakDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN KAMAR =====");
        cetakInfoTamu();
        cetakInfoKamar();
        cetakInfoPembayaran();
        System.out.println("===================================");
    }

    private void cetakInfoTamu() {
        System.out.println("Nama Pemesan : " + guestInfo.getNama());
        System.out.println("Jenis Kelamin: " + guestInfo.getJenisKelamin());
        System.out.println("No. KTP      : " + guestInfo.getNomorKTP());
        System.out.println("Telepon      : " + guestInfo.getNomorTelepon());
        System.out.println("Email        : " + guestInfo.getEmail());
    }

    private void cetakInfoKamar() {
        System.out.println("Jenis Kamar  : " + bookingDetails.getJenisKamar());
        System.out.println("Jumlah Tamu  : " + bookingDetails.getJumlahTamu());
        System.out.println("Jumlah Malam : " + bookingDetails.getJumlahMalam());
        System.out.println("Harga/Malam  : " + bookingDetails.getHargaPerMalam());
        System.out.println("Check-in     : " + bookingDetails.getTanggalBooking().getCheckin());
        System.out.println("Check-out    : " + bookingDetails.getTanggalBooking().getCheckout());
        System.out.println("Status Aktif : " + bookingDetails.isStatusAktif());
    }    

    private void cetakInfoPembayaran() {
        System.out.println("Voucher      : " + (bookingDetails.getVoucher() != null ? bookingDetails.getVoucher().getKode() : "-"));
        System.out.println("Sudah Dibayar: " + bookingDetails.isSudahDibayar());
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
    }

    public double hitungTotalBiaya() {
        if (!bookingDetails.isStatusAktif()) return 0;

        double total = bookingDetails.getHargaPerMalam() * bookingDetails.getJumlahMalam();
        total += (bookingDetails.getJumlahTamu() > 2) ? (bookingDetails.getJumlahTamu() - 2) * 100_000 : 0;
        total -= (bookingDetails.getVoucher() != null && bookingDetails.getVoucher().getKode().length() > 3) ? 50_000 : 0;

        return total;
    }

    public String klasifikasiTamu() {
        int jumlahTamu = bookingDetails.getJumlahTamu();
        if (jumlahTamu == 1) return "Individu";
        else if (jumlahTamu == 2) return "Pasangan";
        else return "Keluarga";
    }
}
