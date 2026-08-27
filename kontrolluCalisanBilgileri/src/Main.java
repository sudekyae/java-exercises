//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calisan calisan1 = new Calisan();

        calisan1.setAd("Sude");
        calisan1.setYas(21);
        calisan1.setMaas(45000);

        System.out.println("Ad: " + calisan1.getAd());
        System.out.println("Yaş: " + calisan1.getYas());
        System.out.println("Maaş: " + calisan1.getMaas());

        calisan1.zamYap(20);
        System.out.println("Zamlı maaş: "+calisan1.getMaas());

    }
}