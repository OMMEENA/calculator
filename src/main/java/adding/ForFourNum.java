package adding;

import java.util.Scanner;

public class ForFourNum {
    public static void main(String[] args) {

        System.out.println(" WELCOME TO MY CALCULATOR ");
        int o = 0;
        System.out.println("for exit press ' = ' : ");
        do {

    Scanner operater = new Scanner(System.in);
    System.out.println("ENTER YOUR OPEATER +, -, *, /  ");
    char op = operater.next().charAt(0);

    System.out.println("enter you first number ");
    Scanner numb1 = new Scanner(System.in);
    int num1 = numb1.nextInt();

    System.out.println("enter you second number ");
    Scanner numb2 = new Scanner(System.in);
    int num2 = numb2.nextInt();

    System.out.println("enter you third number ");
    Scanner numb3 = new Scanner(System.in);
    int num3 = numb3.nextInt();

    System.out.println("enter you fourth number ");
    Scanner numb4 = new Scanner(System.in);
    int num4 = numb4.nextInt();

    double result;
    double res;

    //case

    switch (op) {
        case '+':
            result = num1 + num2 + num3 + num4;
            System.out.println("Result = " + result);
            break;

        case '-':
            result = num1 - num2 - num3 - num4;
            System.out.println("Result = " + result);
            break;

        case '*':
            res = num1 * num2;
            result = res * num3 * num4;
            System.out.println("Result = " + result);
            break;

        case '/':
            result = num1 / num2 / num3 / num4;
            System.out.println("Result = " + result);

            break;
        case '=':
            System.out.println();
            System.exit(0);
        default:
            System.out.print("Error! operator is not correct");
            return;
    }

   // System.out.println(num1 + " " + op + " " + num2 + " " + op + " " + num3 + " " + op + " " + num4 + " = " + result);

}while(o != 5 );
    }


}