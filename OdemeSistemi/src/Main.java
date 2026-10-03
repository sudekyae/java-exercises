public class Main {
    public static void main(String[] args){

        Odeme[] odemeler = {
          new KrediKartiOdeme(),
                new HavaleOdeme(),
                new NakitOdeme()
        };

        for (Odeme odeme : odemeler) {
            odeme.odemeYap(100);
        }
    }
}
