public class PraktikumProsedural {
   public static void main(String[] args) {
      String nim = "240320561";
      String nama = "Azzahra Ramadhani";
      String[] produk = {"Pasta Gigi Cipta 15gr", "Sabun Cuci 200gr", "Potato Snack 320gr"};
      double[] harga = {10000, 22500, 14000};
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