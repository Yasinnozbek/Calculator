import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                    "1:Toplama\n" + "2:Bölme\n" + "3:Çıkış");
            String secim = scanner.nextLine();


            if (secim.equals("1")) {
                System.out.println("Toplamak istediğiniz iki sayıyı giriniz.");
                double sayi1 = scanner.nextDouble();
                double sayi2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Sonuç : " + (sayi1 + sayi2) + "\n**********************************");


            }

            else if (secim.equals("2")) {
                System.out.println("Bölmek istediğiniz iki sayıyı giriniz.");
                double sayi1 = scanner.nextDouble();
                double sayi2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Sonuç : " + (sayi1 / sayi2) + "\n**********************************");
            }

            else if (secim.equals("3")) {
                System.out.println("Çıkış yapılıyor...");
                break;

            } else {
                System.out.println("**********************************\n" + "Lütfen geçerli bir işlem seçiniz.");
            }
        }
    }
}