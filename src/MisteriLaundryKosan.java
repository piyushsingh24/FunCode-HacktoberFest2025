public class MisteriLaundryKosan {

/**
 * --- Catatan dari Laundry "Aroma Kenangan" ---
 *
 * Ada kabar aneh dari laundry di depan kampus.
 * Katanya, setiap kali kamu menitipkan pakaian di sana,
 * ada "proses mistis" yang menentukan berapa lama cucianmu selesai.
 *
 * Dari pengakuan para penghuni kos:
 *
 * - Setiap "Kaos" butuh waktu 2 jam untuk dikeringkan.
 * - "Celana" butuh 3 jam, karena katanya bahan jeansnya suka ngambek.
 * - "Jaket" lebih lama lagi, 5 jam — apalagi kalau ada kenangan di saku.
 * - Tapi setiap kali ada 4 pakaian dititipkan sekaligus,
 *   jam kerja mesin pengering entah bagaimana jadi lebih efisien.
 *   Total waktu pengerjaan berkurang setara dengan 1 jam kerja penuh.
 *
 * Misal: Kalau kamu titip 8 pakaian, berarti efisiensi terjadi 2 kali,
 * jadi waktu totalnya berkurang 2 jam.
 *
 * Suatu hari, pemilik laundry meninggalkan catatan pesanan harian.
 * Tidak ada keterangan waktu, hanya daftar pakaian yang dicuci.
 *
 * Bisakah kamu menebak, berapa jam sebenarnya mesin itu bekerja?
 *
 * (Hati-hati — katanya kalau kamu salah hitung,
 * mesin pengeringnya bisa tiba-tiba nyanyi lagu “Cinta Dalam Mesin Cuci.”)
 */
    public static int hitungWaktuMisterius(String[] pakaian) {
        //buat logika mesinmu disini
        //semua clue ada di catatan
        return 0;//0 sepertinya bukan jawaban yang tepat
    }

    public static void main(String[] args) {
        String[] pesanan1 = {"Kaos", "Celana", "Jaket", "Kaos"};
        System.out.println("Pesanan 1: " + hitungWaktuMisterius(pesanan1)); 


        String[] pesanan2 = {"Kaos", "Kaos", "Celana", "Jaket", "Kaos", "Celana", "Celana", "Kaos"};
        System.out.println("Pesanan 2: " + hitungWaktuMisterius(pesanan2)); 

        String[] pesanan3 = {"Jaket", "Jaket", "Celana"};
        System.out.println("Pesanan 3: " + hitungWaktuMisterius(pesanan3));
    }
}