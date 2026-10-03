
public class Main {
    public static void main(String[] args) {

        double toplamAlan = 0;
        double enBuyukAlan = 0;
        Sekil enBuyukSekil = null;

        Sekil[] sekiller = {
                new Daire(1),
                new Dikdörtgen(10,5),
                new Ucgen(4,5,3,4,5)
        };

        for(Sekil sekil : sekiller){
            double  mevcutAlan = sekil.alanHesapla();
            toplamAlan += mevcutAlan;

            if(mevcutAlan > enBuyukAlan){
                enBuyukAlan = mevcutAlan;
                enBuyukSekil = sekil;
            }
        }

        System.out.println("Toplam Alan: " + toplamAlan);
        System.out.println("En Büyük Alan: " + enBuyukAlan);

        if(enBuyukSekil != null) {
            System.out.println("En Büyük Alanlı Şekil: " + enBuyukSekil.getClass().getSimpleName());
        }
    }
}
