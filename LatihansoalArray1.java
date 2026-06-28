package bagian1.array;
public class LatihansoalArray1 {
    public static void main(String[] args) {

        // Array suhu harian
        double[] suhu = {30.5, 28.7, 31.2, 29.8, 32.1, 27.9};

        // Anggap elemen pertama sebagai nilai awal
        double tertinggi = suhu[0];
        double terendah = suhu[0];

        // Mencari suhu tertinggi dan terendah
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);
    }
}