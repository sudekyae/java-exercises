public class Urun {

    String ad;
    double fiyat;
    int stok;

    Urun(String ad){
        this.ad = ad;
    }

    Urun(String ad, double fiyat){
        this.ad = ad;
        this.fiyat = fiyat;
    }

    Urun(String ad, double fiyat, int stok){
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }
}
