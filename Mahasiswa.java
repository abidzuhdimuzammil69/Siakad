public class Mahasiswa {
    // Property (atribut)
    private String nama;
    private String nim;
    private String jurusan;
    private int angkatan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    // Getter (mengambil data)
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    // Setter (mengubah data)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    // Method tambahan
    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Angkatan : " + angkatan);
    }
}

// Class Main untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Alfath", "2403026", "Teknik Informatika", 2024);

        // Menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();

        System.out.println("\nUpdate nama mahasiswa");
        mhs1.setNama("Shafira");
        mhs1.tampilkanInfo();
    }
}