public class matakuliah01 {
  
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    matakuliah01(String kodeMK, String nama, int sks, int jumlahJam) { 
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        }
    }

    public static void main(String[] args) {
        matakuliah01 mk1 = new matakuliah01("MK001", "ASD", 3, 45);
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangiJam(10);
    }
}

