public class Factorial {
    public static void main(String[] args) {
    int n;
    int i;
    
    for(n=1;n<=10;n++){
    int fact = 1;
        for(i=1;i<=n;i++)
    {
        fact *= i;
    }   
    
    System.out.println("Factorial of "+ n +"=" +fact);
     
   }
  }
}