public class Kitap {
    String ad;
    String yazar;
    int sayfaSayisi;
    boolean oduncteMi;

    public void bilgileriGoster(){
        System.out.println("Kitap adı : "+ad);
        System.out.println("Yazar : "+yazar);
        System.out.println("Sayfa sayısı : "+sayfaSayisi);
        System.out.println("Kitap ödünçte mi : "+oduncteMi);
    }

    public void oduncVer(){
        oduncteMi = true;
    }

    public void iadeAl(){
        oduncteMi = false;
    }
}
