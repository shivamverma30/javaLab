import java.util.Scanner;

// Custom Exception for Negative Marks
class NegativeMarksException extends Exception {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

// Custom Exception for Marks > 100
class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String msg) {
        super(msg);
    }
}

public class a51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
            System.out.println("Valid Marks: " + marks);
        } 
        catch (NegativeMarksException | MarksOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
            System.out.println("Validation complete.");
        }
    }

    static void validateMarks(int marks) throws NegativeMarksException, MarksOutOfRangeException {
        if (marks < 0)
            throw new NegativeMarksException("Marks cannot be negative!");
        else if (marks > 100)
            throw new MarksOutOfRangeException("Marks cannot exceed 100!");
    }
}
