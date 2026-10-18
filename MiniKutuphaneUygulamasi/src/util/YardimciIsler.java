package util;

import model.Kitap;

public class YardimciIsler {
    public String uzunlukHesapla(Kitap kitap) {
        if (kitap.getSayfaSayisi() < 200) {
            return "kısa kitap";
        } else {
            return "uzun kitap";
        }
    }
}
