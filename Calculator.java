//command line calculator using conditionals
//this program only takes integer values (as inputs)

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int ans = 0;
        while (true) {
            // take operator as input 
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '/' || op == '%') {
                //taking two numbers as inputs
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if ( op == 'x' || op == 'X'){    //To exit() the program write 'x' or 'X' in operator input
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }    
}
