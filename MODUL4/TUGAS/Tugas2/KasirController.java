public class KasirController {
    private KasirModel model;
    private KasirView view;

    public KasirController(KasirModel model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void tampilkanBarang() {
        view.tampilkanInfoBarang(model.getNamaBarang(), model.getHargaBarang(), model.getStokBarang());
    }

    public void prosesTransaksi() {
        int jumlahBeli = view.inputJumlahPembelian();
        model.kurangiStok(jumlahBeli);
        int total = model.hitungTotalBayar(jumlahBeli);
        view.tampilkanTotalBayar(total);
    }
}
