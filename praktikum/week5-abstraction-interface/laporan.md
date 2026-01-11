# Laporan Praktikum Minggu 5 (sesuaikan minggu ke berapa?)
Topik: abstraction-interface

## Identitas
- Nama  : [Azzahra Ramadhani]
- NIM   : [240320561]
- Kelas : [3DSRA]

---

## Tujuan
- Mahasiswa mampu menjelaskan perbedaan abstract class dan interface.
- Mahasiswa mampu mendesain abstract class dengan method abstrak sesuai kebutuhan kasus.
- Mahasiswa mampu membuat interface dan mengimplementasikannya pada class.
- Mahasiswa mampu menerapkan multiple inheritance melalui interface pada rancangan kelas.
- Mahasiswa mampu mendokumentasikan kode (komentar kelas/method, README singkat pada folder minggu).

---

## Dasar Teori
Abstraksi adalah proses menyederhanakan kompleksitas dengan menampilkan elemen penting dan menyembunyikan detail implementasi.

Abstract class: tidak dapat diinstansiasi, dapat memiliki method abstrak (tanpa badan) dan non-abstrak. Dapat menyimpan state (field).
Interface: kumpulan kontrak (method tanpa implementasi konkret). Sejak Java 8 mendukung default method. Mendukung multiple inheritance (class dapat mengimplementasikan banyak interface).
Gunakan abstract class bila ada shared state dan perilaku dasar; gunakan interface untuk mendefinisikan kemampuan/kontrak lintas hierarki.
Dalam konteks Agri-POS, Pembayaran dapat dimodelkan sebagai abstract class dengan method abstrak prosesPembayaran() dan biaya(). Implementasi konkritnya: Cash dan EWallet. Kemudian, interface seperti Validatable (mis. verifikasi OTP) dan Receiptable (mencetak bukti) dapat diimplementasikan oleh jenis pembayaran yang relevan.

---

## Langkah Praktikum
1. Abstract Class – Pembayaran
 Buat Pembayaran (abstract) dengan field invoiceNo, total dan method:
   - double biaya() (abstrak) → biaya tambahan (fee).
   - boolean prosesPembayaran() (abstrak) → mengembalikan status berhasil/gagal.
   - double totalBayar() (konkrit) → return total + biaya();.

2. Subclass Konkret
   - Cash → biaya = 0, proses = selalu berhasil jika tunai >= totalBayar().
   - EWallet → biaya = 1.5% dari total; proses = membutuhkan validasi.

3. Interface
   - Validatable → boolean validasi(); (contoh: OTP).
   - Receiptable → String cetakStruk();

4. Multiple Inheritance via Interface
   - EWallet mengimplementasikan dua interface: Validatable, Receiptable.
   - Cash setidaknya mengimplementasikan Receiptable.

5. Main Class
   - Buat MainAbstraction.java untuk mendemonstrasikan pemakaian Pembayaran (polimorfik).
   - Tampilkan hasil proses dan struk. Di akhir, panggil CreditBy.print("<NIM>", "<Nama>").

6. Commit dan Push
   - Commit dengan pesan: week5-abstraction-interface.


---

## Kode Program
import com.upb.agripos.model.kontrak.Receiptable;
import com.upb.agripos.model.pembayaran.Cash;
import com.upb.agripos.model.pembayaran.EWallet;
import com.upb.agripos.model.pembayaran.Pembayaran;
import com.upb.agripos.model.pembayaran.TransferBank;
import com.upb.agripos.util.CreditBy;

public class MainAbstraction {
    public static void main(String[] args) {
        Pembayaran cash = new Cash("INV-001", 87000, 100000);
        Pembayaran ew = new EWallet("INV-002", 175000, "harazahara@ewallet", "123456");
        Pembayaran transfer = new TransferBank("INV-003", 150000, "BCA", true);


        System.out.println(((Receiptable) cash).cetakStruk());
        System.out.println(((Receiptable) ew).cetakStruk());
        System.out.println(((Receiptable) transfer).cetakStruk());
    
        CreditBy.print("Azzahra Ramadhani", "240320561");
    }
}
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
