# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: PARADIGMA

## Identitas
- Nama  : Azzahra Ramadhani
- NIM   : 240320561
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
4. Mencari referensi kode dan membaca
5. Mengevaluasi program

---

## Kode Program
Kode Utama:

1. Program Prosedural

String[] produk = {"Pasta Gigi Cipta 15gr", "Sabun Cuci 200gr", "Potato Snack 320gr"};
      double[] harga = {10000, 22500, 14000};
      int total = 0;
      System.out.println("Hello World, I am " + nama + " | NIM: " + nim);
      System.out.println("Daftar Produk:");
      for (int i = 0; i < produk.length; i++) {
         System.out.println("- " + produk[i] + ": " + "Rp " + harga[i]);
         total += harga[i];
      }

2. Program OOP
Produk[] daftar = {
            new Produk("Beras", 10000),
            new Produk("Pupuk", 15000),
            new Produk("Benih", 12000)
        };
        int total = 0;
        System.out.println("Hello World, I am " + namaMhs + " | NIM: " + nim);
        System.out.println("Daftar Produk:");
        for (Produk p : daftar) {
            System.out.println("- " + p.getNama() + ": Rp" + p.getHarga());
            total += p.getHarga();
        }
3. Program Fungsional

List<Produk> daftar = Arrays.asList(
            new Produk("Beras", 10000),
            new Produk("Pupuk", 15000),
            new Produk("Benih", 12000)
        );
        System.out.println("Hello World, I am " + nama + " | NIM: " + nim);
        System.out.println("Daftar Produk:");

        daftar.forEach(p -> System.out.println("- " + p.nama + ": Rp" + p.harga));

        int total = daftar.stream()
                          .mapToInt(p -> p.harga)
                          .sum();

        System.out.println("Total harga semua produk: Rp" + total);
    }

---

## Hasil Eksekusi
1. Program Prosedural 
(Screenshot/Prosedural.png)
2. Program OOP
(Screenshot/OOP.png)
3. Program Fungsional
(screenshot/Fungsional.png)
---

## Analisis
- Jelaskan bagaimana kode berjalan.  
Ketiga program tersebut memiliki fungsi utama yang sama, yaitu menampilkan data mahasiswa, daftar produk, dan total harga dari seluruh produk.
Pada program pertama (PraktikumProsedural), seluruh proses dilakukan secara langsung di dalam fungsi main, mulai dari mendefinisikan array produk dan harga, menampilkan data, hingga menghitung total harga dengan perulangan for.
Pada program kedua (PraktikumOOP), logika program sudah dibagi menjadi dua bagian, yaitu kelas Produk yang merepresentasikan objek produk beserta atributnya (nama dan harga), serta kelas utama PraktikumOOP yang memanfaatkan objek-objek tersebut untuk ditampilkan dan dihitung totalnya.
Sedangkan pada program ketiga (PraktikumFungsional), program memanfaatkan konsep fungsional dengan koleksi data (List) dan fitur forEach() serta stream() untuk menampilkan data dan menghitung total harga dengan cara yang lebih ringkas dan deklaratif. Secara keseluruhan, ketiganya memiliki hasil akhir yang sama, tetapi cara kerja dan struktur kodenya berbeda sesuai paradigma yang digunakan.

- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
Pendekatan kali ini tentunya dilakukan simulasi dan penulisan langsung kode program ke dalam aplikasi editor, dibandingkan pada minggu2 sebelumnya ketika di kelas yang mana tanpa praktik langsung sehingga kesulitan memahami struktur program secara langsung.

- Kendala yang dihadapi dan cara mengatasinya.  
Dalam praktiknya, beberapa kendala yang muncul antara lain: pada pendekatan prosedural, kode mudah menjadi panjang dan sulit dikelola jika program bertambah besar. Untuk mensiasatinya dengan mulai memecah logika ke dalam fungsi atau kelas. Pada pendekatan OOP, kendala yang sering muncul adalah pemahaman awal tentang konsep objek dan cara mengakses atribut melalui method getter atau setter. Hal ini bisa diatasi dengan membaca. Sementara pada pendekatan fungsional, ada kesulitan pada pemahaman sintaks lambda, forEach, dan stream. Untuk mengatasinya, perlu memahami konsep dasar pemrograman fungsional dan mencoba menulis ulang operasi yang sama agar mudah dibandingkan.
---

## Kesimpulan
Pada bab kesimpulan ini, saya ingin menyampaikan kelebihan dan kekurangan dari ketiga program yang telah dibuat (Prosedural, OOP, dan Fungsional)

