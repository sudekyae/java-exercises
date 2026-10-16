public class MobilUygulama implements BildirimGonderebilir{
    @Override
    public void bildirimGonder(String mesaj) {
        System.out.println("Mobil Uygulama: "+mesaj);
    }
}
