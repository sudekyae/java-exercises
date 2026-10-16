public class Sms implements BildirimGonderebilir{
    @Override
    public void bildirimGonder(String mesaj) {
        System.out.println("Sms: "+mesaj);
    }
}
