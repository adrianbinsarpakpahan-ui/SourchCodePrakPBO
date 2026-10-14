/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */


   /*
mengapa kita perlu validasi r<0
Ketepatan Logika Matematika: Jari-jari (\(r\)) sebuah lingkaran secara matematis tidak mungkin bernilai negatif. 
Panjang atau dimensi suatu bangun datar harus selalu bernilai positif atau nol.

dalam apilikasi nyata,dimana validasi input sangat penting?
Percakapan Mode AI: kerjakanAnda mengirim: 1 gambar dan mengatakan: kerjakankerjakanBerikut adalah jawaban untuk Pertanyaan Pemantik berdasarkan 
kode program Java pada 
gambar:1. Mengapa kita perlu validasi \(r < 0\)?Kita memerlukan validasi \(r < 0\) karena secara logika matematika dan fisik, nilai jari-jari suatu lingkaran tidak boleh negatif.
Jika program tidak divalidasi dan pengguna memasukkan angka negatif (misalnya -7):Luas akan tetap menghasilkan nilai positif
yang salah secara logika karena negatif dikali negatif adalah positif (\(-7 \times -7 = 49\)).Keliling akan menghasilkan nilai negatif, padahal panjang/dimensi fisik suatu objek tidak 
pernah bernilai minus.Validasi ini berfungsi untuk mencegah kesalahan logika (logical error) dan menjaga agar data yang diproses program selalu valid.2. Dalam aplikasi nyata, di mana validasi input sangat penting?Validasi input sangat krusial di hampir semua sistem digital, 
beberapa contoh utamanya meliputi:Sistem Perbankan & Finansial: Memastikan pengguna tidak memasukkan nominal transfer atau penarikan uang bernilai negatif atau melebihi saldo yang ada.Formulir Pendaftaran & Login: Memeriksa format email (harus ada @), batas minimal karakter kata sandi, serta mencegah
serangan siber seperti SQL Injection.Aplikasi E-commerce: Memastikan jumlah barang yang dipesan minimal 1 dan tidak bernilai negatif, serta memvalidasi nomor kartu pembayaran atau alamat pengiriman.Sistem Medis & Kesehatan: Memvalidasi input dosis obat, usia, atau berat badan pasien agar tidak terjadi salah dosis
yang membahayakan nyawa.
*/

