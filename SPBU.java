public class SPBU {
    LinkedListAntrian antrian;
    QueueTransaksi transaksiQueue;

    public SPBU() {
        antrian = new LinkedListAntrian();
        transaksiQueue = new QueueTransaksi(100);
    }
}