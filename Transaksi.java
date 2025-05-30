public class Transaksi {
    String nomorPlat;
    String jenisBBM;
    int jumlahLiter;
    int hargaPerLiter;
    int totalBayar;

    public Transaksi(String nomorPlat, String jenisBBM, int jumlahLiter, int hargaPerLiter) {
        this.nomorPlat = nomorPlat;
        this.jenisBBM = jenisBBM;
        this.jumlahLiter = jumlahLiter;
        this.hargaPerLiter = hargaPerLiter;
        this.totalBayar = jumlahLiter * hargaPerLiter;
    }

    public void tampilkanStruk() {
        System.out.println("===== STRUK TRANSAKSI =====");
        System.out.println("Plat Nomor : " + nomorPlat);
        System.out.println("Jenis BBM  : " + jenisBBM);
        System.out.println("Jumlah     : " + jumlahLiter + " liter");
        System.out.println("Harga/Liter: Rp" + hargaPerLiter);
        System.out.println("Total Bayar: Rp" + totalBayar);
        System.out.println("===========================");
    }
}
