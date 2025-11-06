import java.util.Scanner;

public class KasirView {
    private Scanner input = new Scanner(System.in);

    public void tampilkanInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang  : " + stok);
    }

    public int inputJumlahPembelian() {
        System.out.println("Transaksi Pembelian");
        System.out.print("Jumlah barang : ");
        return input.nextInt();
    }

    public void tampilkanTotalBayar(int total) {
        System.out.println("Jumlah Bayar  : " + total);
    }
}
