package service;

import model.Kahve;
import util.FiyatSiniflandirmasi;

public class SiparisTanitimi {

    public void SiparisTanitimi(Kahve kahve){
        Kahve kahve1 = new Kahve();
        FiyatSiniflandirmasi siniflandirma = new FiyatSiniflandirmasi();

        System.out.println("Kahve adı: "+kahve.getKahveAdi());
        System.out.println("Boyut: "+kahve.getBoyut());
        System.out.println("Fiyat: "+kahve.getFiyat()+" TL");
        System.out.println("Sınıf: "+ siniflandirma.siniflandirma(kahve));
    }
}
