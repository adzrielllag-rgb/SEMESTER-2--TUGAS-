public class prakfungsi {
  public static void main(String[] args) {
  
    String[] cabang = {"RoyalGarden 1","RoyalGarden 2","RoyalGarden 3", "RoyalGarden 4"};
  
    String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar"};
  
      int[][] stok = {
          {10, 5, 15, 7},
          {6, 11, 9, 12},
          {2, 10, 10, 5},
          {5, 7, 12, 9 }
      };
  
      int[] harga = {75000, 50000, 60000, 10000};
  
      System.out.println("Pendapatan Setiap Cabang");
      System.out.println("======================================");
      
      for (int i = 0; i < cabang.length; i++) {
          int pendapatan = totalPendapatan(stok[i], harga);
          String status = statusCabang(pendapatan);
  
          System.out.println(cabang[i]);
          System.out.println("Pendapatan : Rp " + pendapatan);
          System.out.println("Status     : " + status);
          System.out.println("--------------------------------------");
        }
      }
      public static int totalPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }
      public static String statusCabang(int pendapatan) {
          if (pendapatan > 1500000) {
              return "Sangat Baik";
          } else {
              return "Perlu Evaluasi";
          }
      }
}