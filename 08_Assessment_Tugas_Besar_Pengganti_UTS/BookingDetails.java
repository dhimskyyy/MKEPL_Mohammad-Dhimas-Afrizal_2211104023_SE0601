public class BookingDetails {
    private JenisKamar jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private TanggalBooking tanggalBooking;
    private boolean statusAktif;
    private Voucher voucher;
    private boolean sudahDibayar;

    public BookingDetails(JenisKamar jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam,
                          TanggalBooking tanggalBooking, boolean statusAktif,
                          Voucher voucher, boolean sudahDibayar) {
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.tanggalBooking = tanggalBooking;
        this.statusAktif = statusAktif;
        this.voucher = voucher;
        this.sudahDibayar = sudahDibayar;
    }

    public JenisKamar getJenisKamar() { return jenisKamar; }
    public int getJumlahTamu() { return jumlahTamu; }
    public int getJumlahMalam() { return jumlahMalam; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public TanggalBooking getTanggalBooking() { return tanggalBooking; }
    public boolean isStatusAktif() { return statusAktif; }
    public Voucher getVoucher() { return voucher; }
    public boolean isSudahDibayar() { return sudahDibayar; }
}
