public class NodeKendaraan11 {
    String nomorPlat;
    String jenisKendaraan;
    String merk;
    NodeKendaraan11 next;

    public NodeKendaraan11(String nomorPlat, String jenisKendaraan, String merk) {
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
        this.next = null;
    }
}