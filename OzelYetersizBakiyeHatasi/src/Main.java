public class Main {
    public static void main(String[] args) {
        islemler islemler = new islemler();
        System.out.println("Bakiye: "+islemler.getBakiye());

        islemler.paraYatir(90);
        System.out.println("Bakiye: "+islemler.getBakiye());

        try {
            islemler.paraCek(100);
        }catch (YetersizBakiyeException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Bakiye: "+islemler.getBakiye());

        try {
            islemler.paraCek(1000);
        }catch (YetersizBakiyeException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(islemler.getBakiye());

    }
}