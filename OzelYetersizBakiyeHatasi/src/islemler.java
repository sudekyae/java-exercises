public class islemler {

    double bakiye = 500;

    public double getBakiye(){
        return bakiye;
    }

    public double paraYatir(double miktar){
        return bakiye += miktar;
    }

    public double paraCek(double miktar) throws YetersizBakiyeException {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            return bakiye;
        } else {
            throw new YetersizBakiyeException("Bakiye yetersiz!");
        }
    }

}
