import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CommpandPrompt prompt = new CommpandPrompt();

        String selection;

        do {
            System.out.print("Input> ");
            selection = input.next();
            switch (selection){
                case "help":
                    prompt.options();
                    break;
                case "calculate":
                case "calc":
                    prompt.calculate();
                    break;
                case "odd":
                case "Odd":
                    System.out.print("Enter an integer value: ");
                    int evenOrOdd = input.nextInt();
                    prompt.odd(evenOrOdd);
                    break;
                case "hello":
                    prompt.greeting();
                    break;
                case "repeat":
                    System.out.print("Enter a string: ");
                    String repeatStr = input.next();
                    System.out.print("Number of times to print the string: ");
                    int amountOfReoeat = input.nextInt();
                    prompt.repeat(repeatStr, amountOfReoeat);
                case "quit":
                case "q":
                    System.out.println("Goodbye! ");
                    break;
                default:
                    System.out.println("Command Unknown! \n");
                    prompt.options();
                    break;
            }
        }while (!selection.equals("quit") && !selection.equals("q"));

        System.out.println();
        System.out.println();

    }




}
