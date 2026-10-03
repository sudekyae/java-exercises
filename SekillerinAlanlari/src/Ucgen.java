public class Ucgen extends Sekil{

    protected int yukseklik;
    protected int taban;
    protected int kenar1, kenar2, kenar3;

    Ucgen(int yukseklik, int taban,int kenar1, int kenar2, int kenar3){
        this.taban = taban;
        this.yukseklik = yukseklik;
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    public double alanHesapla() {

        double alan = taban * yukseklik / 2;

        return alan;
    }

    @Override
    public double cevreHesapla() {

        int cevre = kenar1 + kenar2 + kenar3;

        return cevre;
    }
}
