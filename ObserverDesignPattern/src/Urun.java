public class Urun extends TakipEdilen{
    private String urunAdi;
    private float fiyat;


    public Urun(String urunAdi, float fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public void mesajiYayinla(String mesaj){
        bilgilendir(urunAdi,mesaj);
    }
}
