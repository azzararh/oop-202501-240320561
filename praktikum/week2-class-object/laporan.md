# Laporan Praktikum Minggu 2 
Topik: Class dan Object

## Identitas
- Nama  : [Azzahra Ramadhani]
- NIM   : [240320561]
- Kelas : [3DSRA]

---

## Tujuan
Mahasiswa mampu menjelaskan konsep class, object, atribut, dan method dalam OOP.
Mahasiswa mampu menerapkan access modifier dan enkapsulasi dalam pembuatan class.
Mahasiswa mampu mengimplementasikan class Produk pertanian dengan atribut dan method yang sesuai.
Mahasiswa mampu mendemonstrasikan instansiasi object serta menampilkan data produk pertanian di console.
Mahasiswa mampu menyusun laporan praktikum dengan bukti kode, hasil eksekusi, dan analisis sederhana.

---

## Dasar Teori
1. Class adalah blueprint dari objek.  
2. Object adalah instansiasi dari class.  
3. Enkapsulasi digunakan untuk menyembunyikan data.)

---

## Langkah Praktikum
1. Langkah-langkah yang dilakukan (setup, coding, run).  
2. File/kode yang dibuat.  
3. Commit message yang digunakan.

---

## Kode Program 

```java
public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
```

---

## Hasil Eksekusi
<img width="1920" height="1080" alt="Screenshot (614)" src="https://github.com/user-attachments/assets/e09fd3fd-f237-4a3e-a8cc-c6866d909471" />


---

## Analisis
- Jelaskan bagaimana kode berjalan.  
 Program ini dibuat untuk menampilkan data produk pertanian menggunakan pendekatan berorientasi objek (OOP). Pertama, program mengimpor dua class lain yaitu Produk dari folder model dan CreditBy dari folder util. Class Produk berisi data dan fungsi yang menggambarkan satu produk pertanian, seperti kode, nama, harga, dan stok. Sementara CreditBy digunakan untuk menampilkan identitas pembuat program (nama dan NIM). Di dalam method main, program membuat tiga objek produk dengan cara memanggil konstruktor new Produk(...). Masing-masing produk punya informasi yang berbeda — misalnya Benih Padi IR64, Pupuk Urea 50kg, dan Cangkul Baja. Setelah itu, program menampilkan semua data produk ke layar menggunakan System.out.println. Selanjutnya, program melakukan perubahan stok: p1.kurangiStok(25) → mengurangi stok produk pertama sebanyak 25, p2.kurangiStok(5) → mengurangi stok produk kedua sebanyak 5, p3.tambahStok(10) → menambah stok produk ketiga sebanyak 10. Kemudian program mencetak ulang data produk setelah stok diperbarui agar terlihat perbedaannya. Terakhir, method CreditBy.print("Azzahra Ramadhani", "240320561") dipanggil untuk menampilkan identitas pembuat program sebagai penutup output.
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  

---

## Kesimpulan
Dengan menggunakan class dan object pada praktikum minggu ini, program menjadi lebih terstruktur, mudah dipahami, dan efisien dalam pengelolaan data. Setiap objek memiliki atribut dan perilaku sendiri, sehingga perubahan pada satu bagian tidak memengaruhi bagian lainnya. Selain itu, konsep OOP ini membuat program lebih fleksibel dan mudah dikembangkan untuk kebutuhan yang lebih kompleks di masa mendatang.

---

## Quiz
1. Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?

Jawaban: Atribut sebaiknya dideklarasikan sebagai private dalam class karena tujuannya untuk melindungi data (data enkapsulasi). Dengan menjadikannya private, atribut hanya bisa diakses dan diubah melalui method khusus (getter dan setter). Hal ini mencegah kode lain secara langsung mengubah data tanpa kendali, yang bisa menyebabkan kesalahan atau inkonsistensi data. Selain itu, cara ini membuat program lebih aman, rapi, dan mudah dipelihara, karena pengembang bisa mengatur bagaimana data diakses dan dimodifikasi tanpa harus mengubah bagian lain dari program.

2. Apa fungsi getter dan setter dalam enkapsulasi?

Jawaban: Fungsi getter dan setter dalam enkapsulasi adalah untuk mengatur akses ke atribut yang bersifat private di dalam class. Getter berfungsi untuk mengambil atau menampilkan nilai dari atribut private. Setter berfungsi untuk mengubah atau menetapkan nilai baru pada atribut tersebut. Dengan cara ini, data di dalam class tetap terlindungi, tapi masih bisa diakses dan diubah secara terkendali. Jadi, getter dan setter membantu menjaga keamanan data sambil tetap memberikan fleksibilitas dalam penggunaannya.

3. Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?

Jawaban: Class Produk bisa mendukung pengembangan aplikasi POS (Point of Sale) yang lebih kompleks karena menjadi pondasi utama untuk mengelola data produk di dalam sistem.Dengan class ini, setiap produk memiliki atribut dan perilaku sendiri, seperti kode, nama, harga, dan stok, serta method untuk menambah atau mengurangi stok. Hal ini membuat pengelolaan data menjadi lebih terstruktur dan mudah dikembangkan Misalnya, nanti saat aplikasi POS dikembangkan lebih lanjut, class Produk bisa dengan mudah diperluas untuk menambahkan fitur seperti kategori produk, diskon, pajak, atau integrasi dengan database dan transaksi penjualan. Jadi, class ini membantu sistem POS menjadi modular, mudah dirawat, dan siap dikembangkan lebih lanjut tanpa harus mengubah struktur dasar program.
