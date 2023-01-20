public class Kullanici extends Takipci{

    public void mesajiPaylas(String urun,String mesaj){
        System.out.println(urun+ " urunu mesaj paylasti "+ mesaj);
    }
    @Override
    void bilgiAl(String urun, String mesaj) {
        mesajiPaylas(urun,mesaj);
    }
}
