public class HavaleOdeme extends Odeme{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Havale: "+(tutar+5)+" TL");
    }
}
