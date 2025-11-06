public class MVCKasirDemo {
    public static void main(String[] args) {
        // Model
        KasirModel model = new KasirModel();
        model.setNamaBarang("GeForce GTX 1060Ti");
        model.setHargaBarang(3000);
        model.setStokBarang(10);

        // View
        KasirView view = new KasirView();

        // Controller
        KasirController controller = new KasirController(model, view);

        // Proses
        controller.tampilkanBarang();
        controller.prosesTransaksi();
        controller.tampilkanBarang();
    }
}
