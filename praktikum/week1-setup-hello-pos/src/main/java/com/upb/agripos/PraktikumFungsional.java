import java.util.*;

class Produk {
    String nama;
    int harga;
    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class PraktikumFungsional {
    public static void main(String[] args) {
        String nim = "240320561";
        String nama = "Azzahra Ramadhani";

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
}
