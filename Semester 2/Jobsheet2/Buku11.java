public class Buku11{
    String judul, pengarang;
    int harga, stok, halaman;

    public Buku11(){

    }
    public Buku11(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;        
    }
        void tampilinformasi(){
            System.out.println("Judul: "+ judul);
            System.out.println("pengarang: "+ pengarang);
            System.out.println("Jumlah Halaman: "+ halaman);
            System.out.println("Sisa Stok: "+ stok);
            System.out.println("Harga: "+ harga);
        }

        void terjual(int jml) {
            if (stok >0) {
              stok -= jml;
            } else {
                System.out.println("Stock habis.");
            }
        }

        void restock(int jml){
            stok += jml;
        }
        void gantiharga(int hrg){
            harga = hrg;
        }

        int hitungHargaTotal(int jml){
            return harga*jml;
        }
        int hitungDiskon(int jml){
            int diskon = 0;
            int hargaTotal = hitungHargaTotal(jml);
            if(hargaTotal>150000){
                diskon = (int)(0.12*hargaTotal);
            }else if(hargaTotal<150000 && hargaTotal>75000)
                diskon = (int)(0.05*hargaTotal);
            else
                diskon =0;
            return diskon;
        }
}