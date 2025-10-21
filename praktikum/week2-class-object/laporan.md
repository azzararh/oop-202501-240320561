# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : [Azzahra Ramadhani]
- NIM   : [240320561]
- Kelas : [3DSRA]

---

## Tujuan
(Tuliskan tujuan praktikum minggu ini.  
Contoh: *Mahasiswa memahami konsep class dan object serta dapat membuat class Produk dengan enkapsulasi.*)

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
// Contoh
Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);
System.out.println(p1.getNama());
```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
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
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
