import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your age here : ");

        try (Scanner scanner = new Scanner(System.in);) {
            int age = 0;
            String ageInput = scanner.nextLine();
            age = Integer.parseInt(ageInput);

            if (age > 18) {
                System.out.print("You are legal to do what your heart desires. Good luck");
            }

            if (age < 18) {
                if (age < 10) {
                    System.out.print("That is even more cute");
                } else {
                    System.out.print("That is so cute");
                }
            }

            if (age == 18) {
                System.out.print("Congrats on 18");
            }
        }
    }
}
