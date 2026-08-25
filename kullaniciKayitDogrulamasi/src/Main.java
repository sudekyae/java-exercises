
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean emailDogru;
        boolean telefonDogru;
        boolean yasDogru;
        boolean parolaDogru;

        do {
            System.out.println("Emailinizi girin: ");
            String email = scanner.nextLine();
            emailDogru = emailGecerliMi(email);
            if(!emailDogru) System.out.println("Emailiniz hatalı! @ sembolünü unutmayın");
        }while(!emailDogru);

        do {
            System.out.println("Telefonunuzu girin: ");
            String telefon = scanner.nextLine();

            telefonDogru = telefonGecerliMi(telefon);
            if(!telefonDogru) System.out.println("Telefon numaranız hatalı! 10 rakam girin");

        }while (!telefonDogru );

        do {
            System.out.println("Yaşınızı girin: ");
            int yas = scanner.nextInt();
            scanner.nextLine();

            yasDogru = yasGecerliMi(yas);
            if(!yasDogru) System.out.println("Geçerli bir yaş girin!");

        }while (!yasDogru );

        do{
            System.out.println("Parolanızı girin: ");
            String parola = scanner.nextLine();

            parolaDogru = parolaGecerliMi(parola);
            if(!parolaDogru) System.out.println("Parolanız en az 8 karakter ve bir özel karakter içermelidir.");

        }while (!parolaDogru);

        scanner.close();
    }

    public static boolean emailGecerliMi(String email){
        if(email.contains("@")){
            return true;
        }
        return false;
    }

    public static boolean telefonGecerliMi(String telefon) {

        if (telefon.length() != 10) {
            return false;
        }
        for (int i = 0; i < telefon.length(); i++) {
            if (!Character.isDigit(telefon.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean yasGecerliMi(int yas){
        if(yas>=18 && yas<=100){
            return true;
        }
        return false;
    }

    public static boolean parolaGecerliMi(String parola) {
        if (parola.length() < 8) {
            return false;
        }

        int n = parola.length();
        boolean ozelKarakter = false;

        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(parola.charAt(i)) &&
                    !Character.isLetter(parola.charAt(i))) {
                ozelKarakter = true;
            }
        }
        if (ozelKarakter) {
            return true;
        }
        return false;
    }
}