public class GuestInfo {
    private String nama;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private String jenisKelamin;

    public GuestInfo(String nama, String nomorKTP, String nomorTelepon, String email, String jenisKelamin) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
