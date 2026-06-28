package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanArraysoal1 {
    public static void main(String[] args) {

        // Membuat ArrayList
        ArrayList<String> daftarBelanja = new ArrayList<>();

        // Menambahkan 4 item
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Menghapus item ke-2 (index 1)
        daftarBelanja.remove(1);

        // Menampilkan isi ArrayList
        System.out.println("Daftar Belanja:");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }

        // Menampilkan jumlah item
        System.out.println("Jumlah item: " + daftarBelanja.size());
    }
}