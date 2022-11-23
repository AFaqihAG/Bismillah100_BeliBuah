/**
 * class Novel dibuat dengan menggunakan konsep abstract class dan inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini berisi method yang mengoverride method abstarct yang ada di class Buku (konsep abstract).
 * Class ini juga mewarisi method tidak abstract yang ada di class Buku (konsep inheritance).
 * 
 * @author (Margfirah-2108107010021)
 * @version (19-11-2022)
 */
public class Novel extends Buku{
    private String genre;

    public Novel(String genre, String judul, String author, int halaman, String penerbit, int harga, int stok, int hargaperhari) {
        super(judul, author, halaman, penerbit, harga, stok, hargaperhari);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String getJudul(){
        return super.getJudul();
    }
}