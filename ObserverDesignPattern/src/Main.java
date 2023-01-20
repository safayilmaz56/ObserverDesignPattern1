public class Main {
    public static void main(String[] args) {
        Urun urun1 = new Urun("bilgisayar",15000);
        Urun urun2 = new Urun("dolap",6500);

        Kullanici kullanici = new Kullanici();
        urun1.takipciEkle(kullanici);
        urun2.takipciEkle(kullanici);

        urun2.mesajiYayinla("fiyatim 6500 lira");
    }
}