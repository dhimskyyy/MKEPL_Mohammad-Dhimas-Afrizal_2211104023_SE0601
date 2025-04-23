import java.util.Date;

public class BookingDetails {
    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private Date tanggalCheckin;
    private Date tanggalCheckout;
    private boolean statusAktif;
    private Voucher voucher;
    private boolean sudahDibayar;

    public BookingDetails(String jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam,
                          Date tanggalCheckin, Date tanggalCheckout, boolean statusAktif,
                          Voucher voucher, boolean sudahDibayar) {
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

    public String getJenisKamar() { return jenisKamar; }
    public int getJumlahTamu() { return jumlahTamu; }
    public int getJumlahMalam() { return jumlahMalam; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public Date getTanggalCheckin() { return tanggalCheckin; }
    public Date getTanggalCheckout() { return tanggalCheckout; }
    public boolean isStatusAktif() { return statusAktif; }
    public Voucher getVoucher() { return voucher; }
    public boolean isSudahDibayar() { return sudahDibayar; }
}