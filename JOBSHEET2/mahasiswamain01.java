public class Mahasiswamain01 {
    public static void main(String[] args) {

        Mahasiswa01 mhs1 = new Mahasiswa01();

        mhs1.nim = "15";
        mhs1.nama = "Adzriel Lazuardi Al-Ghozali";
        mhs1.kelas = "SIB 1E";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SIB 1E");
        mhs1.updateIpk(3.65);

        mhs1.tampilkanInformasi();

    }
}
