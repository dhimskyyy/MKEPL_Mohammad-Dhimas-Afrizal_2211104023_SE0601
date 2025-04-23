import java.util.Date;

public class HotelRoomBooking {

    private GuestInfo guestInfo;
    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private Voucher voucher;
    private boolean sudahDibayar;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private boolean statusAktif;

    public HotelRoomBooking(GuestInfo guestInfo, String jenisKamar, int jumlahTamu, int jumlahMalam,
                            double hargaPerMalam, Date tanggalCheckin, Date tanggalCheckout,
                            boolean statusAktif, Voucher voucher, boolean sudahDibayar) {

        this.guestInfo = guestInfo;
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.statusAktif = statusAktif;
        this.voucher = voucher;
        this.sudahDibayar = sudahDibayar;
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
        System.out.println("Jenis Kamar  : " + jenisKamar);
        System.out.println("Jumlah Tamu  : " + jumlahTamu);
        System.out.println("Jumlah Malam : " + jumlahMalam);
        System.out.println("Harga/Malam  : " + hargaPerMalam);
        System.out.println("Check-in     : " + tanggalCheckin);
        System.out.println("Check-out    : " + tanggalCheckout);
        System.out.println("Status Aktif : " + statusAktif);
    }

    private void cetakInfoPembayaran() {
        System.out.println("Voucher      : " + (voucher != null ? voucher.getKode() : "-"));
        System.out.println("Sudah Dibayar: " + sudahDibayar);
        System.out.println("Total Biaya  : Rp " + hitungTotalBiaya());
        System.out.println("Tipe Tamu    : " + klasifikasiTamu());
    }

    public void redeemVoucher(String kode) {
        // TODO: Implementasi redeem voucher
    }

    public void kirimEmailKonfirmasi() {
        // TODO: Implementasi pengiriman email konfirmasi
    }

    public double hitungTotalBiaya() {
        double total = hitungBiayaDasar();
        total += tambahBiayaTambahanTamu();
        total -= diskonVoucher();
        if (!statusAktif) {
            total = 0;
        }
        return total;
    }

    private double hitungBiayaDasar() {
        return hargaPerMalam * jumlahMalam;
    }

    private double tambahBiayaTambahanTamu() {
        return (jumlahTamu > 2) ? (jumlahTamu - 2) * 100000 : 0;
    }

    private double diskonVoucher() {
        return (voucher != null) ? voucher.getDiskon() : 0;
    }

    public String klasifikasiTamu() {
        if (jumlahTamu == 1)
            return "Individu";
        else if (jumlahTamu == 2)
            return "Pasangan";
        else
            return "Keluarga";
    }

    // Getter dan Setter

    public GuestInfo getGuestInfo() {
        return guestInfo;
    }

    public void setGuestInfo(GuestInfo guestInfo) {
        this.guestInfo = guestInfo;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getJumlahMalam() {
        return jumlahMalam;
    }

    public void setJumlahMalam(int jumlahMalam) {
        this.jumlahMalam = jumlahMalam;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public boolean isSudahDibayar() {
        return sudahDibayar;
    }

    public void setSudahDibayar(boolean sudahDibayar) {
        this.sudahDibayar = sudahDibayar;
    }

    public static class Builder {
        private GuestInfo guestInfo;
        private String jenisKamar;
        private int jumlahTamu;
        private int jumlahMalam;
        private double hargaPerMalam;
        private Date tanggalCheckin;
        private Date tanggalCheckout;
        private boolean statusAktif = true;
        private Voucher voucher;
        private boolean sudahDibayar = false;

        public Builder(GuestInfo guestInfo, String jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam) {
            this.guestInfo = guestInfo;
            this.jenisKamar = jenisKamar;
            this.jumlahTamu = jumlahTamu;
            this.jumlahMalam = jumlahMalam;
            this.hargaPerMalam = hargaPerMalam;
        }

        public Builder setTanggalCheckin(Date tanggalCheckin) {
            this.tanggalCheckin = tanggalCheckin;
            return this;
        }

        public Builder setTanggalCheckout(Date tanggalCheckout) {
            this.tanggalCheckout = tanggalCheckout;
            return this;
        }

        public Builder setStatusAktif(boolean statusAktif) {
            this.statusAktif = statusAktif;
            return this;
        }

        public Builder setVoucher(Voucher voucher) {
            this.voucher = voucher;
            return this;
        }

        public Builder setSudahDibayar(boolean sudahDibayar) {
            this.sudahDibayar = sudahDibayar;
            return this;
        }

        public HotelRoomBooking build() {
            return new HotelRoomBooking(
                guestInfo, jenisKamar, jumlahTamu, jumlahMalam, hargaPerMalam,
                tanggalCheckin, tanggalCheckout, statusAktif, voucher, sudahDibayar
            );
        }
    }
}