import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Parolanızı girin: ");
        String parola = scanner.nextLine();

        boolean buyukHarfVar = false;
        boolean kucukHarfVar = false;
        boolean rakamVar = false;

        for(int i=0; i<parola.length(); i++){
            char karakter = parola.charAt(i);

            if(Character.isUpperCase(karakter)){
                buyukHarfVar = true;
            }
            if(Character.isLowerCase(karakter)){
                kucukHarfVar = true;
            }
            if(Character.isDigit(karakter)){
                rakamVar = true;
            }
        }

        if(parola.length()<8) System.out.println("Parola en az 8 karakterli olmalı!");
        if(parola.contains(" ")) System.out.println("Parola boşluk içeremez!");
        if(!buyukHarfVar) System.out.println("En az bir tane büyük harf içermeli!");
        if(!kucukHarfVar) System.out.println("En az bir tane küçük harf içermeli!");
        if(!rakamVar) System.out.println("En az bir tane rakam içermeli!");

        if(parola.length()>=8 && !parola.contains(" ") && buyukHarfVar && kucukHarfVar && rakamVar){
            System.out.println("Güçlü ve geçerli parola!");
        }
    }
}