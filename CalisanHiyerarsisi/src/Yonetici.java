public class Yonetici extends Calisan{

    int ekipBuyuklugu;

    Yonetici(String ad, double maas, String departman, int ekipBuyuklugu){

        super(ad, maas, departman);
        this.ekipBuyuklugu = ekipBuyuklugu;
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Ekip büyüklüğü: "+ekipBuyuklugu);
    }
}
