public class HizliKargo extends Kargo{

    HizliKargo(int takipNumarasi, double agirlik) {
        super(takipNumarasi, agirlik);
    }

    @Override
    double ucretHesapla() {
        return agirlik*20;
    }

    @Override
    int tahminiTeslimSuresi() {
        return 1;
    }
}
