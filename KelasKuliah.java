package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    // Menyimpan data mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Menghitung rata-rata
    public double hitungRataRata() {

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah lulus
    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {

            if (m.lulus()) {
                jumlah++;
            }

        }

        return jumlah;
    }

    // Menampilkan semua data
    public void tampilkanSemua() {

        System.out.println("===== DATA MAHASISWA =====");

        for (Mahasiswa m : daftarMahasiswa) {

            System.out.println(
                    m.getNama() + " | "
                    + m.getNpm() + " | Nilai : "
                    + m.getNilai());

        }

    }

    // Jumlah data
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}