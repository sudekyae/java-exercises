import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] dizi = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Miktar: ");
        int miktar = scanner.nextInt();

        int[] yeniDizi = new int[5];

        for(int i=0; i<dizi.length; i++){
            yeniDizi[(i+miktar) % dizi.length] = dizi[i];
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Miktar: " + miktar);
        System.out.println("Sonuç: " + Arrays.toString(yeniDizi));
    }
}