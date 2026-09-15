//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Urun urun1 = new Urun("Kalem");
        System.out.println("Ürün: " +urun1.ad);

        Urun urun2 = new Urun("Defter", 12.5);
        System.out.println("Ürün: "+urun2.ad+" ,Fiyat: "+urun2.fiyat);

        Urun urun3 = new Urun("Kitap", 50.75,10);
        System.out.println("Ürün: "+urun3.ad+" ,Fiyat: "+urun3.fiyat+" ,Stok: "+urun3.stok);
    }
}