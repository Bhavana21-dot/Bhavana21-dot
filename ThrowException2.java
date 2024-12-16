import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException2
{
    public static void main(String[] args) 
    {
        try
        {
            ShowException();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Exception from different function");
        }}
        @SuppressWarnings("resource")
        static void ShowException() {
               
                   try
                   { 
                    System.out.println("Division operation");
                       Scanner s=new Scanner(System.in);
                       System.out.println("Enter the numerator");
                       int n=s.nextInt();
                       System.out.println("Enter the denominator");
                       int d=s.nextInt();
                       int r=n/d;
                       System.out.println(r);
                   }
                   catch(InputMismatchException e)
                   {
                       throw e;
                   }
               }}
            
       
           
