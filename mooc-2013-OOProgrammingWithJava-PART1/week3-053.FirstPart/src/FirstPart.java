
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String text = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.print("Result: ");
        System.out.print(text.substring(0,length));

    }
}
