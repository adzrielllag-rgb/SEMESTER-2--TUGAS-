public class Mahasiswa01 {

  String nim;
  String nama;
  String kelas;
  double ipk;

  void tampilkanInformasi() {
      System.out.println("NIM  :" + nim);
      System.out.println("NAMA  :" + nama);
      System.out.println("KELAS  :" + kelas);
      System.out.println("IPK  :" + ipk);
  }

  void ubahKelas(String kelasBaru) {
     kelas = kelasBaru;
  }

  void updateIpk(double ipkBaru) {
      ipk = ipkBaru;
  }

  String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
  
}

