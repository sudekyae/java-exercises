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
                        System.out.println("Yatırmak istediğiniz tutarı girin: ");
                        int tutar = scanner.nextInt();
                        scanner.nextLine();
                        if (tutar <= 0) {
                            System.out.println("Geçersiz tutar! Lütfen 0'dan büyük bir miktar girin.");
                        } else {
                            bakiye += tutar;
                            System.out.println("Mevcut bakiye: " + bakiye + " TL");
                        }
                        break;

                    case 3:
                        if (bakiye <= 0) {
                            System.out.println("Bakiyeniz 0 TL olduğu için para çekme işlemi yapamazsınız!");
                            break;
                        }
                        System.out.println("Çekmek istediğiniz tutarı girin: ");
                        int cekilecekTutar = scanner.nextInt();
                        scanner.nextLine();

                        if (cekilecekTutar <= 0) {
                            System.out.println("Geçersiz tutar! Lütfen 0'dan büyük bir miktar girin.");
                        } else if (cekilecekTutar > bakiye) {
                            System.out.println("Hesabınızda yeterli miktarda bakiye bulunmamaktadır!");
                        } else {
                            bakiye -= cekilecekTutar;
                            System.out.println("Kalan bakiye: " + bakiye + " TL");
                        }
                        break;

                    case 4:
                        int havaleUcreti = 5;
                        if (bakiye <= havaleUcreti) {
                            System.out.println("Bakiyeniz havale ücretini (5 TL) karşılamaya yetersiz!");
                            break;
                        }
                        System.out.println("Hesap numarası girin: ");
                        int hesapNo = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Gönderilecek tutarı girin: ");
                        int havaleMiktari = scanner.nextInt();
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