import java.util.Scanner;

public class CommpandPrompt {


    /**
     * Avgör om talet är jämt eller udda
     * @param num
     */
    public void odd(int num){
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + num +  " is " + evenOdd);
    }

    /**
     * Hälsar till användaren
     */
    public void greeting(){
        System.out.println("Hello world!");
    }

    /**
     * Repeterar angiven text n antal gånger
     * @param text
     * @param repetition
     */

    public void repeat(String text, int repetition){
        while (repetition > 0){
            System.out.println(text);
            repetition--;
        }
    }


    public static double add(double firstNumber, double secondNumber)
    {
        double result = firstNumber + secondNumber;
        return result;
    }
    public static double sub(double firstNumber, double secondNumber)
    {
        double result = firstNumber - secondNumber;
        return result;
    }
    public static double mult(double firstNumber, double secondNumber)
    {
        double result = firstNumber * secondNumber;
        return result;
    }
    public static double div(double firstNumber, double secondNumber)
    {
        double result = firstNumber / secondNumber;
        return result;
    }

    public void options(){
        System.out.println("The following commands are valid:\n\n" +
                " calculate         Perform a simple mathematical calculation\n" +
                " calc              Same as 'calculate'\n" +
                " hello             Print greeting to screen\n" +
                " odd               Check if a certain number is odd or even\n" +
                " repeat            Repeat a given string a certain number of times\n" +
                " quit              Quit the program\n" +
                " q                 Quit the program");

    }
    public void calculate(){
        Scanner input = new Scanner(System.in);
        CommpandPrompt prompt = new CommpandPrompt();
        System.out.print("Operand 1: ");
        double operand1 = input.nextDouble();
        System.out.print("Operator: ");
        char  operator =input.next().charAt(0);
        System.out.print("Operand 2: ");
        double operand2 = input.nextDouble();
        prompt.add(operand1, operand2);
        if(operator == '+'){
            prompt.add(operand1, operand2);
            System.out.println("Addition of " + operand1 + "  and  " + operand2  + " is " +  prompt.add(operand1, operand2));
        } else if(operator == '-'){
            System.out.println(operand1 + " minus " + operand2  +  " is " + prompt.sub(operand1, operand2));
        } else if(operator == '*'){
            System.out.println(operand1 +  " times " + operand2 + " is " + prompt.mult(operand1, operand2));
        } else if(operator == '/'){
            System.out.println( operand1 + " divided by " + operand2 + " is " + prompt.div(operand1, operand2));
        } else{
            System.out.println("The choice is not valid! ");
        }
    }
}
