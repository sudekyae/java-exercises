public class Calisan {

    protected String ad;
    protected double maas;
    protected String departman;

    Calisan(String ad, double maas, String departman){
        this.ad = ad;
        this.maas = maas;
        this.departman = departman;
    }

    void bilgiGoster(){
        System.out.println("Ad: "+ad);
        System.out.println("Maaş: "+maas +" TL");
        System.out.println("Departman: "+departman);
    }
}
