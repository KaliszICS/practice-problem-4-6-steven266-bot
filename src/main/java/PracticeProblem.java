import java.util.Scanner;

public class PracticeProblem {

  

    public static void main(String[] args) {
        intChecker();
        doubleChecker();
        booleanChecker();
        multipleIntChecker();
    }

    public static int intChecker() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input an integer: ");
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
            }
        }
    }

    public static double doubleChecker() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
            System.out.print("Input a number: ");
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (Exception e) {
            }
        }
    }

    public static boolean booleanChecker() {
        Scanner scanner = new Scanner(System.in);
    while (true) {
       
        System.out.print("Input a boolean: ");
        String input = scanner.nextLine();

        if (input.equals("true")) {
            return true;
        }
        if (input.equals("false")) {
            return false;
        }
    }
}

    public static boolean multipleIntChecker() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
       
        while (count < 4) {
            System.out.print("Input an integer: ");
            String input = scanner.nextLine();
            try {
                Integer.parseInt(input);
                count++;
            } catch (Exception e) {
            }
        }
        return true;
    }
}

