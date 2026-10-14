public class Main {
    public static void main(String[] args) {

        Rapor[] raporlar = {
          new SatisRapor("SATIŞ RAPORU","Emel","12/10/2026"),
          new StokRapor("STOK RAPORU","Turan","13/10/2026"),
          new PersonelRapor("PERSONEL RAPORU","Fatma","14/10/2026")
        };

        for(Rapor rapor:raporlar){

            rapor.raporBasligiYazdir();
            rapor.raporOlustur();
            System.out.println("\n");
        }
    }
}