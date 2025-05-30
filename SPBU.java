import java.util.Scanner;

public class SPBU {
    LinkedListAntrian antrian;
    QueueTransaksi transaksiQueue;

    public SPBU() {
        antrian = new LinkedListAntrian();
        transaksiQueue = new QueueTransaksi(100); // kapasitas riwayat transaksi
    }

    public int getHargaBBM(String jenis) {
        switch (jenis.toLowerCase()) {
            case "pertalite": return 10000;
            case "pertamax": return 13000;
            case "solar": return 9000;
            default: return 0;
        }
    }

    public void jalankanMenu() {
        // Scanner sc = new Scanner(System.in);
        // int pilihan;

        // do {
        //     System.out.println("\n=== MENU SPBU ===");
        //     System.out.println("1. Tambah Antrian Kendaraan");
        //     System.out.println("2. Lihat Antrian");
        //     System.out.println("3. Panggil Antrian & Transaksi");
        //     System.out.println("4. Lihat Riwayat Transaksi");
        //     System.out.println("5. Keluar");
        //     System.out.print("Pilih menu: ");
        //     pilihan = sc.nextInt();
        //     sc.nextLine(); // konsumsi newline

        //     switch (pilihan) {
        //         case 1:
        //             System.out.print("Masukkan plat nomor: ");
        //             String plat = sc.nextLine();
        //             System.out.print("Masukkan jenis kendaraan: ");
        //             String jenis = sc.nextLine();
        //             System.out.print("Masukkan jumlah liter BBM: ");
        //             int liter = sc.nextInt();
        //             antrian.tambahAntrian(plat, jenis, liter);
        //             break;

        //         case 2:
        //             antrian.tampilkanAntrian();
        //             System.out.println("Total antrian: " + antrian.hitungAntrian());
        //             break;

        //         case 3:
        //             NodeKendaraan dipanggil = antrian.panggilAntrian();
        //             if (dipanggil != null) {
        //                 String jenisBBM;
        //                 if (dipanggil.jenisKendaraan.equalsIgnoreCase("motor")) {
        //                     jenisBBM = "pertalite";
        //                 } else if (dipanggil.jenisKendaraan.equalsIgnoreCase("mobil")) {
        //                     jenisBBM = "pertamax";
        //                 } else {
        //                     jenisBBM = "solar";
        //                 }
        //                 int harga = getHargaBBM(jenisBBM);
        //                 Transaksi t = new Transaksi(dipanggil.nomorPlat, jenisBBM, dipanggil.jumlahLiter, harga);
        //                 t.tampilkanStruk();
        //                 transaksiQueue.enqueue(t);
        //             }
        //             break;

        //         case 4:
        //             transaksiQueue.tampilkanSemuaTransaksi();
        //             break;

        //         case 5:
        //             System.out.println("Terima kasih telah menggunakan layanan SPBU.");
        //             break;

        //         default:
        //             System.out.println("Pilihan tidak valid.");
        //     }
        // } while (pilihan != 5);
    }
}
