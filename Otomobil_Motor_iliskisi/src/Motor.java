public class Motor {

    private boolean kapaliMi = true;
    private boolean arizaliMi = false;

    public boolean motorArizaliMi(){
        return arizaliMi;
    }

    public boolean motorKapaliMi() {
        return kapaliMi;
    }

    public void motoruArizalandir() {
        arizaliMi = true;
        kapaliMi = true;
        System.out.println("Motor arızalandı!");
    }

    void motoruCalistir(){
        if(arizaliMi){
            System.out.println("Otomobil arızalı!");
        } else if (!kapaliMi) {
            System.out.println("Motor zaten çalışıyor!");
        }else {
            System.out.println("Motor çalışıyor!");
            kapaliMi = false;
        }
    }

    void motoruDurdur(){
        if(kapaliMi){
            System.out.println("Motor zaten kapalı!");
        }else {
            System.out.println("Motor durdu!");
            kapaliMi = true;
        }
    }

    void motorDurumunuGoster(){
        if (kapaliMi){
            System.out.println("Otomobil kapalı!");
        }else{
            System.out.println("Otomobil çalışıyor!");
        }
    }
}
