public class NodeKendaraan {
    String nomorPlat;
    String jenisKendaraan;
    String merk;
    int jumlahLiter;
    NodeKendaraan next;

    public NodeKendaraan(String nomorPlat, String jenisKendaraan, String merk, int jumlahLiter) {
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
        this.jumlahLiter = jumlahLiter;
        this.next = null;
    }
}