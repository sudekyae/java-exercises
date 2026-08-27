public class BankaHesabi {
    String hesapSahibi;
    double bakiye;
    int hesapNumarasi;


    public void paraYatir(double miktar){
        if(miktar<=0){
            System.out.println("Geçerli bir tutar girin!");
            return;
        }
        bakiye += miktar;
        System.out.println("İşleminiz başarıyla gerçekleştirilmiştir.");
    }

    public void paraCek(double miktar) {
        if (miktar <= 0) {
            System.out.println("Geçerli bir tutar girin!");
            return;
        }

        if (miktar > bakiye) {
            System.out.println("Yetersiz Bakiye!");
            return;
        }

        bakiye -= miktar;
        System.out.println("İşleminiz başarıyla gerçekleştirilmiştir.");
    }

    public void transfer(BankaHesabi alici, double miktar) {
        if (miktar <= 0) {
            System.out.println("Gecersiz miktar!");
            return;
        }
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
            return;
        }

        bakiye -= miktar;
        alici.bakiye += miktar;

        System.out.println("Transfer basariyla gerceklestirildi.");
    }

    public void hesapOzeti() {
        System.out.println("Hesap sahibi: " + hesapSahibi);
        System.out.println("Hesap numarası: " + hesapNumarasi);
        System.out.println("Bakiye: " + bakiye);
    }
}
