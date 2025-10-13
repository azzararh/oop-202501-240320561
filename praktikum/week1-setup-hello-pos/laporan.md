# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Azzahra Ramadhani
- NIM   : N240320561
- Kelas : 3DSRA

---

## Tujuan

Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.
Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.
Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.
Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).

---

## Dasar Teori

Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.

---

## Langkah Praktikum

1. Setup project: memastikan aplikasi editor sudah mengusntall jdk dan bisa untuk membuat program menggunakan java
2. Membuat folder
3. Membuat struktur awal

---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
1. Program Fungsional
class Produk {
    String nama;
    int harga;
    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
2. Program OOP
class Produk {
    private final String nama;
    private final int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
3. Program Prosedural
 String[] produk = {"Pasta Gigi Cipta 15gr", "Sabun Cuci 200gr", "Potato Snack 320gr"};
      double[] harga = {10000, 22500, 14000};
---

## Hasil Eksekusi
1. Program Prosedural 
(Screenshots\Prosedural.png)
2. Program OOP

3. Program Fungsional

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
1. Apakah OOP selalu lebih baik dari prosedural  
   Jawaban: Tidak selalu. OOP (Object-Oriented Programming) lebih baik digunakan jika aplikasi memiliki banyak entitas dan hubungan antarobjek yang kompleks karena memudahkan pengelolaan kode melalui konsep kelas dan objek. Namun, untuk program kecil atau tugas sederhana dengan alur logika yang linear, paradigma prosedural bisa lebih efisien dan mudah dipahami.

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural 
   Jawaban: Functional programming lebih cocok digunakan ketika program membutuhkan banyak operasi matematika, transformasi data, atau proses paralel karena bersifat stateless dan menghindari efek samping (side effects). Contohnya pada pengolahan data besar, machine learning pipeline, atau sistem yang memerlukan keandalan tinggi dalam perhitungan.

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?
   Jawaban: Prosedural: mudah ditulis dan cocok untuk program kecil, tetapi sulit di-maintain jika aplikasi tumbuh besar karena logika bercampur dalam banyak fungsi.

   OOP: meningkatkan maintainability dan scalability dengan pemisahan tanggung jawab ke dalam kelas dan objek, serta memanfaatkan prinsip seperti inheritance dan encapsulation.

   Fungsional: meningkatkan maintainability dengan kode yang ringkas dan bebas efek samping, serta mudah di-scale karena mendukung parallel processing dan immutable data structure.

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
   Jawaban: Karena aplikasi POS (Point of Sale) memiliki banyak entitas seperti pelanggan, produk, transaksi, dan kasir yang saling berhubungan. Dengan OOP, setiap entitas dapat dibuat sebagai objek dengan atribut dan perilaku sendiri sehingga sistem lebih mudah dikembangkan, diperluas, dan dipelihara. Selain itu, OOP memungkinkan penggunaan kembali kode (reuse) melalui pewarisan dan polimorfisme.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (*boilerplate code*)?
   Jawaban: Paradigma fungsional menggunakan konsep higher-order functions, pure functions, dan function composition yang memungkinkan penulisan fungsi generik untuk berbagai keperluan. Dengan cara ini, programmer tidak perlu menulis ulang logika yang sama di banyak tempat, sehingga kode menjadi lebih ringkas, bersih, dan mudah diuji.
