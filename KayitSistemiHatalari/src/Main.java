//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.getAd("Sude");
        customerManager1.getSoyad("Kaya");
        customerManager1.getId();
        customerManager1.getMail("sudeekaya38@hotmail.com");
    }
}