
package bagian1.array;
public class LatihansoalArray3 {
    public static void main(String[] args) {

        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        // Menghitung angka genap
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Jumlah angka genap = " + jumlahGenap);
    }
}