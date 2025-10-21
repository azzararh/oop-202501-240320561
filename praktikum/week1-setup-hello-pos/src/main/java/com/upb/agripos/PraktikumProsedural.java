public class PraktikumProsedural {
   public static void main(String[] args) {
      String nim = "240320561";
      String nama = "Azzahra Ramadhani";
      String[] produk = {"Pupuk NPK Phonska", "Benih Jagung Hibrida Bhayangkara", "Masako"};
      double[] harga = {70000, 94350, 14000};
      int total = 0;
      System.out.println("Hello World, I am " + nama + " | NIM: " + nim);
      System.out.println("Daftar Produk:");
      for (int i = 0; i < produk.length; i++) {
         System.out.println("- " + produk[i] + ": " + "Rp " + harga[i]);
         total += harga[i];
      }
      System.out.println("Total harga semua produk: " + "Rp " + total);
   }
}