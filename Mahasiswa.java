public class Mahasiswa {
<<<<<<< HEAD

    
     // Atribut
    public String nama;
    public int nim;
    public String jurusan;

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }

    // Method untuk mengubah jurusan
    public void ubahJurusan(String jurusanBaru) {
        jurusan = jurusanBaru;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat object mahasiswa1
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Budi";
        mahasiswa1.nim = 12345;
        mahasiswa1.jurusan = "Teknik Informatika";

        mahasiswa1.tampilkanData();
        mahasiswa1.ubahJurusan("Sistem Informasi");

        // Membuat object mahasiswa2
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Ani";
        mahasiswa2.nim = 67890;
        mahasiswa2.jurusan = "Rekayasa Perangkat Lunak";

        mahasiswa2.tampilkanData();
    }
    

=======
    
    String Nama;
    String Nim;
    String Jurusan;
    String email;
>>>>>>> 2078349168e26f741c7e36b4bdad71d9eeb7c69e
    
}
