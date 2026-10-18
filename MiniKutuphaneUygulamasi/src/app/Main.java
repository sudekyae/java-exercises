package app;

import model.Kitap;
import service.KitapTanitimi;
import util.YardimciIsler;

public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap();
        KitapTanitimi tanitim = new KitapTanitimi();
        YardimciIsler yardimciIsler = new YardimciIsler();

        kitap.setKitapAdi("Küçük Prens");
        kitap.setYazar("Antoine de Saint-Exupéry");
        kitap.setSayfaSayisi(112);
        yardimciIsler.uzunlukHesapla(kitap);
        tanitim.kitapTanitimi(kitap);
    }
}