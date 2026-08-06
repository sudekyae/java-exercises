package util;

import model.Ogrenci;

public class NotHesaplama {

    public double ortalama(Ogrenci ogrenci){
        return (ogrenci.getVizeNotu()+ ogrenci.getFinalNotu())/2;
    }
}
