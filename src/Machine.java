import java.util.Scanner;

public class Machine {
    public void menu() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int n1, n2;
        System.out.println("İşlem yapmak istediğiniz sayıları giriniz.");
        System.out.print("1.Sayı : ");
        n1 = scanner.nextInt();
        System.out.print("2.Sayı : ");
        n2 = scanner.nextInt();
        System.out.println("Yapmak isteğiniz işlemi seçiniz.");
        System.out.println("1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.print("Seçim : ");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println(calculator.plus(n1, n2));
                break;
            case 2:
                System.out.println(calculator.minus(n1, n2));
                break;
            case 3:
                System.out.println(calculator.multipliedBy(n1, n2));
                break;
            case 4:
                System.out.println(calculator.dividedBy(n1, n2));
                break;
            case 5:
                System.out.println(calculator.calcExponents(n1, n2));
                break;
            case 6:
                System.out.println(calculator.calcCombination(n1, n2));
                break;
            case 7:
                System.out.println(calculator.calcMode(n1, n2));
                break;
            case 8:
                calculator.rectangleAreaPerimeter(n1, n2);
                break;

        }
    }

}

