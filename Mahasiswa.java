public class Mahasiswa {

    

    public String nama;
    public int nim;
    public String jurusan;


    public void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }


    public void ubahJurusan(String jurusanBaru) {
        jurusan = jurusanBaru;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

   
    public static void main(String[] args) {
     
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
    

    
}
