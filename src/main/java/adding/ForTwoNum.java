package adding;
import java.util.Scanner;
public class ForTwoNum {

        public static void main(String args[]) throws Exception {
            System.out.println(" Welcome To My Calculator ");

            double num1, num2, num3, res;
                char choice, ch;
                Scanner scan = new Scanner(System.in);

                do
                {
                    //options
                    System.out.print("1. Addition\n");
                    System.out.print("2. Subtraction\n");
                    System.out.print("3. Multiplication\n");
                    System.out.print("4. Division\n");
                    System.out.print("5. Exit\n\n");
                    System.out.print("Enter Your Choice : ");
                    choice = scan.next().charAt(0);

                    switch(choice)
                    {
                         //for Addition
                        case '1' :
                            System.out.print("Enter Your First Number : ");
                            num1 = scan.nextFloat();
                            System.out.print("Enter Your Second Number : ");
                            num2= scan.nextFloat();
                            res = num1 + num2;
                            System.out.println("Result = " + res);
                            break;

                          //for Subtraction
                        case '2' :
                            System.out.print("Enter Your First Number : ");
                            num1 = scan.nextFloat();
                            System.out.print("Enter Your Second Number : ");
                            num2 = scan.nextFloat();
                            res = num1 - num2;
                            System.out.println("Result = " + res);
                            break;

                          //for Multiplication
                        case '3' :
                            System.out.print("Enter Your First Number : ");
                            num1 = scan.nextFloat();
                            System.out.print("Enter Your Second Number : ");
                            num2 = scan.nextFloat();
                            res = num1 * num2;
                            System.out.println("Result = " + res);
                            break;

                         //for Division
                        case '4' :
                            System.out.print("Enter Your First Number : ");
                            num1 = scan.nextFloat();
                            System.out.print("Enter Your Second Number : ");
                            num2 = scan.nextFloat();
                            res = num1 / num2;
                            System.out.println("Result = " + res);
                            break;

                         //for exit
                        case '5' :
                            System.out.println("THANK YOU");
                            System.exit(0);
                            break;

                            //for Wrong Entry
                            default : System.out.println("Wrong Choice!!!");
                            break;
                    }

                    System.out.print("\n--x--x--x--x-- OM MEENA --x--x--x--x--\n");

                }while(choice != 5);
            }
        }

