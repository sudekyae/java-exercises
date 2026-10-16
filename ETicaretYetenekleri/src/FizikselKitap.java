public class FizikselKitap implements Kargolanabilir, IadeEdilebilir{
    @Override
    public void iadeEdilebilir() {
        System.out.println("İade işlemi uygulandı.\n");
    }

    @Override
    public void kargolanabilir() {
        System.out.println("Kargoişlemi yapıldı.");
    }
}
