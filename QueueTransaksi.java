public class QueueTransaksi {
    Transaksi[] transaksiQueue;
    int front, rear, size, capacity;

    public QueueTransaksi(int capacity) {
        this.capacity = capacity;
        transaksiQueue = new Transaksi[capacity];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Transaksi transaksi) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        transaksiQueue[rear] = transaksi;
        rear = (rear + 1) % capacity;
        size++;
    }

    public void tampilkanSemuaTransaksi() {
        System.out.println("-- Riwayat Transaksi --");
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println(transaksiQueue[index].nomorPlat + ": Rp " + (double)transaksiQueue[index].totalBayar);
        }
    }
}