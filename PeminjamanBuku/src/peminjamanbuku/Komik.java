/**
 * class Komik dibuat dengan menggunakan konsep abstract class dan inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini berisi method yang mengoverride method abstarct yang ada di class Buku (konsep abstract).
 * Class ini juga mewarisi method tidak abstract yang ada di class Buku (konsep inheritance).
 * 
 * @author (Margfirah-2108107010021)
 * @version (19-11-2022)
 */
package peminjamanbuku;

public class Komik extends Buku{
    private String genre;
    private String jenis;

    public Komik(String genre, String jenis, String judul, String author, int halaman, String penerbit, int harga, int stok, int hargaperhari) {
        super(judul, author, halaman, penerbit, harga, stok, hargaperhari);
        this.genre = genre;
        this.jenis = jenis;
    }

    public String getGenre(){
        return genre;
    }

     public String getJenis(){
        return jenis;
    }

    @Override
    public String getJudul(){
        return super.getJudul();
    }
}