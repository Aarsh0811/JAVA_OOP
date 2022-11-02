//Name: Aarsh Patel
//Assignment-1
//Semester-2

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int a = sm.nextInt();

        System.out.print("Enter second integer number: ");
        int b = sm.nextInt();

        System.out.print("Enter an arithmetic operator ( +, -, *, /) : ");
        String opt = sm.next();

        if(opt.equals("+")){
            System.out.print("Answer is: "+(a+b));
        }else if(opt.equals("-")){
            System.out.print("Answer is: "+(a-b));
        }else if(opt.equals("*")){
            System.out.print("Answer is: "+(a*b));

        }else if(opt.equals("/")){
            System.out.print("Answer is: "+(double)a/b);
        }else{
            System.out.println("Oops! Please enter valid operator :(");
        }
        
    }
    
}