1. Program Prosedural (PraktikumProsedural)
Kelebihan:
- Struktur kode sederhana dan mudah dipahami, cocok untuk newbie.
- Langsung dieksekusi dari atas ke bawah, sehingga alurnya jelas.
- Tidak memerlukan pemahaman mendalam tentang konsep objek atau fungsi lanjutan.
- Cocok untuk program kecil dengan logika yang tidak kompleks.
Kekurangan:
- Sulit dikembangkan jika program menjadi besar karena semua logika terpusat di satu tempat.
- Tidak fleksibel dan sulit dipelihara, karena perubahan kecil dapat memengaruhi seluruh kode.
- Tidak mendukung reusability (penggunaan ulang kode) dengan baik.
- Tidak ada pemisahan antara data dan perilaku, sehingga kode mudah berantakan.

2. Program Berorientasi Objek (PraktikumOOP)
Kelebihan:
- Struktur kode lebih terorganisir karena data dan perilaku dibungkus dalam kelas (class).
- Lebih mudah dikembangkan dan dirawat, karena tiap bagian memiliki tanggung jawab sendiri.
- Mendukung penggunaan ulang kode (reusability) melalui objek dan pewarisan (inheritance).
- Cocok untuk aplikasi skala menengah hingga besar.
Kekurangan:
- Lebih kompleks dan membutuhkan pemahaman ekstra untuk pemula.
- Membutuhkan lebih banyak baris kode untuk hal yang sebenarnya sederhana.
- Kadang terasa “berlebihan” jika program hanya memiliki logika kecil atau sederhana.

3. Program Fungsional (PraktikumFungsional)
Kelebihan:
- Kode lebih ringkas dan ekspresif, terutama dalam pengolahan data.
- Menggunakan konsep lambda dan stream, yang membuat operasi seperti perulangan dan penjumlahan lebih efisien.
- Mengurangi efek samping (mutasi data), karena sebagian besar datanya bersifat immutable.
- Cocok untuk pengolahan data dalam jumlah besar atau operasi yang sifatnya deklaratif.
Kekurangan:
- Lebih sulit dipahami oleh pemula, terutama karena sintaks lambda dan stream tidak intuitif bagi yang baru belajar Java.
- Debugging lebih sulit, karena alur eksekusi tidak selalu linear dan sulit dilacak.
- Tidak cocok untuk semua kasus, terutama jika program memerlukan banyak interaksi antarobjek.
---

## Quiz
1. Apakah OOP selalu lebih baik dari prosedural? 
   Jawaban: Tidak selalu. OOP (Object-Oriented Programming) lebih baik digunakan jika aplikasi memiliki banyak entitas dan hubungan antarobjek yang kompleks karena memudahkan pengelolaan kode melalui konsep kelas dan objek. Namun, untuk program kecil atau tugas sederhana dengan alur logika yang linear, paradigma prosedural bisa lebih praktis karena mudah dipahami.

2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?
   Jawaban: Functional programming lebih cocok digunakan ketika program membutuhkan banyak operasi matematika, transformasi data, atau proses paralel karena bersifat stateless dan menghindari efek samping (side effects). Contohnya pada, machine learning pipeline, atau sistem yang memerlukan kebutuhan tinggi dalam perhitungan.

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?
   Jawaban: 
   Prosedural: mudah ditulis dan cocok untuk program kecil, tetapi sulit di-maintain jika aplikasi tumbuh besar karena logika bercampur dalam banyak fungsi.
   OOP: meningkatkan maintainability dan scalability dengan pemisahan tanggung jawab ke dalam kelas dan objek, serta memanfaatkan prinsip seperti inheritance dan encapsulation.
   Fungsional: meningkatkan maintainability dengan kode yang ringkas dan bebas efek samping, serta mudah di-scale karena mendukung parallel processing dan immutable data structure.

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
   Jawaban: Karena aplikasi POS (Point of Sale) memiliki banyak entitas seperti pelanggan, produk, transaksi, dan kasir yang saling berhubungan. Dengan OOP, setiap entitas dapat dibuat sebagai objek dengan atribut dan perilaku sendiri sehingga sistem lebih mudah dikembangkan, diperluas, dan dipelihara. Selain itu, OOP memungkinkan penggunaan kembali kode (reuse) melalui polimorfisme.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (*boilerplate code*)?
   Jawaban: Paradigma fungsional menggunakan konsep higher-order functions, pure functions, dan function composition yang memungkinkan penulisan fungsi generik untuk berbagai keperluan. Dengan cara ini, programmer tidak perlu menulis ulang logika yang sama di banyak tempat, sehingga kode menjadi lebih ringkas, bersih, dan mudah diuji.
