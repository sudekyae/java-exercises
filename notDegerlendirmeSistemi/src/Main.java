import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunuzu girin: ");
        double vizeNotu = scanner.nextDouble();

        System.out.println("Final notunuzu girin: ");
        double finalNotu = scanner.nextDouble();

        double ortalama = vizeNotu * 0.40 + finalNotu * 0.60;

        if (finalNotu < 50)
        {
            System.out.println("Kaldınız!");
        }
        else if(ortalama>=85){
            System.out.println("AA");
        }
        else if(84>=ortalama && ortalama>=70){
            System.out.println("BB");
        }
        else if(69>=ortalama && ortalama>=60)
        {
            System.out.println("CC");
        }
        else if(59>=ortalama && ortalama>=50)
        {
            System.out.println("DD");
        }
        else if(49>=ortalama && ortalama>=0)
        {
            System.out.println("FF");
        }

    }
}