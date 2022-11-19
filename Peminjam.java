/**
 * class Peminjam berisi data yang berhubungan dengan peminjam yang berkunjung. 
 * Class ini diposisikan sebagai user dalam mengakses jenis-jenis buku.
 * 
 * @author (Margfirah-2108107010021)
 * @version (19-11-2022)
 */
 
public class Peminjam
{
    //instance variables
    private String nama;
    private String NoHp;
    private int uang;

    /**
     * Constructor for objects of class
     */
    public Peminjam()
    {
        
    }
 
    /**
     * setNama untuk mengatur nama peminjam
     * @param nama untuk mengubah nama peminjam
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * getNama untuk mendapatkan nama peminjam
     * @return this.nama untuk mengembalikan informasi dasar dari nama peminjam
     */
    public String getNama()
    {
        return this.nama;
    }
        
    /**
     * setNoHp untuk mengatur nomor hp peminjam
     * @param nohp untuk mengubah nomor hp peminjam
     */
    public void setNoHp(String NoHp)
    {
        this.NoHp = NoHp;
    }
    
    /**
     * getNoHp untuk mendapatkan nomor hp peminjam
     * @return this.NoHp untuk mengembalikan informasi nomor hp peminjam
     */
    public String getNoHp()
    {
        return this.NoHp;
    }


    /**
     * setUang untuk menetapkan nilai uang peminjam
     * @param u sebagai inisialisasi untuk mengubah jumlah uang peminjam
     */
    public void setUang(int u)
    {
        this.uang = u;
    }

    /**
     * getUang untuk mendapatkan nilai jumlah uang peminjam
     * @return this.uang untuk mengembalikan informasi dasar uang peminjam
     */
    public int getUang()
    {
        return this.uang;
    }
}