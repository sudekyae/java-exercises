//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calisan calisan = new Calisan("Sude",5000, "Donanım");
        calisan.bilgiGoster();

        System.out.println("\n");

        Yazilimci yazilimci = new Yazilimci("Mete", 10000, "Yazılım", "Java");
        yazilimci.bilgiGoster();

        System.out.println("\n");

        Tasarimci tasarimci = new Tasarimci("Miray", 20000, "Tasarım", "AI");
        tasarimci.bilgiGoster();

        System.out.println("\n");

        Yonetici yonetici = new Yonetici("Sema", 30000, "Yönetici", 25);
        yonetici.bilgiGoster();
    }

}