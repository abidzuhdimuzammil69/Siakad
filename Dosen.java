public class Dosen {
    String nama;
    String nip;
    String mataKuliah;
    int umur;
    String fakultas;

    public Dosen(String nama, String nip, String mataKuliah, int umur, String fakultas) {
        this.nama = nama;
        this.nip = nip;
        this.mataKuliah = mataKuliah;
        this.umur = umur;
        this.fakultas = fakultas;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar mata kuliah " + mataKuliah);
    }

    public void memberiNilai(String namaMahasiswa, String nilai) {
        System.out.println("Dosen " + nama + " memberi nilai " + nilai + " kepada mahasiswa " + namaMahasiswa);
    }

    public void bimbingan(String namaMahasiswa) {
        System.out.println("Dosen " + nama + " sedang membimbing " + namaMahasiswa);
    }

    public void tampilkanData() {
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama       : " + nama);
        System.out.println("NIP        : " + nip);
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Umur       : " + umur);
        System.out.println("Fakultas   : " + fakultas);
    }
}