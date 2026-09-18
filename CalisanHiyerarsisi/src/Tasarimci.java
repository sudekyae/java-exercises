public class Tasarimci extends Calisan{

    String tasarimAraci;

    Tasarimci(String ad, double maas, String departman, String tasarimAraci){

        super(ad, maas, departman);
        this.tasarimAraci = tasarimAraci;
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Tasarım aracı: "+tasarimAraci);
    }
}
