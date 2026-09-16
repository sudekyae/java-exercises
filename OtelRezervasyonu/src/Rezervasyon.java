public class Rezervasyon {

    //enum -> bir değişkenin alabileceği değerleri sınırlandırmak için kullanılır.
    enum OdaTipi {
        STANDART,
        SUIT
    }

    String musteriAd;
    int odaNumarasi;
    int geceSayisi;
    double gecelikUcret;
    double toplamFiyat;
    OdaTipi odaTipi;

        Rezervasyon(String musteriAd, int odaNumarasi, int geceSayisi, double gecelikUcret, OdaTipi odaTipi){

        if(musteriAd == null || musteriAd.isBlank()){
            throw new IllegalArgumentException("Müşteri adı boş olamaz");
        }

        if(geceSayisi < 1) {
            throw new IllegalArgumentException("En az 1 gece kalınmalı!");
        }

        if(odaNumarasi < 101 || odaNumarasi > 500){
            throw new IllegalArgumentException("Oda numarası 101 ile 500 arasında olmalıdır!");
        }

        if(gecelikUcret <= 0){
            throw new IllegalArgumentException("Gecelik ücret 0'dan büyük olmalıdır!");
        }

        if(odaTipi == null){
            throw new IllegalArgumentException("Oda tipi boş bırakılamaz!");
        }

        this.musteriAd = musteriAd;
        this.odaNumarasi = odaNumarasi;
        this.geceSayisi = geceSayisi;
        this.gecelikUcret= gecelikUcret;
        this.odaTipi = odaTipi;

        this.toplamFiyat = toplamFiyatHesapla();

    }

    double toplamFiyatHesapla() {
        return geceSayisi * gecelikUcret;
    }

    void bilgileriGoster() {

        System.out.println("Müşteri Adı: " + musteriAd);
        System.out.println("Oda Numarası: " + odaNumarasi);
        System.out.println("Oda Tipi: " + odaTipi);
        System.out.println("Gece Sayısı: " + geceSayisi);
        System.out.println("Gecelik Ücret: " + gecelikUcret + " TL");
        System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");
    }
}
