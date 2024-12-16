import java.util.Scanner;

public class ThrowException 
{
    public static void main(String[] args) 
    {
        try
        {
            ShowException();
        }
        catch(ArithmeticException e)
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
                   catch(ArithmeticException e)
                   {
                       throw e;
                   }
               }}
            
       
           
