public class LinkedListAntrian11 {
    NodeKendaraan11 front, rear;

    public LinkedListAntrian11() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void tambahAntrian(String plat, String jenis, String merk) {
        NodeKendaraan11 baru = new NodeKendaraan11(plat, jenis, merk);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
    }

    public NodeKendaraan11 panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        NodeKendaraan11 temp = front;
        front = front.next;
        if (front == null) rear = null;
        return temp;
    }

    public void tampilkanAntrian() {
        System.out.println("-- Antrian Kendaraan --");
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Kendaraan:");
        NodeKendaraan11 current = front;
        while (current != null) {
            System.out.println("Plat Nomor: " + current.nomorPlat);
            System.out.println("Tipe: " + current.jenisKendaraan);
            System.out.println("Merk: " + current.merk);
            current = current.next;
            if (current != null) System.out.println();
        }
    }

    public int hitungAntrian() {
        int count = 0;
        NodeKendaraan11 current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}