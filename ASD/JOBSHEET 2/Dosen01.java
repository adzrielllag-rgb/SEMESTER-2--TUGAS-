public class Dosen01 {
    String id;
    String nama;
    boolean statusAktif;
    int bergabung;
    String keahlian;


    Dosen01(String id, String nama, boolean statusAktif, int bergabung, String keahlian) {
        this.id = id;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.bergabung = bergabung;
        this.keahlian = keahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen       : " + id);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + statusAktif);
        System.out.println("Tahun Bergabung: " + bergabung);
        System.out.println("Bidang Keahlian: " + keahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - bergabung;
    }

    void ubahKeahlian(String bidang) {
        this.keahlian = bidang;
    }

    public static void main(String[] args) {
        Dosen01 dosen1 = new Dosen01("D001", "Dr. Andi", true, 2010, "Algoritma");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.ubahKeahlian("Basis Data");
        dosen1.setStatusAktif(false);
        dosen1.tampilInformasi();
    }
} 
  

