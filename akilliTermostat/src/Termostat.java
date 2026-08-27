public class Termostat {
    private int sicaklik;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        if(sicaklik<10 || sicaklik>30){
            System.out.println("Geçersiz sıcaklık değeri!");
            return;
        }

        this.sicaklik = sicaklik;
    }

    public void sicaklikArtir(int miktar){
        if(miktar<=0){
            System.out.println("Geçerli bir miktar girin!");
            return;
        }

        if(sicaklik+miktar>30){
            System.out.println("Geçersiz sıcaklık değeri!");
            return;
        }
        sicaklik+=miktar;
    }

    public void sicaklikAzalt(int miktar){
        if(miktar<=0){
            System.out.println("Geçerli bir miktar girin!");
            return;
        }

        if(sicaklik-miktar<10){
            System.out.println("Geçersiz sıcaklık değeri!");
            return;
        }
        sicaklik-=miktar;
    }
}
