package model;

public class Kitap {
    private String kitapAdi;
    private String yazar;
    private int sayfaSayisi;


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        if(sayfaSayisi<=0){
            throw new IllegalArgumentException("Sayfa sayısı 0'dan büyük olmalı!");
        }

        this.sayfaSayisi = sayfaSayisi;
    }
}
