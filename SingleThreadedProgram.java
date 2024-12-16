import java.util.Scanner;

public class SingleThreadedProgram{

    public static void main(String[] args) throws Throwable {
        Scanner s=new Scanner(System.in);
        System.out.println("Task1: Addition opertaion started");
        System.out.println("Enter the first number ");
        int num1=s.nextInt();
        System.out.println("Enter the second number: ");
        int num2=s.nextInt();
        int res=num1+num2;
        System.out.println("Result is: "+res);
        System.out.println("Task 1:Addition operation completed");
        System.out.println("Task 2: printing operation Started");
        for(int i=0;i<5;i++){
            System.out.println("Bhavana");
            Thread.sleep(2000);

        }
        System.out.println("Task 2: printing operation completed");
        System.out.println("Task 2: printing operation Started");
        System.out.println("Enter the account number: ");
        int acc=s.nextInt();
        System.out.println("Enter the pin code: ");
        int pin=s.nextInt();
        System.out.println("Account details recorded");
        System.out.println("Task 3: Banking operation completed");
        }
}