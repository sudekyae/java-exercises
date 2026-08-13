import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int islem;
        do{
            System.out.println("\nYapmak istediğiniz işlemi seçin");
            System.out.println("1-Öğrenci ekle");
            System.out.println("2-Öğrenci sil");
            System.out.println("3-Öğrenci ara");
            System.out.println("4-Tüm öğrencileri göster");
            System.out.println("5-Nota göre sırala");
            System.out.println("6-Çıkış");

            islem = scanner.nextInt();

            switch (islem) {
                case 1: System.out.println("Eklemek istediğiniz öğrencinin bilgilerini girin");
                System.out.println("id : ");
                int id;
                boolean ayniMi = false;
                do {
                    id = scanner.nextInt();
                    for (Ogrenci ogrenci : ogrenciler) {
                        if (ogrenci.id == id) {
                            ayniMi = true;
                            System.out.println("Bu id kayıtlı lütfen başka bir id girin!");
                            break;
                        }else{
                            ayniMi = false;
                        }
                    }
                }while(ayniMi);

                scanner.nextLine();
                System.out.println("Ad : ");
                String ad = scanner.nextLine();
                System.out.println("Soyad : ");
                String soyad = scanner.nextLine();
                System.out.println("Vize notu : ");
                int vizeNotu = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Final notu : ");
                int finalNotu = scanner.nextInt();
                scanner.nextLine();

                ogrenciler.add(new Ogrenci(id, ad, soyad, vizeNotu , finalNotu));
                System.out.println("Öğrenci başarıyla kaydedildi!");
                break;

                case 2:
                    System.out.println("Silmek istediğiniz öğrencinin id girin");
                    int ogrenciID = scanner.nextInt();
                    Ogrenci silinecekOgrenci = null;

                    for(Ogrenci ogrenci : ogrenciler){
                        if(ogrenciID == ogrenci.id){
                            silinecekOgrenci = ogrenci;
                            break;
                        }
                    }

                    if(silinecekOgrenci != null) {
                        ogrenciler.remove(silinecekOgrenci);
                        System.out.println("Öğrenci başarıyla silinmiştir.");
                    } else {
                        System.out.println("Silmek istediğiniz öğrenci bulunamamıştır.");
                    }
                    break;

                case 3:
                    System.out.println("Bulmak istediğiniz öğrencinin ID'sini girin:");
                    int arananId = scanner.nextInt();
                    scanner.nextLine();
                    Ogrenci arananOgrenci = null;
                    for(Ogrenci ogrenci : ogrenciler) {
                        if (arananId == ogrenci.id) {
                            arananOgrenci = ogrenci;
                            break;
                        }
                    }
                        if (arananOgrenci != null) {
                            System.out.println("Aranan öğrencinin adı: " + arananOgrenci.ad + "\nsoyadı:  " + arananOgrenci.soyad + "\nvize notu: " + arananOgrenci.vizeNot + "\nfinal notu: "+ arananOgrenci.finalNot);
                        }else{
                            System.out.println("Aradığınız öğrenci bulunmamaktadır.");
                            break;
                        }
                        break;


                case 4:
                    System.out.println("-------TÜM ÖĞRENCİLER-------");
                    for(Ogrenci ogrenci : ogrenciler){
                        System.out.println(ogrenci.ad + " "+ogrenci.soyad);
                    }
                    System.out.println("---------------------------------");
                    break;


                case 5:
                    if (ogrenciler.isEmpty()) {
                        System.out.println("Sıralanacak öğrenci bulunamadı.");
                    } else {
                        System.out.println("--- Sıralama Seçenekleri ---");
                        System.out.println("1- Vize Notu");
                        System.out.println("2- Final Notu");
                        int secim = scanner.nextInt();

                        if (secim == 1) {
                            // Not: Nesne listesini sıralamak için Comparator ve Lambda yapısı araştırılarak uygulandı.
                            // Java'da gelişmiş sıralama yöntemlerini öğrenme sürecindeyim
                            ogrenciler.sort(Comparator.comparingInt((Ogrenci o) -> o.vizeNot).reversed());
                            System.out.println("\n--- Vize Notuna Göre Sıralı Liste ---");
                            for (Ogrenci ogrenci : ogrenciler) {
                                System.out.println("Vize Notu: " + ogrenci.vizeNot + " | Ad: " + ogrenci.ad + " " + ogrenci.soyad);
                            }
                        } else if (secim == 2) {
                            ogrenciler.sort(Comparator.comparingInt((Ogrenci o) -> o.finalNot).reversed());
                            System.out.println("\n--- Final Notuna Göre Sıralı Liste ---");
                            for (Ogrenci ogrenci : ogrenciler) {
                                System.out.println("Final Notu: " + ogrenci.finalNot + " | Ad: " + ogrenci.ad + " " + ogrenci.soyad);
                            }
                        } else {
                            System.out.println("Geçersiz sıralama seçimi!");
                        }
                    }
                    break;

                case 6:
                    break;
            }
        }while(islem!=6);
    }
}