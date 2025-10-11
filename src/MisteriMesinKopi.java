public class MisteriMesinKopi {

/**
 * --- Catatan di Samping Mesin Kopi Kantin Teknik ---
 *
 * Ada mesin kopi aneh di kantin. Katanya buatan jurusan elektro, tapi kelihatannya hasil skripsi gagal.
 *
 * Mesin ini tidak mau menerima uang, tapi hanya satu kata saja:
 * - Kalau kamu bilang "kopi", mesin akan mengeluarkan angka 5.
 * - Kalau kamu bilang "teh", mesin akan mengeluarkan angka 3.
 * - Kalau kamu bilang "susu", mesin akan mengeluarkan angka 7.
 *
 * Tapi anehnya... mesin ini punya aturan aneh:
 *   "Jika kata yang kamu masukkan panjangnya lebih dari 3 huruf,
 *    hasilnya akan mengganda"
 * 
 * Mesin ini hanya menampilkan angka akhir di layarnya.
 * Bisakah kamu menebak angka misterius itu dari kata yang dimasukkan?
 */
    public static int angkaMisteri(String kata) {
        int hasil = 0;
        //buat logika mesinmu disini
        if (kata.equals("kopi")) {
            hasil = 10;
        } else if (kata.equals("teh")) {
            hasil = 3;
        } else if (kata.equals("susu")) {
            hasil = 14;
        }
        //semua clue ada di catatan
        return hasil;//0 sepertinya bukan jawaban yang tepat
    }

    public static void main(String[] args) {
        System.out.println("Kata: kopi = " + angkaMisteri("kopi")); 

        System.out.println("Kata: teh = " + angkaMisteri("teh"));

        System.out.println("Kata: susu = " + angkaMisteri("susu"));
    }
}