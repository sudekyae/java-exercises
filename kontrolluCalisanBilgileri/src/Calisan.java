public class Calisan {
    private String ad;
    private double maas;
    private int yas;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if (ad == null || ad.trim().isEmpty()) {
            System.out.println("Bu alan boş bırakılamaz!");
            return;
        }
        this.ad = ad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        if (maas <= 0) {
            System.out.println("Geçerli bir maaş girin!");
            return;
        }
        this.maas = maas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18 || yas>65){
            System.out.println("Geçersiz yaş!");
            return;
        }
        this.yas = yas;
    }

    public void zamYap(double yuzde) {
        if(yuzde<=0){
            System.out.println("Geçerli bir yüzde girin!");
            return;
        }
        double zam = (maas * yuzde) / 100;
        maas += zam;
    }
}
