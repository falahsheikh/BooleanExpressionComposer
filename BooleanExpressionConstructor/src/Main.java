import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of variables in your boolean expression: ");
        int numVars = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numVars; i++) {
            System.out.print("X" + i + "\t");
        }
        System.out.println("Result");

        // now find the number of rows. this is done through 2^(user input:numVars)
        int numRows = (int) Math.pow(2, numVars);

        // create the truth table
        List<Integer> trueRows = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            // to generate truth values for every variable in the row, this is done:
            for (int col = 0; col < numVars; col++) {
                // Check the corresponding bit in the binary representation of the row
                int bit = (row >> col) & 1;
                System.out.print(bit + "\t");
            }

            // Get user input for true value
            System.out.print("\nEnter the true value for this row (true/false): ");
            boolean trueValue = scanner.nextBoolean();

            // Store the row number if the result is true
            if (trueValue) {
                trueRows.add(row);
            }
        }

        // Construct boolean expression based on rows that result in true
        if (!trueRows.isEmpty()) {
            System.out.print("Boolean expression for true rows: ");

            for (int i = 0; i < trueRows.size(); i++) {
                int row = trueRows.get(i);

                if (i > 0) {
                    System.out.print(" OR ");
                }

                System.out.print("(");
                for (int col = 0; col < numVars; col++) {
                    int bit = (row >> col) & 1;
                    if (bit == 1) {
                        System.out.print("X" + (col + 1) + " ");
                    } else {
                        System.out.print("¬X" + (col + 1) + " ");
                    }
                    if (col < numVars - 1) {
                        System.out.print("AND ");
                    }
                }
                System.out.print(")");
            }

            System.out.println();
        } else {
            System.out.println("No rows resulted in true. Cannot construct a boolean expression.");
        }

        scanner.close();
    }
}
