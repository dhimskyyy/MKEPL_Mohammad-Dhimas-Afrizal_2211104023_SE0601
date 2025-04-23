public class Voucher {
    private String kode;

    public Voucher(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public boolean isValid() {
        return kode != null && kode.length() > 3;
    }

    public double getDiskon() {
        return isValid() ? 50000 : 0;
    }

    @Override
    public String toString() {
        return kode;
    }
}
