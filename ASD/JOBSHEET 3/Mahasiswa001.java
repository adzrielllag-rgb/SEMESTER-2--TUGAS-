import java.util.Scanner;

public class Mahasiswa001 {

  public String nim;
  public String nama;
  public String kelas;
  public float ipk;

  
  public static void main(String[] args) {

    Mahasiswa001 arrayOfMahasiswa [] = new Mahasiswa001[3];
    String dummy;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
    arrayOfMahasiswa[i] = new Mahasiswa001();

    System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
    System.out.print("NIM    : ");
    arrayOfMahasiswa[i].nim = sc.nextLine();
    System.out.print("Nama   : ");
    arrayOfMahasiswa[i].nama = sc.nextLine();
    System.out.print("Kelas  : ");
    arrayOfMahasiswa[i].kelas = sc.nextLine();
    System.out.print("IPK    : ");
    dummy = sc.nextLine();
    arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
    System.out.println("-------------------------------------------");
    }  

    for (int i = 0; i < 3; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
    System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
    System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
    System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
    System.out.println("-------------------------------------------");
    }
    
  }
}