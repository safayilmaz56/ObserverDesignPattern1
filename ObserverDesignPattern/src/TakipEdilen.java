import java.util.ArrayList;
import java.util.List;

public abstract class TakipEdilen {


    private List<Takipci> takipciler;

    public TakipEdilen() {
        takipciler = new ArrayList<>();
    }

    public void takipciEkle(Takipci takipci){
        takipciler.add(takipci);
    }
    public void takipciSil(Takipci takipci){
        takipciler.remove(takipci);
    }

   public void bilgilendir(String urun,String mesaj){
        for (Takipci takipci : takipciler){
            takipci.bilgiAl(urun,mesaj);
        }
   }

}
