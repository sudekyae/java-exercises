//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package app;

import model.Ogrenci;
import util.NotHesaplama;
import service.OgrenciService;

public class Main {
    public static void main(String[] args) {
        OgrenciService ogrenciService = new OgrenciService();
        NotHesaplama notHesaplama = new NotHesaplama();

        Ogrenci ogr1 = new Ogrenci();
        ogr1.setId(1);
        ogr1.setAd("Sude");
        ogr1.setSoyad("Kaya");
        ogr1.setVizeNotu(50);
        ogr1.setFinalNotu(76);

        ogrenciService.ogrenciEkle(ogr1);
        double ortalama = notHesaplama.ortalama(ogr1);
        System.out.println(ogr1.getAd()+" isimli öğrencinin ortalaması: "+ortalama);
    }
}