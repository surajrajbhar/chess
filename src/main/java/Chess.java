import java.util.List;
import java.util.Scanner;

public class Chess {

    public static void main(String args[]) {
        // Read input from keyboard
        // TODO: Add logger in place of System.out.println if time permits
        System.out.println("Enter piece name and position, expected format piece name, position");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            ChessPieceMovement chessPieceMovement = new ChessPieceMovement();
            List<String> movements = chessPieceMovement.getPieceMovement(input);
            movements.forEach(s -> System.out.print(s + ", "));
        }

    }


}
