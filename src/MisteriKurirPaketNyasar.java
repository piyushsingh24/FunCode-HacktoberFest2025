public class MisteriKurirPaketNyasar {

    /**
     * Ditemukan sebuah logbook sobek milik seorang kurir...
     *
     * --- Logbook Kurir Konoha, Misi 7 ---
     *
     * "Dunia ini ternyata kotak, ukurannya cuma 5x5 petak, dari koordinat (0,0) sampai (4,4).
     * Aku selalu mulai dari pojok kiri atas, markas besar di (0,0).
     * Kata bos, paket ini super penting dan harus sampai di gudang rahasia di pojok kanan bawah (4,4).
     *
     * Tapi, instruksi yang kuterima aneh sekali...
     ** - Kalau bos bilang 'Maju', aku akan geser satu petak ke kanan.
     ** - Kalau teriak 'Balik', aku terpaksa mundur satu petak ke kiri.
     ** - Perintah 'Naik' selalu membawaku satu petak ke atas.
     ** - Dan 'Turun' tentu saja membawaku satu petak ke bawah.
     *
     * Ini yang paling aneh: Bos bilang, kalau ada perintah yang panjangnya LEBIH DARI 5 HURUF,
     ** aku harus pura-pura tidak dengar dan diam di tempat. Katanya itu cuma 'gangguan frekuensi'.
     *
     * Tentu saja, kalau aku melangkah keluar dari dunia kotak ini, misiku auto gagal.
     *
     * Pertanyaannya... dari serangkaian instruksi ini, apakah misiku akan berhasil?"
     *
     */
    public static boolean misiRahasiaKurir(String[] instruksi) {
        // Posisi awal kurir...
        int x = 0, y =0;
        // Aturan main dunia...
        for (int i = 0; i < instruksi.length; i++) {
            switch (instruksi[i]) {
                case "Turun":
                y -= 1;
                break;
                
                case "Maju":
                x += 1;
                break;
                
                case "Balik":
                x -= 1;
                break;
                
                    case "Naik":
                    y += 1;
                    break;
                    default:
                    
                    break;
                }
        }
        Boolean hasil = false;
        if (x < 5 && x > -1 && y < 1 && y > -5) {
            hasil = true;
        }
        // int x1 = 0, y1 =0;
        // for (int i = 0; i < rute2.length; i++) {
        //     switch (rute2[i]) {
        //         case "Turun":
        //         y1 -= 1;
        //         break;
                
        //         case "Maju":
        //         x1 += 1;
        //         break;
                
        //         case "Balik":
        //         x1 -= 1;
        //         break;
                
        //         case "Naik":
        //         y1 += 1;
        //         break;
        //         default:
                
        //         break;
        //     }
        // }
        // Boolean hasil1 = false;
        // if (x < 5 && x > -1 && y < 1 && y > -5) {
        //     hasil1 = true;
        // }
        // int x2 = 0, y2 =0;
        // for (int i = 0; i < rute3.length; i++) {
        //     switch (rute3[i]) {
        //         case "Turun":
        //         y2 -= 1;
        //         break;
                
        //         case "Maju":
        //         x2 += 1;
        //         break;
                
        //         case "Balik":
        //         x2 -= 1;
        //         break;
                
        //         case "Naik":
        //         y2 += 1;
        //         break;
        //         default:
                
        //         break;
        //     }
        // }
        // Boolean hasil2 = false;
        // if (x < 5 && x > -1 && y < 1 && y > -5) {
        //     hasil2 = true;
        // }
        // int x3 = 0, y3 =0;
        // for (int i = 0; i < rute4.length; i++) {
        //     switch (rute4[i]) {
        //         case "Turun":
        //         y3 -= 1;
        //         break;
                
        //         case "Maju":
        //         x3 += 1;
        //         break;
                
        //         case "Balik":
        //         x3 -= 1;
        //         break;
                
        //         case "Naik":
        //         y3 += 1;
        //         break;
        //         default:
                
        //         break;
        //     }
        // }
        // Boolean hasil3 = false;
        // if (x < 5 && x > -1 && y < 1 && y > -5) {
        //     hasil3 = true;
        // }
        // Kondisi berhasil atau gagal...
        // Semuanya ada di logbook. Analisis dengan teliti.
        
        return hasil; // Apakah ini jawaban finalnya? Mungkin tidak.
    }

    public static void main(String[] args) {
        // Rute 1: Serangkaian instruksi yang terlihat normal.
        String[] rute1 = {"Turun", "Maju", "Turun", "Maju", "Turun", "Maju", "Turun", "Maju"};
        System.out.println("Status Misi Rute 1: " + misiRahasiaKurir(rute1));

        // Rute 2: Instruksi yang membuatnya jatuh dari dunia.
        String[] rute2 = {"Maju", "Naik", "Naik"};
        System.out.println("Status Misi Rute 2: " + misiRahasiaKurir(rute2));

        // Rute 3: Ada 'gangguan frekuensi' yang membuatnya salah jalan.
        String[] rute3 = {"Turun", "Turun", "Maju", "Maju Maju", "Maju", "Turun", "Turun", "Maju"};
        System.out.println("Status Misi Rute 3: " + misiRahasiaKurir(rute3));
        
        // Rute 4: Sampai di tujuan, tapi ada instruksi aneh di awal.
        String[] rute4 = {"Awas Dulu", "Turun", "Maju", "Turun", "Maju", "Turun", "Maju", "Turun", "Maju"};
        System.out.println("Status Misi Rute 4: " + misiRahasiaKurir(rute4));
    }
}