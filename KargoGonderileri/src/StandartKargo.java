public class StandartKargo extends Kargo{

    StandartKargo(int takipNumarasi, double agirlik) {
        super(takipNumarasi, agirlik);
    }

    @Override
    double ucretHesapla() {
        return agirlik*10;
    }

    @Override
    int tahminiTeslimSuresi() {
        if(agirlik<10){
            return 3;
        }else{
            return 7;
        }
    }
}
