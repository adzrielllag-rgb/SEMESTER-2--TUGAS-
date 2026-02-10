import java.util.Scanner;

public class prakpemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = sc.nextDouble();
        
        System.out.print("Masukkan nilai kuis : ");
        double nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUTS = sc.nextDouble();
        
        System.out.print("Masukkan nilai UAS : ");
        double nilaiUAS = sc.nextDouble();
        
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
            
            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            
            String status;
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
                nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || 
                nilaiHuruf.equals("C")) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            
            System.out.println("\n=== HASIL AKHIR ===");
            System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Status: " + status);
        }
        
        sc.close();
    }
    
  }