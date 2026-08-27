//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Termostat termostat = new Termostat();

        termostat.setSicaklik(20);
        System.out.println("Sıcaklık: "+termostat.getSicaklik());

        termostat.sicaklikArtir(5);
        System.out.println("Sıcaklık: "+termostat.getSicaklik());

        termostat.sicaklikAzalt(30);
        System.out.println("Sıcaklık: "+termostat.getSicaklik());

        termostat.sicaklikAzalt(10);
        System.out.println("Sıcaklık: "+termostat.getSicaklik());

    }
}