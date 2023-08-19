//SIMPLE CALCULATOR
import java.util.Scanner;
public class simplecalc{
    public static void main(String[]args)
    {   //taking inputs
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = calc.nextDouble();
        System.out.print("Enter the operation required : [+ , - , * , /] ");
        char op = calc.next().charAt(0);
        System.out.print("Enter the second number : ");
        double num2 = calc.nextDouble();
        //declaring a variable for result
        double result;
        calc.close();

        //using switch
        switch(op)
        {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("INVALID OPERATOR !");
                return;
        }
        System.out.println("RESULT : " + result);
        

}}