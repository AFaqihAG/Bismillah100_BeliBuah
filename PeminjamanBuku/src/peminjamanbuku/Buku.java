public class Buku {
    private String judul;
    private String author;
    private int halaman;
    private String penerbit;
    private int harga;
    private int stok;
    private int hargaperhari;

    public Buku() {
        
    }
    
    public Buku(String j , String a , int h , String p, int x, int s, int y){
        this.judul = j;
        this.author = a;
        this.halaman = h;
        this.penerbit = p;
        this.harga = x;
        this.stok = s;
        this.hargaperhari = y;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHalaman(int h) 
    {
        this.halaman = h;
    }
    
    public int getHalaman()
    {
        return this.halaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setHarga(int x) 
    {
        this.harga = x;
    }
    
    public int getHarga()
    {
        return this.harga;
    }

    public void setStok(int s) 
    {
        this.stok = s;
    }
    
    public int getStok()
    {
        return this.stok;
    }

    public void setHargaPerHari(int y) 
    {
        this.hargaperhari = y;
    }
    
    public int getHargaPerHari()
    {
        return this.hargaperhari;
    }
}