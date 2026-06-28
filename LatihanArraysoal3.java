
package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanArraysoal3 {
    public static void main(String[] args) {

        // Membuat ArrayList
        ArrayList<String> nama = new ArrayList<>();

        // Menambahkan 6 nama
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Citra");
        nama.add("Aulia");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}