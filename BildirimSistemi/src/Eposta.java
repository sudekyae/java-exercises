public class Eposta implements BildirimGonderebilir{

    @Override
    public void bildirimGonder(String mesaj) {
        System.out.println("Eposta: "+mesaj);
    }
}
