import java.util.Scanner;

class Dosen {
    public String kode;
    public String nama;
    public boolean jenisKelamin; 
    public int usia;
}

public class tugas1demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen arrayDosen[] = new Dosen[3];

        
        for (int i = 0; i < 3; i++) {
            arrayDosen[i] = new Dosen();

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            arrayDosen[i].kode = sc.nextLine();

            System.out.print("Nama           : ");
            arrayDosen[i].nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            
            arrayDosen[i].jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");

            System.out.print("Usia           : ");
            arrayDosen[i].usia = Integer.parseInt(sc.nextLine());

            System.out.println("-------------------------------------------");
        }

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode           : " + arrayDosen[i].kode);
            System.out.println("Nama           : " + arrayDosen[i].nama);

            
            System.out.println("Jenis Kelamin  : " + 
                (arrayDosen[i].jenisKelamin ? "Pria" : "Wanita"));

            System.out.println("Usia           : " + arrayDosen[i].usia);
            System.out.println("-------------------------------------------");
        }

        sc.close();
    }

    
}