package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanArraysoal2 {
    public static void main(String[] args) {

        // Membuat ArrayList
        ArrayList<Integer> angka = new ArrayList<>();

        // Menambahkan 5 angka
        angka.add(25);
        angka.add(12);
        angka.add(40);
        angka.add(18);
        angka.add(30);

        // Menentukan nilai terbesar
        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
    }
}