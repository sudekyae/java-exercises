public class Dikdörtgen extends Sekil{

    protected int uzunKenar;
    protected int kisaKenar;

    Dikdörtgen(int uzunKenar, int kisaKenarD){
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {

        int alan = uzunKenar * kisaKenar;

        return alan;
    }

    @Override
    public double cevreHesapla() {

        int cevre = 2*(kisaKenar + uzunKenar);

        return cevre;
    }
}
