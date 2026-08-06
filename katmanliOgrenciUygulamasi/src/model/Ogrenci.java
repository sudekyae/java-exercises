package model;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int id;
    private int dogumTarihi;
    private int sinif;
    private double vizeNotu;
    private double finalNotu;

    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }

    public int getId(){
        return id;
    }

    public int getDogumTarihi(){
        return dogumTarihi;
    }

    public int getSinif(){
        return sinif;
    }

    public double getVizeNotu(){
        return vizeNotu;
    }

    public double getFinalNotu() {
        return finalNotu;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDogumTarihi(int dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public void setVizeNotu(double vizeNotu) {
        this.vizeNotu = vizeNotu;
    }

    public void setFinalNotu(double finalNotu) {
        this.finalNotu = finalNotu;
    }
}
