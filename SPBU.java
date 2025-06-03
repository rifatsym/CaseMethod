public class SPBU {
    LinkedListAntrian antrian;
    QueueTransaksi transaksiQueue;

    public SPBU() {
        antrian = new LinkedListAntrian();
        transaksiQueue = new QueueTransaksi(100);
    }

    public int getHargaBBM(String jenis) {
        switch (jenis.toLowerCase()) {
            case "pertalite": return 10000;
            case "pertamax": return 13000;
            case "solar": return 9000;
            default: return 0;
        }
    }
}
