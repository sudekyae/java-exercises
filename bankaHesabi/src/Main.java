//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankaHesabi hesap1 = new BankaHesabi();
        BankaHesabi hesap2 = new BankaHesabi();

        hesap1.paraYatir(500);
        hesap1.hesapOzeti();

        hesap2.paraYatir(100);
        hesap2.hesapOzeti();

        hesap1.transfer(hesap2,200);
        hesap1.hesapOzeti();
        hesap2.hesapOzeti();

        hesap2.paraCek(10000);
    }
}