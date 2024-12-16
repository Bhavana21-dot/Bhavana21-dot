import java.util.Scanner;

public class ThrowException1 
{
    public static void main(String[] args) 
    {
        try
        {
            ShowException();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception from different function");
        }}
        @SuppressWarnings("resource")
        static void ShowException() {
               
                   try
                   { 
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter the array size");
                    int n=s.nextInt();
                    int arr[]=new int[n];
                    System.out.println("Enter the position number: ");
                    int p=s.nextInt();
                    int val=s.nextInt();
                    arr[p]=val;
                   }
                   catch(ArrayIndexOutOfBoundsException e)
                   {
                       throw e;
                   }
               }}
            
       
           
