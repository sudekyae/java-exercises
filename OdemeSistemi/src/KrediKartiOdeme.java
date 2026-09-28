public class KrediKartiOdeme extends Odeme{

    @Override
    public void odemeYap(double tutar) {
        double sonTutar = tutar*102/100;
        System.out.println("Kredi kartı: "+sonTutar+" TL");
    }
}
