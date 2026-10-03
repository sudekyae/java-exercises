public class Daire extends Sekil{

    protected double pi = 3.14;
    protected double yariCap;

    Daire(double yariCap){
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {

        double alan = pi*yariCap*yariCap;

        return alan;
    }

    @Override
    public double cevreHesapla() {

        double cevre = 2*pi*yariCap;

        return cevre;
    }
}
