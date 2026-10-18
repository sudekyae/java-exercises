package model;

public class Kahve {
    private String kahveAdi;
    private String boyut;
    private double fiyat;

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if(fiyat<=0){
            throw new IllegalArgumentException("Fiyat 0 TL veya negatif olamaz!");
        }
        this.fiyat = fiyat;
    }
}
