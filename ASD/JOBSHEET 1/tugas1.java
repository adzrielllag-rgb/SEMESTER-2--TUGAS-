import java.util.Scanner;
public class tugas1 {

  static void jadwal(String[][] jadwal, int n) {
    
    for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah  : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang\t\t  : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari\t\t  : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam\t\t  : ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    static void tampiljadwal(String[][] jadwal, int n) {
        System.out.println("DAFTAR JADWAL KULIAH");
        System.out.println("============================================================");
        System.out.println("Mata Kuliah              | Ruang          | Hari       | Jam");

        for (int i = 0; i < n; i++) {
            String matkul = jadwal[i][0];
            String ruang = jadwal[i][1];
            String hari = jadwal[i][2];
            String jam = jadwal[i][3];
            
            if (matkul.length() < 24) {
                for (int j = matkul.length(); j < 24; j++) {
                    matkul += " ";
                }
            }
            
            if (ruang.length() < 14) {
                for (int j = ruang.length(); j < 14; j++) {
                    ruang += " ";
                }
            }
            
            if (hari.length() < 10) {
                for (int j = hari.length(); j < 10; j++) {
                    hari += " ";
                }
            }
            
            System.out.println(matkul +"| " + ruang +"| " + hari +"| " + jam);
        }
    }

    static void carihari(String[][] jadwal, int n, String hari) {
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
          if (jadwal[i][2].equalsIgnoreCase(hari)) {
            System.out.println("Mata Kuliah : " + jadwal[i][0]);
            System.out.println("Ruang       : " + jadwal[i][1]);
            System.out.println("Hari        : " + jadwal[i][2]);
            System.out.println("Jam         : " + jadwal[i][3]);
            ketemu = true ;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
        }
      }
      
      static void carimatkul(String[][] jadwal, int n, String matkul) {
        boolean ketemu = false;
        
        for (int i = 0; i < n; i++) {
          if (jadwal[i][0].equalsIgnoreCase(matkul)) {
            System.out.println("Mata Kuliah : " + jadwal[i][0]);
            System.out.println("Ruang       : " + jadwal[i][1]);
            System.out.println("Hari        : " + jadwal[i][2]);
            System.out.println("Jam         : " + jadwal[i][3]);
            ketemu = true;
            }
          }
          
          if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
      }
      static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
      
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 
      
        String[][] jadwal = new String[n][4];
      
        jadwal(jadwal, n);
        tampiljadwal(jadwal, n);
        
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        carihari(jadwal, n, hari);
        
        System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
        String mk = sc.nextLine();
        carimatkul(jadwal, n, mk);
        
          }
}