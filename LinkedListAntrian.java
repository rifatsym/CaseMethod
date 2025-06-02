public class LinkedListAntrian {
    NodeKendaraan front, rear;

    public LinkedListAntrian() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void tambahAntrian(String plat, String jenis, String merk, int liter) {
        NodeKendaraan baru = new NodeKendaraan(plat, jenis, merk, liter);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
    }

    public NodeKendaraan panggilAntrian() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
            return null;
        }
        NodeKendaraan temp = front;
        front = front.next;
        if (front == null) rear = null;
        return temp;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
            return;
        }
        System.out.println("-- Daftar Antrian Kendaraan --");
        NodeKendaraan current = front;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor++ + ". Plat: " + current.nomorPlat + ", Jenis: " + current.jenisKendaraan + ", Merk: " + current.merk);
            current = current.next;
        }
    }

    public int hitungAntrian() {
        int count = 0;
        NodeKendaraan current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}