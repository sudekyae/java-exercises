public class Otomobil {

    private Motor motor;

    public Otomobil(){
        motor= new Motor();
    }

    void hizlan(){
        if(motor.motorKapaliMi()){
            System.out.println("Otomobil çalışmıyor, hızlanamaz!");
        }else{
            System.out.println("Otomobil hızlandı!");
        }

    }

    void otomobiliArizalandir(){
        motor.motoruArizalandir();
    }

    void otomobiliCalistir(){
        motor.motoruCalistir();
    }

    void otomobiliDurdur(){
        motor.motoruDurdur();
    }

    void otomobilDurumunuGoster(){
        motor.motorDurumunuGoster();
    }
}
