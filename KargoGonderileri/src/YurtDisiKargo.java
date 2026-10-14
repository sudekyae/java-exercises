public class YurtDisiKargo extends Kargo{
    YurtDisiKargo(int takipNumarasi, double agirlik) {
        super(takipNumarasi, agirlik);
    }

    @Override
    double ucretHesapla() {
        return agirlik*25;
    }

    @Override
    int tahminiTeslimSuresi() {
        if(agirlik<10){
            return 10;
        }else{
            return 15;
        }
    }
}
