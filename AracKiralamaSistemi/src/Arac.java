public class Arac {

    protected String plaka;
    protected String marka;
    protected int gunSayisi;
    protected double gunlukUcret;
    protected double toplamUcret;

    Arac(String plaka, String marka, double gunlukUcret, int gunSayisi) {
        this.plaka = plaka;
        this.marka = marka;
        this.gunlukUcret = gunlukUcret;
        this.gunSayisi = gunSayisi;
    }

    void toplamUcretHesapla() {

        if (gunSayisi >= 3 && gunSayisi <= 5) {
            toplamUcret = (gunSayisi * gunlukUcret) * 90 / 100;
        }
        else if (gunSayisi > 5) {
            toplamUcret = (gunSayisi * gunlukUcret) * 70 / 100;
        }
        else {
            toplamUcret = gunSayisi * gunlukUcret;
        }
    }

    void bilgiGoster(){
        System.out.println("Plaka: "+plaka);
        System.out.println("Marka: "+marka);
        System.out.println("Gün sayısı: "+gunSayisi);
        System.out.println("Toplam tutar: "+toplamUcret+" TL");
    }
}
