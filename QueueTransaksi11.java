public class QueueTransaksi11 {
    Transaksi11[] transaksiQueue;
    int front, rear, size, capacity;

    public QueueTransaksi11(int capacity) {
        this.capacity = capacity;
        transaksiQueue = new Transaksi11[capacity];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Transaksi11 transaksi) {
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
        int totalPertamax = 0;
        int totalPertalite = 0;
        int totalSolar = 0;
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            Transaksi11 t = transaksiQueue[index];
            System.out.println(t.nomorPlat + ": Rp " + (double)t.totalBayar);

            if (t.jenisBBM.equalsIgnoreCase("pertamax")) {
                totalPertamax += t.jumlahLiter;
            } else if (t.jenisBBM.equalsIgnoreCase("pertalite")) {
                totalPertalite += t.jumlahLiter;
            } else if (t.jenisBBM.equalsIgnoreCase("solar")) {
                totalSolar += t.jumlahLiter;
            }
        }
        System.out.println("Jumlah Transaksi yang diproses: " + size);
        System.out.println("Total pertamax yang dikeluarkan: " + totalPertamax + " liter");
        System.out.println("Total pertalite yang dikeluarkan: " + totalPertalite + " liter");
        System.out.println("Total solar yang dikeluarkan: " + totalSolar + " liter");
    }
}