package util;
import model.Kahve;

public class FiyatSiniflandirmasi {
    Kahve kahve = new Kahve();

    public String siniflandirma(Kahve kahve){
        if(kahve.getFiyat()<100){
            return "ekonomik";
        }else{
            return "premium";
        }
    }
}
