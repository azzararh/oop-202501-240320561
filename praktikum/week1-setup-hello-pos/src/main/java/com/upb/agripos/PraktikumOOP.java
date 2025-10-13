class Produk {
    private final String nama;
    private final int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
}
public class PraktikumOOP {
    public static void main(String[] args) {
        String nim = "240320561";
        String namaMhs = "Azzahra Ramadhani";

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
        System.out.println("Total harga semua produk: Rp" + total);
    }
}
