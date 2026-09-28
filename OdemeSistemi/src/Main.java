//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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