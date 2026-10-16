import java.util.List;

public class Main {
    public static void main(String[] args) {

        //her classın yeteneklerini getirebilmek için kurgulandı(ai yardımı)

        List<Object> urunler = List.of(
                new FizikselKitap(),
                new EKitap(),
                new KisiyeOzelUrun()
        );

        for (Object urun : urunler) {
            System.out.println(urun.getClass().getSimpleName());

            for (Class<?> yetenek : urun.getClass().getInterfaces()) {
                System.out.println("- " + yetenek.getSimpleName());
            }
        }
    }
}