import model.Produk;
import util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        // Instansiasi objek produk
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000.0, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000.0, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000.0, 15);

        // Tampilkan informasi produk
        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // (Latihan mandiri) contoh pengelolaan stok
        p1.tambahStok(20);
        p2.kurangiStok(5);

        System.out.println("\nSetelah update stok:");
        System.out.println("Stok " + p1.getNama() + ": " + p1.getStok());
        System.out.println("Stok " + p2.getNama() + ": " + p2.getStok());

        // Panggil identitas mahasiswa
        CreditBy.print("240320561", "Azzahra Ramadhani");
    }
}
