import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SPBU spbu = new SPBU();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("");
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    spbu.antrian.tambahAntrian(plat, jenis, merk);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;

                case 2:
                    spbu.antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + spbu.antrian.hitungAntrian());
                    break;

                case 4:
                    NodeKendaraan dipanggil = spbu.antrian.panggilAntrian();
                    if (dipanggil != null) {
                        System.out.println("Petugas melayani " + dipanggil.nomorPlat);
                        System.out.print("Masukkan Jenis BBM: ");
                        String jenisBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        int harga = sc.nextInt();
                        System.out.print("Masukkan Jumlah liter: ");
                        int jumlahLiter = sc.nextInt();
                        sc.nextLine(); 
                        Transaksi t = new Transaksi(dipanggil.nomorPlat, jenisBBM, jumlahLiter, harga);
                        spbu.transaksiQueue.enqueue(t);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    }
                    break;

                case 5:
                    spbu.transaksiQueue.tampilkanSemuaTransaksi();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan SPBU.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}