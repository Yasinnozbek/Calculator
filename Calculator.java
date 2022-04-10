import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak istediğiniz iki sayıyı giriniz.");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        System.out.println("Toplam : " + (sayi1 + sayi2));
    }
}