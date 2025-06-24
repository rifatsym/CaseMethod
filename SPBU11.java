public class SPBU11 {
    LinkedListAntrian11 antrian;
    QueueTransaksi11 transaksiQueue;

    public SPBU11() {
        antrian = new LinkedListAntrian11();
        transaksiQueue = new QueueTransaksi11(100);
    }
}