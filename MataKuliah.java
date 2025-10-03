public class MataKuliah {
    // Property (atribut)
    private String namaMK;
    private String kodeMK;
    private int sks;
    private String dosenPengampu;

    // Constructor
    public MataKuliah(String namaMK, String kodeMK, int sks, String dosenPengampu) {
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    // Getter (mengambil data)
    public String getNamaMK() {
        return namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public int getSks() {
        return sks;
    }

    public String getDosenPengampu() {
        return dosenPengampu;
    }

    // Setter (mengubah data)
    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setDosenPengampu(String dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    // Method tambahan
    public void tampilkanInfo() {
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Jumlah SKS       : " + sks);
        System.out.println("Dosen Pengampu   : " + dosenPengampu);
    }
}

// Class Main untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("Basis Data", "AA204", 3, "Ibu Darsih");

        // Menampilkan informasi mata kuliah
        mk1.tampilkanInfo();

        System.out.println("\nUpdate jumlah SKS");
        mk1.setSks(4);
        mk1.tampilkanInfo();
    }
}