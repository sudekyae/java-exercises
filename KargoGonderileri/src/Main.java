//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double toplamUcret = 0;
        double toplamSure = 0;

        Kargo[] kargolar= {
                new StandartKargo(12345,23.4),
                new HizliKargo(23456, 5.34),
                new YurtDisiKargo(34567, 10)
        };

        for(Kargo kargo:kargolar){
            toplamUcret += kargo.ucretHesapla();
            toplamSure += kargo.tahminiTeslimSuresi();
        }

        double ortalamaSure = toplamSure / kargolar.length;

        System.out.println("Toplam Ücret: " + toplamUcret + " TL");
        System.out.printf("Ortalama Teslim Süresi: %.2f Gün\n", ortalamaSure);
    }
}