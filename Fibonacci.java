public class Fibonacci {
   public static void main(String[] args) {
    int a=0;
    int b=1;
    
    
    System.out.print("Fibonacci up to 100: " + a + " " + b+ " ");
    int fibo=a+b;
    while (fibo<=100)
    {
     
     System.out.print(fibo + " ");
     a=b;
     b=fibo;
     fibo= a+b;   
       
    }

  }     

}