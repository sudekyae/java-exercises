package service;

import model.Kitap;
import util.YardimciIsler;

public class KitapTanitimi {

    public void kitapTanitimi(Kitap kitap){
        YardimciIsler yardimci = new YardimciIsler();
        String sonuc = yardimci.uzunlukHesapla(kitap);
        System.out.println(kitap.getYazar() + " tarafından kaleme alınan "+kitap.getKitapAdi()+" isimli kitap,\n"
                +kitap.getSayfaSayisi()+" sayfa olup "+sonuc+" kitaplar arasında yerini almıştır.");
    }
}
