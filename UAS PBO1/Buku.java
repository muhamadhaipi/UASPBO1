public class Buku {

    // atribut buku
    private int id;
    private String judul; 
    private String penulis; 
    private int jumlah_halaman; 
    private double harga;
    
    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan");  
    }
    

    public void naikkanHarga(){
        System.out.println("harga naik");
    }
    public void naikkanHarga(double kenaikan){
        System.out.println("harga naik");
    }

   public void tampilkanDetailBuku(){
    System.out.println("ini method tampilkan detail buku");
   }

   public void tambahDiskon(){
    System.err.println("ini method diskon buku");
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlah_halaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlah_halaman = jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}