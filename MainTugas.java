package tugas;

// Nama : Irman Maulana
// NPM  : 2410010464

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array Mata Kuliah
        String[] matkul = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("===== DAFTAR MATA KULIAH =====");

        for (String mk : matkul) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Tambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2410010001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010002", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010003", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "2410010004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2410010005", 60));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah Lulus : " + kelas.jumlahLulus());

        // Tambah mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2410010006", 88));

        System.out.println();
        System.out.println("Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());

    }

}