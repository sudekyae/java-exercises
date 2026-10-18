package app;

import model.Kahve;
import service.SiparisTanitimi;
import util.FiyatSiniflandirmasi;

public class Main {
    public static void main(String[] args) {
        Kahve kahve = new Kahve();
        FiyatSiniflandirmasi siniflandirma = new FiyatSiniflandirmasi();
        SiparisTanitimi siparisTanitimi = new SiparisTanitimi();

        kahve.setKahveAdi("Latte");
        kahve.setBoyut("Orta");
        kahve.setFiyat(150);

        siparisTanitimi.SiparisTanitimi(kahve);
    }
}