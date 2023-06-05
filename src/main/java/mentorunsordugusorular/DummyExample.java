package mentorunsordugusorular;

import java.util.Scanner;

public class DummyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String name = scanner.nextLine();
        System.out.print("Adınızı girin: ");
        String sorname = scanner.nextLine();
        // Dummy kod ekleyelim
       scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();

        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);

        scanner.close();
    }
}
