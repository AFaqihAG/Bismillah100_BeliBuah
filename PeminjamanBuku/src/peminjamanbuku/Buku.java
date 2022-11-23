package peminjamanbuku;

public abstract class Buku {
    String judul;
    String author;
    int halaman;
    String penerbit;
    int harga;
    int stok;
    int hargaperhari;

    public Buku(String j , String a , int h , String p, int x, int s, int y){
        this.judul = j;
        this.author = a;
        this.halaman = h;
        this.penerbit = p;
        this.harga = x;
        this.stok = s;
        this.hargaperhari = y;
    }

    abstract void setDeskripsiBuku();
}