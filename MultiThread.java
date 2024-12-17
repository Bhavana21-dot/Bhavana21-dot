import java.util.InputMismatchException;
import java.util.Scanner;
class Operation extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Add"))
			Add();
		else if(Thread.currentThread().getName().equals("Print"))
			Print();
		else
			Bank();
	}
	public void Add() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Task 1:Addition operation started");
			System.out.println("Enter the first number: ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number: ");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("The result is: "+res);
			System.out.println("Task 1:Addition operation completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
	public void Print() {
		try {
			System.out.println("Task 2:Printing Operation completed");
			for(int i=0;i<5;i++) {
				System.out.println("bhavana");
				Thread.sleep(2000);
			}
			System.out.println("Task 2:Printing Operation completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Bank() {
		try {Scanner sc=new Scanner(System.in);
			System.out.println("Task 3:Banking operation stared");
			System.out.println("Enter the account number:");
			int acc=sc.nextInt();
			System.out.println("Enter the pin code:");
			int pin=sc.nextInt();
			System.out.println("Account details recorded");
			System.out.println("Task 3:Banking operation completed");
		}
		catch(ArithmeticException e3) {
			e3.printStackTrace();
		}
		catch(InputMismatchException e4) {
			e4.printStackTrace();
		}
	}
}
public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		Operation op1=new Operation();
		Operation op2=new Operation();
		Operation op3=new Operation();

		Thread t1=new Thread(op1);
        Thread t2=new Thread(op2);
        Thread t3=new Thread(op3);

        t1.setName("ADD");
		t2.setName("Print");
		t3.setName("Bank");
        
		t1.start();
		t2.start();
		t3.start();

	}

}
