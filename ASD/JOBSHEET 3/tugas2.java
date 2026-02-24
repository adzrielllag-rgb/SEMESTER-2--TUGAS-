import java.util.Scanner;

public class tugas2   {

    public String kode;
    public String nama;
    public boolean jenisKelamin; 
    public int usia;

    
    public static void dataSemuaDosen(Dosen[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode           : " + arrayOfDosen[i].kode);
            System.out.println("Nama           : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin  : " + 
                (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------------------");
        }
    }

    
    public static void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    
    public static void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        double rataPria = countPria > 0 ? (double) totalPria / countPria : 0;
        double rataWanita = countWanita > 0 ? (double) totalWanita / countWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    
    public static void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        System.out.println("Kode           : " + tertua.kode);
        System.out.println("Nama           : " + tertua.nama);
        System.out.println("Jenis Kelamin  : " + 
            (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + tertua.usia);
    }

    
    public static void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        System.out.println("Kode           : " + termuda.kode);
        System.out.println("Nama           : " + termuda.nama);
        System.out.println("Jenis Kelamin  : " + 
            (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + termuda.usia);
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen[] arrayDosen = new Dosen[3];

        
        for (int i = 0; i < arrayDosen.length; i++) {
            arrayDosen[i] = new Dosen();
            
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            arrayDosen[i].kode = sc.nextLine();

            System.out.print("Nama           : ");
            arrayDosen[i].nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            arrayDosen[i].jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");

            System.out.print("Usia           : ");
            arrayDosen[i].usia = Integer.parseInt(sc.nextLine());
            
            System.out.println("-------------------------------------------");
        }
        
        
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        tugas2.dataSemuaDosen(arrayDosen);
        
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        tugas2.jumlahDosenPerJenisKelamin(arrayDosen);
        
        System.out.println("\n=== RERATA USIA PER JENIS KELAMIN ===");
        tugas2.rerataUsiaDosenPerJenisKelamin(arrayDosen);

        System.out.println("\n=== DOSEN PALING TUA ===");
        tugas2.infoDosenPalingTua(arrayDosen);

        System.out.println("\n=== DOSEN PALING MUDA ===");
        tugas2.infoDosenPalingMuda(arrayDosen);
        
        sc.close();
    }
}

