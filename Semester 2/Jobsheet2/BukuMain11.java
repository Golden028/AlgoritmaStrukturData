public class BukuMain11 {
  public static void main(String[] args) {
    Buku11 bk1 = new Buku11();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilinformasi();
    bk1.terjual(5);
    bk1.gantiharga(60000);
    bk1.tampilinformasi();

    Buku11 bk2 = new Buku11("Self Reward","Maheera Ayesha",160,29,59000);
    bk2.terjual(11);
    bk2.tampilinformasi();
    bk2.hitungHargaTotal(1);
  }
}