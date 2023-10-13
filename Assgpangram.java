import java.util.Scanner;

public class Assgpangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check if it's a pangram: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPan(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPan(String input) {
        boolean[] alphabet = new boolean[26];

        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
