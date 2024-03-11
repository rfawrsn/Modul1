import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class main {
    private static List<mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah meminta input integer

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 3);
    }

    private static void tambahDataMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        while (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka. Silakan coba lagi.");
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLine();
        }

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        mahasiswa mahasiswa = new mahasiswa(nim, nama, jurusan);
        daftarMahasiswa.add(mahasiswa);

        System.out.println("\nData mahasiswa berhasil ditambahkan.");
    }

    private static void tampilkanDataMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("Data Mahasiswa:");
            for (mahasiswa mahasiswa : daftarMahasiswa) {
                mahasiswa.tampilDatamahasiswa();
                System.out.println();
            }
        }
    }
}