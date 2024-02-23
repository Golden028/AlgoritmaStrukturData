public class Buku11{
    String judul, pengarang;
    int harga, stok, halaman;

    void tampilinformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("pengarang: "+ pengarang);
        System.out.println("Jumlah Halaman: "+ halaman);
        System.out.println("Sisa Stok: "+ stok);
        System.out.println("Harga: "+ harga);
    }

    void terjual(int jml){
        if (stok >0){
            stok -= jml;
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiharga(int hrg){
        harga = hrg;
    }
    public Buku11(){

    }
    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}