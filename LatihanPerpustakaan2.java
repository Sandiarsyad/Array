package bagian3.perpustakaan;

import java.util.ArrayList;

public class LatihanPerpustakaan2 {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void kembalikanBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(false);
                System.out.println("Buku \"" + judul + "\" telah dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void cariPenulis(String penulis) {
        boolean ditemukan = false;

        for (Buku b : daftarBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                b.info();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }

    public void tampilkanSemua() {
        for (Buku b : daftarBuku) {
            b.info();
        }
    }
}