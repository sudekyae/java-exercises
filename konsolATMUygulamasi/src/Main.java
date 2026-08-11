import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int defaultSifre = 1234;
        int sifreHakki = 3;
        int sifre;
        boolean girisYapildi = false;

        System.out.println("⋆˚꩜｡──────────── ฅ^>⩊<^ฅ ───────────｡꩜˚⋆");
        System.out.println("   ♡ Kyae bank ATM'sine hoşgeldiniz ♡");
        System.out.println("    ♡ Dört haneli şifrenizi girin ♡");

        do {
            sifre = scanner.nextInt();
            scanner.nextLine();
            if (sifre != defaultSifre) {
                sifreHakki--;
                if (sifreHakki != 0) {
                    System.out.println("         ૮₍'˶• . • ⑅ ₎ა");
                    System.out.println("    Yanlış giriş yaptınız!\n    Lütfen tekrar deneyin ");
                    System.out.println("   Kalan deneme hakkınız: " + sifreHakki);
                } else {
                    System.out.println("\nBirden çok kez hatalı giriş yaptınız");
                    System.out.println("    !Hesabınız bloke olmuştur!  ");
                    break;
                }
            } else {
                girisYapildi = true;
            }
        } while (sifre != defaultSifre);

        if (girisYapildi) {
            int bakiye = 1000;
            int islem = 0;

            while (islem != 5) {
                System.out.println("\n⏔⏔⏔⏔⏔⏔ ꒰ ᧔ෆ᧓ ꒱ ⏔⏔⏔⏔⏔⏔");
                System.out.println("    1- Bakiye görüntüle");
                System.out.println("    2- Para yatır");
                System.out.println("    3- Para çek");
                System.out.println("    4- Havale yap");
                System.out.println("    5- Çıkış");
                System.out.println("⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔⏔");

                islem = scanner.nextInt();
                scanner.nextLine();

                switch (islem) {
                    case 1:
                        System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
                        break;

                    case 2:
                        int tutar;
                        do {
                            System.out.println("Yatırmak istediğiniz tutarı girin: ");
                            tutar = scanner.nextInt();
                            scanner.nextLine();
                            if (tutar <= 0) {
                                System.out.println("Geçersiz tutar! Lütfen 0'dan büyük bir miktar girin.");
                            } else {
                                bakiye += tutar;
                                System.out.println("Mevcut bakiye: " + bakiye + " TL");
                            }
                        } while (tutar <= 0);
                        break;

                    case 3:
                        int cekilecekTutar;
                        do {
                            System.out.println("Çekmek istediğiniz tutarı girin: ");
                            cekilecekTutar = scanner.nextInt();
                            scanner.nextLine();
                            if (cekilecekTutar <= 0) {
                                System.out.println("Geçersiz tutar! Lütfen 0'dan büyük bir miktar girin.");
                            } else if (cekilecekTutar > bakiye) {
                                System.out.println("Hesabınızda yeterli miktarda bakiye bulunmamaktadır!");
                            } else {
                                bakiye -= cekilecekTutar;
                                System.out.println("Kalan bakiye: " + bakiye + " TL");
                            }
                        } while (cekilecekTutar <= 0 || cekilecekTutar > bakiye);
                        break;

                    case 4:
                        int havaleUcreti = 5;
                        int havaleMiktari;
                        System.out.println("Hesap numarası girin: ");
                        int hesapNo = scanner.nextInt();
                        scanner.nextLine();
                        do {
                            System.out.println("Gönderilecek tutarı girin: ");
                            havaleMiktari = scanner.nextInt();
                            scanner.nextLine();
                            if (havaleMiktari <= 0) { 
                                System.out.println("Geçersiz tutar! Lütfen 0'dan büyük bir miktar girin.");
                            } else if (havaleMiktari + havaleUcreti > bakiye) {
                                System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır!");
                            } else {
                                bakiye -= (havaleMiktari + havaleUcreti);
                                System.out.println("｡ ₊°༺ İşleminiz başarıyla gerçekleştirilmiştir ༻°₊ ｡");
                                System.out.println("İşlem ücreti: " + havaleUcreti + " TL");
                                System.out.println("Alıcı hesap no: " + hesapNo);
                                System.out.println("Kalan bakiyeniz: " + bakiye + " TL");
                            }
                        } while (havaleMiktari <= 0 || havaleMiktari + havaleUcreti > bakiye);
                        break;

                    case 5:
                        System.out.println("      ฅ ^>⩊<^ ฅ");
                        System.out.println("   İyi günler diler, \n   yine bekleriz ♡");
                        break;

                    default:
                        System.out.println("Geçersiz bir seçim yaptınız, tekrar deneyin.");
                        break;
                }
            }
        }
        scanner.close();
    }
}