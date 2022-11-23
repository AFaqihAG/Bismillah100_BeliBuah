/**
 * class Pembelajaran dibuat dengan menggunakan konsep abstract class dan inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini berisi method yang mengoverride method abstarct yang ada di class Buku (konsep abstract).
 * Class ini juga mewarisi method tidak abstract yang ada di class Buku (konsep inheritance).
 * 
 * @author (Margfirah-2108107010021)
 * @version (19-11-2022)
 */
package peminjamanbuku;

public class Pembelajaran extends Buku{
    public String materi;
    public String tingkatan;

    public Pembelajaran(String materi, String tingkatan, String judul, String author, int halaman, String penerbit, int harga, int stok, int hargaperhari) {
        super(judul, author, halaman, penerbit, harga, stok, hargaperhari);
        this.materi = materi;
        this.tingkatan = tingkatan;
    }
    public void setDeskripsiBuku() {

    }
}