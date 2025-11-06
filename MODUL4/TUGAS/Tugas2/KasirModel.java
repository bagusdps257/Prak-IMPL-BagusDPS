public class KasirModel {
    private String namaBarang;
    private int hargaBarang;
    private int stokBarang;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public void kurangiStok(int jumlah) {
        this.stokBarang -= jumlah;
    }

    public int hitungTotalBayar(int jumlah) {
        return hargaBarang * jumlah;
    }
}
