public class NodeKendaraan {
    String nomorPlat;
    String jenisKendaraan;
    String merk;
    NodeKendaraan next;

    public NodeKendaraan(String nomorPlat, String jenisKendaraan, String merk) {
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
        this.next = null;
    }
}