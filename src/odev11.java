import java.util.Scanner;

public class odev11 {
    public static void main(String[] args) {
        byte a;

        Scanner input = new Scanner(System.in);

        System.out.print("\nHava Sicakligini Giriniz :");
        a = input.nextByte();

        if (a < 5) {
            System.out.println("\nKayak Zamani Gelmis !!!");
        } else if (a >= 5 && a <= 15) {
            System.out.println("\nSinemaya Guzel Filmler Gelmis !!!");
        } else if (a > 15 && a <= 25) {
            System.out.println("\nMangal Kokusuda Var Havada !!!");
        } else {
            System.out.println("\nDenizin Sesi Buralara Kadar Geldi !!!");
        }

    }

}
