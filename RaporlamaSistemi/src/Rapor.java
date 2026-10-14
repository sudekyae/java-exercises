public abstract class Rapor {

    String raporBasligi;
    String hazirlayanKullanici;
    String olusturulmaTarihi;

    Rapor(String raporBasligi, String hazirlayanKullanici, String olusturulmaTarihi){
        this.hazirlayanKullanici = hazirlayanKullanici;
        this.raporBasligi = raporBasligi;
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public void raporBasligiYazdir(){
        System.out.println("----"+raporBasligi+"----");
        System.out.println("Hazırlayan: "+hazirlayanKullanici);
        System.out.println("Tarih: "+olusturulmaTarihi);
        System.out.println("----------------------");
    }

    abstract void raporOlustur();
}
