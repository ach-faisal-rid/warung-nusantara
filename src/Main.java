import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==========================================
        // DATA MENU RESTORAN
        // ==========================================

        Menu[] daftarMenu = {
                new Menu("Nasi Goreng", 25000, "Makanan"),
                new Menu("Nasi Padang", 30000, "Makanan"),
                new Menu("Ayam Bakar", 35000, "Makanan"),
                new Menu("Mie Goreng", 22000, "Makanan"),

                new Menu("Es Teh", 8000, "Minuman"),
                new Menu("Es Jeruk", 10000, "Minuman"),
                new Menu("Kopi Hitam", 12000, "Minuman"),
                new Menu("Jus Alpukat", 15000, "Minuman")
        };

        // ==========================================
        // MENAMPILKAN DAFTAR MENU
        // ==========================================

        System.out.println("==========================================");
        System.out.println("       WARUNG NUSANTARA");
        System.out.println("==========================================");

        System.out.println("\n--- MENU MAKANAN ---");

        daftarMenu[0].tampilkanMenu();
        daftarMenu[1].tampilkanMenu();
        daftarMenu[2].tampilkanMenu();
        daftarMenu[3].tampilkanMenu();

        System.out.println("\n--- MENU MINUMAN ---");

        daftarMenu[4].tampilkanMenu();
        daftarMenu[5].tampilkanMenu();
        daftarMenu[6].tampilkanMenu();
        daftarMenu[7].tampilkanMenu();

        // ==========================================
        // INPUT PESANAN
        // Maksimal 4 menu
        // ==========================================

        System.out.println("\n==========================================");
        System.out.println("           PEMESANAN MENU");
        System.out.println("==========================================");
        System.out.println("Masukkan nama menu sesuai daftar.");
        System.out.println("Contoh: Nasi Padang");
        System.out.println();

        System.out.print("Pesanan 1 : ");
        String pesanan1 = input.nextLine();
        System.out.print("Jumlah     : ");
        int jumlah1 = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 2 : ");
        String pesanan2 = input.nextLine();
        System.out.print("Jumlah     : ");
        int jumlah2 = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 3 : ");
        String pesanan3 = input.nextLine();
        System.out.print("Jumlah     : ");
        int jumlah3 = input.nextInt();
        input.nextLine();

        System.out.print("\nPesanan 4 : ");
        String pesanan4 = input.nextLine();
        System.out.print("Jumlah     : ");
        int jumlah4 = input.nextInt();

        // ==========================================
        // MENENTUKAN HARGA PESANAN
        // ==========================================

        double harga1 = 0;
        double harga2 = 0;
        double harga3 = 0;
        double harga4 = 0;

        String kategori1 = "";
        String kategori2 = "";
        String kategori3 = "";
        String kategori4 = "";

        // Pesanan 1
        if (pesanan1.equalsIgnoreCase("Nasi Goreng")) {
            harga1 = 25000;
            kategori1 = "Makanan";
        } else if (pesanan1.equalsIgnoreCase("Nasi Padang")) {
            harga1 = 30000;
            kategori1 = "Makanan";
        } else if (pesanan1.equalsIgnoreCase("Ayam Bakar")) {
            harga1 = 35000;
            kategori1 = "Makanan";
        } else if (pesanan1.equalsIgnoreCase("Mie Goreng")) {
            harga1 = 22000;
            kategori1 = "Makanan";
        } else if (pesanan1.equalsIgnoreCase("Es Teh")) {
            harga1 = 8000;
            kategori1 = "Minuman";
        } else if (pesanan1.equalsIgnoreCase("Es Jeruk")) {
            harga1 = 10000;
            kategori1 = "Minuman";
        } else if (pesanan1.equalsIgnoreCase("Kopi Hitam")) {
            harga1 = 12000;
            kategori1 = "Minuman";
        } else if (pesanan1.equalsIgnoreCase("Jus Alpukat")) {
            harga1 = 15000;
            kategori1 = "Minuman";
        }

        // Pesanan 2
        if (pesanan2.equalsIgnoreCase("Nasi Goreng")) {
            harga2 = 25000;
            kategori2 = "Makanan";
        } else if (pesanan2.equalsIgnoreCase("Nasi Padang")) {
            harga2 = 30000;
            kategori2 = "Makanan";
        } else if (pesanan2.equalsIgnoreCase("Ayam Bakar")) {
            harga2 = 35000;
            kategori2 = "Makanan";
        } else if (pesanan2.equalsIgnoreCase("Mie Goreng")) {
            harga2 = 22000;
            kategori2 = "Makanan";
        } else if (pesanan2.equalsIgnoreCase("Es Teh")) {
            harga2 = 8000;
            kategori2 = "Minuman";
        } else if (pesanan2.equalsIgnoreCase("Es Jeruk")) {
            harga2 = 10000;
            kategori2 = "Minuman";
        } else if (pesanan2.equalsIgnoreCase("Kopi Hitam")) {
            harga2 = 12000;
            kategori2 = "Minuman";
        } else if (pesanan2.equalsIgnoreCase("Jus Alpukat")) {
            harga2 = 15000;
            kategori2 = "Minuman";
        }

        // Pesanan 3
        if (pesanan3.equalsIgnoreCase("Nasi Goreng")) {
            harga3 = 25000;
            kategori3 = "Makanan";
        } else if (pesanan3.equalsIgnoreCase("Nasi Padang")) {
            harga3 = 30000;
            kategori3 = "Makanan";
        } else if (pesanan3.equalsIgnoreCase("Ayam Bakar")) {
            harga3 = 35000;
            kategori3 = "Makanan";
        } else if (pesanan3.equalsIgnoreCase("Mie Goreng")) {
            harga3 = 22000;
            kategori3 = "Makanan";
        } else if (pesanan3.equalsIgnoreCase("Es Teh")) {
            harga3 = 8000;
            kategori3 = "Minuman";
        } else if (pesanan3.equalsIgnoreCase("Es Jeruk")) {
            harga3 = 10000;
            kategori3 = "Minuman";
        } else if (pesanan3.equalsIgnoreCase("Kopi Hitam")) {
            harga3 = 12000;
            kategori3 = "Minuman";
        } else if (pesanan3.equalsIgnoreCase("Jus Alpukat")) {
            harga3 = 15000;
            kategori3 = "Minuman";
        }

        // Pesanan 4
        if (pesanan4.equalsIgnoreCase("Nasi Goreng")) {
            harga4 = 25000;
            kategori4 = "Makanan";
        } else if (pesanan4.equalsIgnoreCase("Nasi Padang")) {
            harga4 = 30000;
            kategori4 = "Makanan";
        } else if (pesanan4.equalsIgnoreCase("Ayam Bakar")) {
            harga4 = 35000;
            kategori4 = "Makanan";
        } else if (pesanan4.equalsIgnoreCase("Mie Goreng")) {
            harga4 = 22000;
            kategori4 = "Makanan";
        } else if (pesanan4.equalsIgnoreCase("Es Teh")) {
            harga4 = 8000;
            kategori4 = "Minuman";
        } else if (pesanan4.equalsIgnoreCase("Es Jeruk")) {
            harga4 = 10000;
            kategori4 = "Minuman";
        } else if (pesanan4.equalsIgnoreCase("Kopi Hitam")) {
            harga4 = 12000;
            kategori4 = "Minuman";
        } else if (pesanan4.equalsIgnoreCase("Jus Alpukat")) {
            harga4 = 15000;
            kategori4 = "Minuman";
        }

        // ==========================================
        // MENGHITUNG TOTAL SETIAP PESANAN
        // ==========================================

        double total1 = harga1 * jumlah1;
        double total2 = harga2 * jumlah2;
        double total3 = harga3 * jumlah3;
        double total4 = harga4 * jumlah4;

        double subtotal = total1 + total2 + total3 + total4;

        // ==========================================
        // PERHITUNGAN DISKON
        // ==========================================

        double diskon = 0;

        if (subtotal > 100000) {
            diskon = subtotal * 0.10;
        }

        double setelahDiskon = subtotal - diskon;

        // ==========================================
        // PROMO MINUMAN
        // ==========================================

        int gratis = 0;

        if (subtotal > 50000) {

            // Nested if untuk mengecek minuman
            if (kategori1.equals("Minuman") && jumlah1 >= 2) {
                gratis = 1;
            } else if (kategori2.equals("Minuman") && jumlah2 >= 2) {
                gratis = 1;
            } else if (kategori3.equals("Minuman") && jumlah3 >= 2) {
                gratis = 1;
            } else if (kategori4.equals("Minuman") && jumlah4 >= 2) {
                gratis = 1;
            }
        }

        // ==========================================
        // PAJAK DAN BIAYA PELAYANAN
        // ==========================================

        double pajak = setelahDiskon * 0.10;
        double pelayanan = 20000;

        double totalBayar = setelahDiskon + pajak + pelayanan;

        // ==========================================
        // MENENTUKAN STATUS PESANAN
        // CONTOH SWITCH CASE
        // ==========================================

        int jumlahJenisPesanan = 4;

        String statusPesanan;

        switch (jumlahJenisPesanan) {
            case 1:
                statusPesanan = "1 jenis menu";
                break;
            case 2:
                statusPesanan = "2 jenis menu";
                break;
            case 3:
                statusPesanan = "3 jenis menu";
                break;
            case 4:
                statusPesanan = "4 jenis menu";
                break;
            default:
                statusPesanan = "Tidak diketahui";
        }

        // ==========================================
        // CETAK STRUK
        // ==========================================

        System.out.println("\n\n==========================================");
        System.out.println("             STRUK PEMBAYARAN");
        System.out.println("           WARUNG NUSANTARA");
        System.out.println("==========================================");

        System.out.println("Status pesanan : " + statusPesanan);
        System.out.println("------------------------------------------");

        System.out.printf("%-18s %5s %12s%n", "Menu", "Qty", "Total");

        System.out.printf("%-18s %5d Rp %,10.0f%n",
                pesanan1, jumlah1, total1);

        System.out.printf("%-18s %5d Rp %,10.0f%n",
                pesanan2, jumlah2, total2);

        System.out.printf("%-18s %5d Rp %,10.0f%n",
                pesanan3, jumlah3, total3);

        System.out.printf("%-18s %5d Rp %,10.0f%n",
                pesanan4, jumlah4, total4);

        System.out.println("------------------------------------------");

        System.out.printf("%-25s Rp %,10.0f%n",
                "Subtotal", subtotal);

        if (diskon > 0) {
            System.out.printf("%-25s Rp %,10.0f%n",
                    "Diskon 10%", diskon);

            System.out.printf("%-25s Rp %,10.0f%n",
                    "Harga setelah diskon", setelahDiskon);
        } else {
            System.out.println("Diskon 10%       : Tidak mendapatkan");
        }

        if (gratis > 0) {
            System.out.println("Promo minuman    : Beli 1 Gratis 1");
            System.out.println("Minuman gratis   : 1 item");
        } else {
            System.out.println("Promo minuman    : Tidak mendapatkan");
        }

        System.out.printf("%-25s Rp %,10.0f%n",
                "Pajak 10%", pajak);

        System.out.printf("%-25s Rp %,10.0f%n",
                "Biaya pelayanan", pelayanan);

        System.out.println("------------------------------------------");

        System.out.printf("%-25s Rp %,10.0f%n",
                "TOTAL BAYAR", totalBayar);

        System.out.println("==========================================");
        System.out.println("       Terima kasih atas kunjungan Anda!");
        System.out.println("==========================================");

        input.close();
    }
}