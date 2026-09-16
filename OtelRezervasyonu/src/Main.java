
public class Main {
    public static void main(String[] args) {
        Rezervasyon r1 = new Rezervasyon("Ayşe",207,5,3000, Rezervasyon.OdaTipi.STANDART);
        r1.bilgileriGoster();

        //HATA FIRLATMALI KAYIT
        Rezervasyon r2 = new Rezervasyon("Fatma",555,10,100,Rezervasyon.OdaTipi.SUIT);
        r2.bilgileriGoster();
    }
}