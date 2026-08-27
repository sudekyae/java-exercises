//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap();
        Kitap kitap2 = new Kitap();

        kitap1.ad = "Beyaz Diş";
        kitap1.yazar = "Jack London";
        kitap1.sayfaSayisi = 200;
        kitap1.oduncteMi = false;

        kitap2.ad = "1984";
        kitap2.yazar = "George Orwell";
        kitap2.sayfaSayisi = 240;
        kitap2.oduncteMi = false;

        kitap2.bilgileriGoster();
        kitap2.oduncVer();
        kitap2.bilgileriGoster();
        kitap2.iadeAl();
        kitap2.bilgileriGoster();
    }
}