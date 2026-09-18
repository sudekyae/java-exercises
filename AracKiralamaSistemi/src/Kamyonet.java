public class Kamyonet extends Arac {

    Kamyonet(String plaka, String marka, int gunSayisi, double gunlukUcret) {
        super(plaka, marka, gunlukUcret, gunSayisi);
    }


    @Override
    void toplamUcretHesapla() {

        if (gunSayisi >= 3 && gunSayisi <= 5) {
            toplamUcret = (gunSayisi * gunlukUcret) * 95 / 100;
        }
        else if (gunSayisi > 5) {
            toplamUcret = (gunSayisi * gunlukUcret) * 80 / 100;
        }
        else {
            toplamUcret = gunSayisi * gunlukUcret;
        }
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
    }
}
