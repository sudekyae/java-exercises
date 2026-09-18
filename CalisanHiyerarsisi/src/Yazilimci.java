public class Yazilimci extends Calisan{

    String programlamaDili;

    Yazilimci(String ad, double maas, String departman, String programlamaDili){
        super(ad, maas, departman);
        this.programlamaDili = programlamaDili;
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Programlama dili: "+programlamaDili);
    }
}
